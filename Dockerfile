FROM openjdk:8-jdk-alpine

VOLUME /tmp

COPY /target/OrderMicroservice-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

EXPOSE 8200

ENV JAVA OPTS=""

RUN sh -c "touch OrderMicroservice-0.0.1-SNAPSHOT.jar"

ENTRYPOINT [ "java", "-jar", "OrderMicroservice-0.0.1-SNAPSHOT.jar" ]
