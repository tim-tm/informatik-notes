#!/bin/sh

set -xe

cd build
cp ../refs.bib .
bibtex informatiknotes
