#!/bin/bash
sudo docker-compose down
sudo mvn clean install -Dmaven.test.skip=true
sudo docker-compose up --build
