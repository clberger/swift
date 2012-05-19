import re
from sys import argv

fin = open(argv[1],"r+")

for raw in fin.read().split():
  word=re.search('\w+',raw)
  try:
    print word.group(0)+","+"1"
  except AttributeError:
    pass

fin.close()
