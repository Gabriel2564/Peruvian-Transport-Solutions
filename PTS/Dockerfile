FROM amazoncorretto:23-alpine-jdk

COPY "./target/PTS-0.0.1-SNAPSHOT.jar" "app.jar"

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "/app.jar"]
