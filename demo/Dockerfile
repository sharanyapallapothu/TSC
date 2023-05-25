FROM openjdk:20

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar /app/tv.jar

EXPOSE 8081

CMD ["java", "-jar","tv.jar"]