# Introduction

Simple example of Spring Boot + Apache Kafka.

## Setting up

Download Kafka and Zookeeper images from docker hub and run their containers.

## Endpoints
*  Produce and Consume and String (***myMessage***).

**Get**
```

http://localhost:8585/api/v1/kafka/publish?message={myMessage}
```
*  Produce and Consume and JSON object.

**Post**
```
http://localhost:8585/api/v1/kafka/publish
```
```
{
    "id": "integer",
    "name":"String",
    "lastName":"String"
}
```

## How to see Topics?
First...
```
docker exec -it id-container /bin/sh
```
Next...
```
cd opt/bitnami/kafka/bin
```

See topic's detail
```
kafka-topics.sh --bootstrap-server=localhost:9092 --describe --topic nombre_topic
```
Or see topic's message
```
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic nombre_topic --from-beginning
```
