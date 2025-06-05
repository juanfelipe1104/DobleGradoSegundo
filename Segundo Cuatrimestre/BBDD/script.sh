#!/bin/bash

mysql -u juan -p < function.sql > result.txt

cat result.txt
