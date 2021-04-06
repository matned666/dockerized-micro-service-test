#!/bin/bash

sudo docker-compose down

cd client || exit
sudo mvn clean package -o -Dmaven.test.skip=true
cd .. || exit

cd credit || exit
sudo mvn clean package -o -Dmaven.test.skip=true
cd .. || exit

cd product || exit
sudo mvn clean package -o -Dmaven.test.skip=true
cd .. || exit

sudo docker-compose up --force-recreate --build
