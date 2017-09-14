#!/bin/bash
set +x

javaFile=AtendimentoCaixa.java
lib=../../orientacao-a-objetos

cd $lib
javac util/Pilha.java
javac entidades/*.java

cd - >/dev/null
javac -cp ".;$lib" $javaFile
