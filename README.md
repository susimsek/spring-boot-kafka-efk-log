# Spring Boot Kafka Elasticsearch Log
> Spring Boot Kafka Elasticsearch Log Using Fluentd
>
<img src="https://github.com/susimsek/spring-boot-kafka-elasticsearch-log/blob/main/images/spring-boot-kafka-elasticsearch-log.png" alt="Spring Boot Kafka Elasticsearch Log" width="100%" height="100%"/> 

## Prerequisites

* Java 11
* Maven 3.3+
* Docker 19.03+
* Docker Compose 1.25+

## Installation


```sh
./mvnw compile jib:dockerBuild
```


```sh
docker-compose up -d 
```

## Used Technologies

* Spring Boot 2.4.3
* Elasticsearch
* Kibana
* Fluentd  
* Zookeeper
* Kafka
* Kafdrop
* Spring Boot Web Flux
* Spring Boot Log4j2
* Kafka Log4j Appender
* Problem Spring Web Flux
* Spring Boot Actuator
* Maven Jib Plugin
* Maven Clean Plugin
* Maven Enforcer Plugin
* Maven Compiler Plugin
* Lombok
* Dev Tools
* Spring Boot Test