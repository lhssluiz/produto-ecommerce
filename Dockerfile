FROM openjdk:18
COPY ./build/libs/produto-ecommerce-0.0.1-SNAPSHOT.jar produto-ecommerce-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "produto-ecommerce-0.0.1-SNAPSHOT.jar"]