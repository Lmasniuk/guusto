FROM adoptopenjdk/openjdk12:latest
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
COPY public public
ENTRYPOINT ["java","-jar","/app.jar"]
