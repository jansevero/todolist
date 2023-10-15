FROM ubuntu:latest AS build

RUN apt-get update
RUN aprt-get install openjdk-17-jdk -y

COPY . .

RUN apt-get install maven -y
RUN mvn clean install