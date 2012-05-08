
type file;

app (file o) catnap (string _delay, file i)
{
 catnap _delay @i stdout=@o;
}

string delay=@arg("s","1");
file data[]<array_mapper; files=["indir/data1.txt","indir/data2.txt","indir/data4.txt","indir/data4.txt"]>;

file out[]<array_mapper; files=["/tmp/outdir/out1.data","/tmp/outdir/out2.data","/tmp/outdir/out3.data","/tmp/outdir/out4.data"]>;

foreach o, j in out {
 out[j] = catnap(delay,data[j]);
}

