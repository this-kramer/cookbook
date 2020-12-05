#!/bin/bash

SERVICE_IMAGE_NAME

pushd recipe-service
./gradlew bootBuildImage --imageName=$SERVICE_IMAGE_NAME
docker run -p 8888:8080 $SERVICE_IMAGE_NAME
popd

pushd recipe-frontend
npm i
npm run serve

