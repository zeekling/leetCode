#!/usr/bin/env bash
#author:zeekling

echo "compiling"
if [ ! -d target ];then
	mkdir target
else
	rm -rf target/*
fi
file=`find -name "*.java"`
echo "copying file"
all=`find -name "*"`

javac -g -source 8 -target 8 -d ./target/ ${file} -encoding UTF-8 &&
echo -e "\033[32mcompile finish *_*\033[0m \033[37m" ||
echo -e "\033[31mcompile error \033[0m \033[37m"
