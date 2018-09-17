# PetStoreDAOCenter

## PetStoreDAOCenter ---> Jpa layer which contains all our entities and DAO services

I create this projet for creating the **classic J2EE 'PetStore'** using **Spring Cloud** 
Spring Cloud is a collection of frameworks that are based on the ease of development of Spring Boot, 
which simplifies the development of distributed system infrastructure, builds service governance (discovery registration),
configuration centers, message buses, load balancing, circuit breakers, Data monitoring, distributed session
and cluster state management provide us with the perfect solution for a complete enterprise-class distributed
cloud application.

The core of Spring Cloud is service governance. Service governance mainly implements this function by integrating
Netflix related products, namely Spring Cloud Netflix, including Eureka for **service registration and discovery**,
circuit breaker with Hystrix, load balancing with Ribbon, Rest client, Feign, Smart Service Routing with Zuul,
Spectator, Servo, Atlas for monitoring data collection and display, Archaius for configuration reading, and RxJava for
Controller layer Reactive package. In addition, Feign and RxJava are not Netiflix products, but are also integrated
into Spring Cloud Netflix.

# Architecture

>PetStoreParent ---> General dependencies defined for this project

>PetStoreEurekaServer ---> Eureka registration and discovery center

>PetStoreDAOCenter ---> Jpa layer which contains all our entities and DAO services

>PetStore ---> Eureka service provider which provide one part our our restful web service which will be consumed by PetStoreWeb

>PetStoreWeb ---> Frond-end interface and backend which consume PetStore

# Which Spring Cloud frameworks will be used 

- **Eureka** Service registration and discovery
- **Eureka** Service provider and consumer
- load balancing with **Ribbon**
- **Hystrix** for circuit breaker
- **Feign** for simplifying the http request 
- **Zuul** for its smart Routing Service
