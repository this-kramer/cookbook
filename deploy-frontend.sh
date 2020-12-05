#!/bin/bash

IMAGE_NAME=thiskramerde/frontend
SERVICE_API_IP=$(ifconfig | grep -oE "\b([0-9]{1,3}\.){3}[0-9]{1,3}\b" | grep -ve 192.168.0.255 | grep -e 192 | xargs)
SERVICE_API_URL=http://$SERVICE_API_IP:8888

echo $SERVICE_API_IP
echo $SERVICE_API_URL

pushd recipe-frontend
docker build 
docker build --build-arg VUE_APP_API_URL=$SERVICE_API_URL -t thiskramerde/frontend .
docker run -p 8080:80 $IMAGE_NAME & 
