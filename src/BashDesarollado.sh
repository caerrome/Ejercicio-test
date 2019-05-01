#!/bin/bash
echo "Archivo generado en Windows, a falta de prueba"

wget http://samplecsvs.s3.amazonaws.com/Sacramentorealestatetransactions.csv
wc -l Sacramentorealestatetransactions.csv
head -n10 Sacramentorealestatetransactions.csv
tail -n10 Sacramentorealestatetransactions.csv
grep "Multi-Family" Sacramentorealestatetransactions.csv
