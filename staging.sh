#!/usr/bin/env bash

mkdir -p sync/staging

rsync -avq --delete resources/*html sync/staging

mkdir -p sync/staging/js

rsync -avq --delete resources/public/js/whitespace/*js sync/staging/js

s3cmd sync sync/staging/ s3://staging.bibleplan.twonegatives.com/
