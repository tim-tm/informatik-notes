#!/bin/sh

echo on

mkdir -p build
pdflatex -aux-directory=build -output-directory=build informatiknotes.tex
