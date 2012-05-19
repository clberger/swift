#combinecount.py - the combiner function for word counting
from sys import argv
from sys import stdin
#fin = open(argv[1],"r")
aggregates = {}

for line in stdin.readlines():
  [word,countStr] = line.split(",")
  count = int(countStr)
  try:
    aggregates[word].append(count)
  except KeyError:
    aggregates.update({word:[count]})

for key,value in aggregates.items():
  s = key + ";"
  for v in value:
    s+=str(v)+","
  #dirty hack to append 0 to the end
  s+="0"
  print s
