#!/usr/bin/bash

cd eldarback

./mvnw package && java -jar ./target/gs-spring-boot-docker-0.1.0.jar

cd.. 

docker-compose build

docker-compose up

