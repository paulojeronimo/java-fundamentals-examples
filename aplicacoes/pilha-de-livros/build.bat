@echo off

set lib=../../orientacao-a-objetos
set var=%cd%
cd %lib%
javac util/Pilha.java
javac entidades/*.java

cd %var%
javac -cp ".;%lib%" TestaPilhaDeLivros.java
