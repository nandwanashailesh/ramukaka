FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/usermanagement-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD ["java","-jar","usermanagement-0.0.1-SNAPSHOT.jar"]