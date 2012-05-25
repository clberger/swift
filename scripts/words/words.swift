// Distributed Reduce map-reduce (key,value): Proof-of-concept
// This swift script implements a distributed reduce via passing
// implemented instances of the map,reduce, and combine functions to
// coasters, which in turn will allocate all three on a single worker node.

type inputfile;
type shellfile;
type exefile;
type reducefile;
type resultfile;
type word {
  string w;
  int c;
}
type fullcount {
  word words[];
}

//input files
inputfile inputfiles[] <filesys_mapper;location="files/",suffix=".txt">;
resultfile result<single_file_mapper;file="result.txt">;


shellfile mapreduce_shell_script<single_file_mapper;file="mapreduce.sh">;
shellfile aggregate_shell_script<single_file_mapper;file="aggregate.sh">;
exefile map_fun<single_file_mapper;file="mapcount.py">;
exefile combine_fun<single_file_mapper;file="combinecount.py">;
exefile reduce_fun<single_file_mapper;file="reducecount.py">;
exefile aggregate_fun<single_file_mapper;file="aggregatecount.py">;

//code for running python in shell
app (reducefile sout) runmapreduce(shellfile shellscript, inputfile f, exefile map, exefile combine, exefile reduce){
      shell @shellscript @f @map @combine @reduce stdout=@filename(sout);
}
app (resultfile sout) runaggregate(shellfile shellscript, exefile aggregate, reducefile r, resultfile res) {
      shell @shellscript @filename(aggregate) @filename(r) @filename(res) stdout=@filename(sout);
}

//function to copy from result to result
app (resultfile output) cat(resultfile input) {
     cat @filename(input) stdout=@filename(output);
}


//TODO: implement a map-reduce framework on alternate functionalities
//and modify swift to take more structural approaches to map-reduce

/*TODO: fix issue with granularity
 right now, the map-reduce is done on the granularity of files,
 what we want is for this to be made coarser, or in other words,
 produce an aggregate reduce file for all files on a given node,
 not multiple files per node.  This requires modification of the language
 to include an aggregate function to run at the end of the script
*/

/*
this is where the distributed map (combine, and reduce) will occur
right now, it's being implemented by the user who is aware of map-reduce
capability of the program using (key,value) compositions.
*/
foreach f in inputfiles {

  reducefile r<regexp_mapper;
               source=@f,
                 match="(.*)txt",
                 transform="\\1reduce">;
  r = runmapreduce(mapreduce_shell_script,f,map_fun,combine_fun,reduce_fun);

}


//NOTE: the last function is where we're having trouble figuring out where
//  and how to modify either swift or coasters to return the files without causing
//  any unnecessary file juggling/transfer overhead
reducefile reducefiles[]<filesys_mapper;files="files/*.reduce">;

foreach r in reducefiles {
  resultfile resulttemp<single_file_mapper;file="resulttemp.txt">;
  //this function should pass the file back to the master node, and add to the total
  resulttemp = runaggregate(aggregate_shell_script,aggregate_fun,r,result);
  result = cat(resulttemp);
}

//TODO: feed the reduce function all the files in a list, to open in sequence
/*
inputfile allreduce<single_file_mapper;file="reduce_list.txt">;
foreach f in reducefiles {
}
app (inputfile res) resultList (inputfile f, inputfile list) {
  cat @filename(list);
  echo @filename(f);
  @stdout=@filename(res);
}
*/

