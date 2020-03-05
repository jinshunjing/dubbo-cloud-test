# Spring Cloud Alibaba Dubbo

## Run dubbo provider
Pay attention to application.yml
dubbo.protocol.port = -1 (starting from 20880)
dubbo.registry.address = spring-cloud://127.0.0.1 (Nacos registry)

Check the service my-dubbo-provider in Nacos admin console.

## Run dubbo consumer
Pay attention to application.yml
dubbo.protocol.port = -1 (starting from 20880)

Check the service my-dubbo-consumer in Nacos admin console.

## Test
curl http://127.0.0.1:8673/name/hello
