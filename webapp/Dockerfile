FROM maven:3.6.3-ibmjava-8-alpine AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests

FROM openjdk:8-jdk-alpine
EXPOSE 8081
ENV POSTGES_CONNECTION_STING="root"
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]
COPY --from=build /home/app/target/webapp-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar



