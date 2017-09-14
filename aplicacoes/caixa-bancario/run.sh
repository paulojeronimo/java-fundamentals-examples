#!/bin/bash
set +x

class=AtendimentoCaixa
lib=../../orientacao-a-objetos

java -cp ".;$lib" $class "$@"
