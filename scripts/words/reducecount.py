#!/usr/bin/python
#reducecount.py - the reduce function for word counting
from sys import argv
from sys import stdin

#fin = open(argv[1],"r")

#print "w,c"
for line in stdin.readlines():
  [word,counts] = line.split(";")
  count = counts.split(',')
  totalCount = reduce((lambda x,y: x + int(y)),count,0)
  print word + "," + str(totalCount)
