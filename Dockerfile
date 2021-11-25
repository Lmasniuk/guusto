FROM adoptopenjdk/openjdk12:latest
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
# COPY target/ /
COPY public public
ENTRYPOINT ["java","-jar","/app.jar"]
# java -jar target/Guusto-0.0.1-SNAPSHOT.jar