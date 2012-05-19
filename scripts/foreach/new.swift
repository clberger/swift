file images[]
//the data partition is handled by coasters after swift passes the script over

//the way that swift functions at the moment, this script will do the following:
//swift compiles the script to XML and passes it off to coasters, where:
//  -coasters will partition the data among the nodes (sending files)
//  -coasters will send out copies of the job to be run on the workers
//  -coasters will aggregate the result data, and bring it back to the master

//we need to abstract the following:
//  -map -> combiner==partitioner -> reduce for coasters to understand

//we can 
//1. write a program in swift that will do this style of programming without
//   any modification to existing code, or
//2. write an argument to swift in command line that will allow us to run a program
//   given specific function definitions in the style we want below:


//map step
foreach image in images[] {
  app { convertToGray @image }
}

file nodes[]<customMapper1>

//reduce step
foreach node in nodes[] {
  app { combiner @node }
}

file nodeResults[]<customMapper2>

app { reducer nodeResults[] }
