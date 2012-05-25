#!/usr/bin/python
from sys import argv

fin = open(argv[1],"r")
fout = open(argv[2],"rw")
result = {}

def process_line(line,result):
  [word,countStr] = line.split(",")
  count = int(countStr)
  try:
    result[word]+=count
  except KeyError:
    result.update({word:count})

for line in fout.readlines():
  process_line(line,result)

for line in fin.readlines():
  process_line(line,result)

for key,value in result.items():
  print key + "," + str(value)

fin.close()
fout.close()
