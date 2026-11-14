FROM eclipse-temurin:27-jre
#FROM → starting environment (Java)
WORKDIR /app
#WORKDIR → working folder inside the container
COPY target/developer-service-0.0.1-SNAPSHOT.jar app.jar
#COPY → copies our JAR into the container
ENTRYPOINT ["java", "-jar", "app.jar"]
#ENTRYPOINT → command that starts our application