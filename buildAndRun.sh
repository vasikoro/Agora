#!/bin/sh
mvn clean package && docker build -t org.example/Agora .
docker rm -f Agora || true && docker run -d -p 8080:8080 -p 4848:4848 --name Agora org.example/Agora 
