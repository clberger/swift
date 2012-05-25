#!/bin/bash

#Note: Paths to scripts must be given

python $2 $1 | python $3 | python $4
