FROM openjdk:21
LABEL authors="lasse"
ARG JAR_FILE=target/*.jar
COPY ./target/diningreview-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar","-web -webAllowOthers -tcp -tcpAllowOthers -browser"]
EXPOSE 8080