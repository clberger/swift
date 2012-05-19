type messagefile; 
type countfile; 

app (countfile t) countwords (messagefile f) {   
     wc "-w" @filename(f) stdout=@filename(t);
}

string inputNames = "files/holmes.txt files/huckfinn.txt files/prince.txt files/tomsawyer.txt files/ulysses.txt";

messagefile inputfiles[] <fixed_array_mapper;files=inputNames>;

foreach f in inputfiles {
  countfile c<regexp_mapper;
	    source=@f,
            match="(.*)txt",
            transform="\\1count">;
  c = countwords(f);
}
