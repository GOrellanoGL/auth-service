# auth-service

# MongoDB

Create and start the MongoDB container:
* run command in terminal: docker-compose up --build

# Test auth-service
* Run server-config
* Run registry-server
* Run auth-service
* Start MongoDB docker container

# Postman
* POST - http://localhost:8080/uaa/oauth/token
* Body (x-www-form-unrlencoded): key=grant_type value=password; key=username value=randomuser; key=password value=1234

# Testing
* Check generated tokens on MongoDB with Mongo Express -> http://localhost:10081

