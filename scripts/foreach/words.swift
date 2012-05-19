// Distributed Reduce map-reduce (key,value): Proof-of-concept
// This swift script implements a distributed reduce via passing
// implemented instances of the map,reduce, and combine functions to
// coasters, which in turn will allocate all three on a single worker node.

type inputfile;
type shellfile;
type pythonfile;
type reducefile;
type resultfile;
type word {
  string w;
  int c;
}
type fullcount {
  word words[];
}

//type mapfile;
//type combinefile;
//atomic function headers for map-reduce style program
//map function: file -> (string,integer)
/*
app (mapfile m) mapInstance(inputfile f) {
  python countwords.py @filename(f) stdout=@filename(m);
}
//combiner function: (string, integer) -> (string, int list) 
app (combinefile c) combineInstance(mapfile m) {
  python combinecount.py @filename(m) stdout=@filename(c);
}
//reduce function: (string, int list) -> (string, integer)
app (reducefile r) reduceInstance(combinefile c) {
  python reducecount.py @filename(c) stdout=@filename(r);
}

//compound procedure wrapping atomic functions
//this should guarantee atomicity, so that each step is sequential
(reducefile r) mapreduceStack(inputfile f) {
  mapfile m;
  combinefile c;
  m = mapInstance(f);
  c = combineInstance(m);
  r = reduceInstance(c);
}

//aggregate function: (string,integer) -> (string, integer) list -> (string, integer) list
app (resultfile res_end) aggregate (reducefile r, resultfile res_start) {
  python returnvals.py @filename(r) @filename(res_start) stdout=@filename(res_end);
}
*/


//code for running python in shell
app (reducefile sout) runmapreduce(shellfile shellscript, inputfile f, pythonfile map, pythonfile combine, pythonfile reduce){
      shell "source" @shellscript @f @map @combine @reduce stdout=@filename(sout);
}
app (resultfile sout) runaggregate(shellfile shellscript, pythonfile aggregate, reducefile r, resultfile res) {
      shell "source" @shellscript @filename(aggregate) @filename(r) @filename(res) stdout=@filename(sout);
}
shellfile mapreduce_shell_script<single_file_mapper;file="mapreduce.sh">;
//shellfile aggregate_shell_script<single_file_mapper;file="aggregate.sh">;
pythonfile map_fun<single_file_mapper;file="mapcount.py">;
pythonfile combine_fun<single_file_mapper;file="combinecount.py">;
pythonfile reduce_fun<single_file_mapper;file="reducecount.py">;
pythonfile aggregate_fun<single_file_mapper;file="aggregatecount.py">;

inputfile inputfiles[] <filesys_mapper;files="files/*.txt">;
resultfile result<single_file_mapper;file="result.txt">;

//function to copy from result to result
app (resultfile output) cat(resultfile input) {
     cat @filename(input) stdout=@filename(output);
}

/*
this is where the distributed map (combine, and reduce) will occur
right now, it's being implemented by the user who is aware of map-reduce
capability of the program using (key,value) compositions.
*/

//TODO: implement a map-reduce framework on alternate functionalities
//and modify swift to take more structural approaches to map-reduce

/*TODO: fix issue with granularity
 right now, the map-reduce is done on the granularity of files,
 what we want is for this to be made coarser, or in other words,
 produce an aggregate reduce file for all files on a given node,
 not multiple files per node.  This requires modification of the language
 to include an aggregate function to run at the end of the script
*/

foreach f in inputfiles {
  /*
    mapfile m<regexp_mapper;
              source=@f,
                match="(.)txt",
                transform="\\1map">;
    m = mapInstance(f);
    combinefile c<regexp_mapper;
                  source=@f,
                    match="(.)map",
                    transform="\\1combine">;
    c = combineInstance(m);
  */
  reducefile r<regexp_mapper;
               source=@f,
                 match="(.*)txt",
                 transform="\\1reduce">;
  //r = mapreduceStack(c);
  r = runmapreduce(mapreduce_shell_script,f,map_fun,combine_fun,reduce_fun);

}



//NOTE: the last function is where we're having trouble figuring out where
//  and how to modify either swift or coasters to return the files without causing
//  any unnecessary file juggling/transfer overhead
/*
inputfile reducefiles[]<filesys_mapper;files="files/*.reduce">;

for r in reducefiles {
  //this function should pass the file back to the master node, and add to the total
  result = runaggregate(aggregate_shell_script,aggregate_fun,r,result);
  //result = cat(resulttemp);
}
*/

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

