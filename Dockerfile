FROM java:8
FROM maven:alpine

WORKDIR /app

COPY . /app

RUN mvn -v
RUN mvn clean install -DskipTests
EXPOSE 8080
LABEL maintainer=“Vintoniuk93@gmail.com”
ADD ./target/tournament-simulation-1.0-SNAPSHOT.jar tournament-simulation-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","tournament-simulation-1.0-SNAPSHOT.jar"]