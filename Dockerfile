FROM adoptopenjdk/openjdk11:jre-11.0.11_9-debianslim
COPY target/api-0.0.1-SNAPSHOT.jar app/
ENTRYPOINT ["java", "-jar", "app/api-0.0.1-SNAPSHOT.jar"]
