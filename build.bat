call npm run webpack:build
call mvn -Pdev package -DskipTests
call docker build -t gcr.io/${PROJECT_ID}/configuration-server:v1 .
call docker push -t gcr.io/${PROJECT_ID}/configuration-server:v1
