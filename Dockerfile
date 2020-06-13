FROM adoptopenjdk:14-jre-hotspot
ADD . /src
WORKDIR /src
RUN ./mvnw package -DskipTests
EXPOSE 8080
ENTRYPOINT ["java","-jar","target/myalomatika-0.0.1-SNAPSHOT.jar"]