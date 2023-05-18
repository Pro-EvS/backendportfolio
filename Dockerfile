FROM amazoncorretto:17

MAINTAINER evelyn_admin

COPY ./target/portfolio1-0.0.1-SNAPSHOT.jar app.jar


ENTRYPOINT ["java", "-jar", "app.jar"]

