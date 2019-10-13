call mvn clean install -DskipTests
call docker build -t gcr.io/example-1-255623/configuration-server:v5 .
call docker push gcr.io/example-1-255623/configuration-server:v5
