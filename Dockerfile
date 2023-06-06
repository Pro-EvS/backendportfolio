FROM  amazoncorretto:17-alpine-jdk
MAINTAINER Evelyn 
COPY target/portfolio1-0.0.1-SNAPSHOT.jar  evy-port-app.jar
ENTRYPOINT  ["java","-jar","/evy-port-app.jar"]
