#!/bin/bash
set +x

BASE_DIR=`cd "$(dirname "$0")"; pwd`
cd "$BASE_DIR"/..

str1=${1:-temObjects}
str2=${2:-contem}

for f in $(find . -type f -name '*.java' | xargs grep -l $str1)
do
  sed "s/$str1/$str2/g" -i $f
done
