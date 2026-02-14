# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org/)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.0.10/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.0.10/gradle-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.0.10/reference/web/servlet.html)
* [Spring Cloud Gateway](https://docs.spring.io/spring-cloud-gateway/docs/current/reference/html/)
* [Spring Cloud Alibaba](https://spring-cloud-alibaba-group.github.io/github-pages/2022.0.0.0-RC2/en-us/index.html)
* [Envoy Proxy](https://www.envoyproxy.io/docs/envoy/latest/)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Spring Cloud Gateway](https://spring.io/guides/gs/gateway/)
* [Using Envoy as an API Gateway](https://www.envoyproxy.io/docs/envoy/latest/start/sandboxes/api_gateway)

### Project Structure

This project is structured as a multi-module Gradle project with the following modules:

* `demo-user-service`: User service running on port 8081
* `demo-hello-service`: Hello service running on port 8082
* `demo-gateway`: Gateway service (backup option)
* `demo-common`: Common utilities and dependencies

### Running the Project

To run the project, follow these steps:

1. **Start backend services**:
   ```bash
   # Start user-service
   java -jar demo-user-service/build/libs/demo-user-service-0.0.1-SNAPSHOT.jar
   
   # Start hello-service
   java -jar demo-hello-service/build/libs/demo-hello-service-0.0.1-SNAPSHOT.jar
   ```

2. **Start Envoy proxy**:
   ```bash
   /home/plus/envoy/envoy-1.29.0-linux-x86_64 -c envoy.yaml
   ```

3. **Access services**:
   - Through Envoy: `http://localhost:9080/user/hello` and `http://localhost:9080/hello/greeting`
   - Directly: `http://localhost:8081/user/hello` and `http://localhost:8082/hello/greeting`


