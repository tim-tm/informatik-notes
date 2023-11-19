#!/bin/sh

echo on

mkdir -p build
mkdir -p build/includes
pdflatex -aux-directory=build -output-directory=build informatiknotes.tex
