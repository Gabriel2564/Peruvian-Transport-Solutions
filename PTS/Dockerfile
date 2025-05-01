# Etapa 1: construir el .jar
FROM eclipse-temurin:23-jdk AS builder

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests

# Etapa 2: ejecutar la app
FROM eclipse-temurin:23-jre

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "pts-app.jar"]
