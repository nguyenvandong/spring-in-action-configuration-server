FROM openjdk:8-jre-alpine
WORKDIR /
ADD target/configuration-server-0.0.1-SNAPSHOT.jar configuration-server.jar
CMD ["java", "-jar", "configuration-server.jar"]
