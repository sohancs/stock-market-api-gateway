FROM openjdk:8
ADD target/stock-market-api-gateway-0.0.1-SNAPSHOT.jar stock-market-api-gateway-0.0.1-SNAPSHOT.jar
EXPOSE 7000
ENTRYPOINT ["java","-jar","stock-market-api-gateway-0.0.1-SNAPSHOT.jar"]