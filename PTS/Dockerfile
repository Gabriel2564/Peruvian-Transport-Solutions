FROM eclipse-temurin:21.0.3_9-jdk

WORKDIR /app

COPY .mvn .mvn
COPY mvnw .
COPY pom.xml .
RUN ./mvnw dependency:go-offline

COPY src ./src

RUN ./mvnw clean package -DskipTests

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "target/PTS-0.0.1-SNAPSHOT.jar"]
