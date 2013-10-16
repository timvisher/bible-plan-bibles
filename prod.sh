#!/usr/bin/env bash

mkdir -p sync/prod

rsync -avq --delete resources/*html resources/js/*js sync/prod

mkdir -p sync/prod/js

rsync -avq --delete resources/public/js/*js sync/prod/js

s3cmd sync sync/prod/ s3://bibleplan.twonegatives.com/
