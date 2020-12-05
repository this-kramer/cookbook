#!/bin/bash

SERVICE_IMAGE_NAME=thiskramerde/recipe-service

pushd recipe-service
./gradlew bootBuildImage --imageName=$SERVICE_IMAGE_NAME
docker run -p 8888:8080 $SERVICE_IMAGE_NAME &

