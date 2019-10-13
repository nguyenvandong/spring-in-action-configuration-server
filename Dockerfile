FROM openjdk:8-jre-alpine
WORKDIR /
ADD target/configuration-server-0.0.1-SNAPSHOT.jar configuration-server.jar
CMD ["java", "-jar", "configuration-server.jar"]

ENV SPRING_DATA_URI mongodb://localhost:27017/eagle_eye_local
ENV SERVER_PORT 3000
ENV SPRING_PROFILES_ACTIVE dev
