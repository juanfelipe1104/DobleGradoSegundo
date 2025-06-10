#!/bin/bash

mysqldump -u juan -p --result-file=/home/juan/backups/estructura_university.sql --no-data --databases university

mysqldump -u juan -p --result-file=/home/juan/backups/estructura_university.sql --no-create-info --databases university