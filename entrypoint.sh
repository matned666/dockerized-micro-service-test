#!/bin/bash

docker-compose down

mvn clean package -Dmaven.test.skip=true

docker-compose up --build
