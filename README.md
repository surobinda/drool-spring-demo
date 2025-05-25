# Drool - a very simple example of drool with spring-boot

### Reference Documentation
For further reference, please consider the following sections:

* [Drools Spring Integration](https://www.baeldung.com/drools-spring-integration)
* [Code Generated via start.spring.io](https://start.spring.io/)
* [Drools - Rule Engine Integration with Spring framework](https://www.youtube.com/watch?v=UuZ7pZ_1JDE)


### Guides
Just to iterate this is very simple, Drools implementation could go for more complex implementation based on scenarios.

### Sample postman requests payload
* {
  "isNightSurcharge": false,
  "distanceInMile": 10
  }
* {
  "isNightSurcharge": true,
  "distanceInMile": 150
  }

### Few important points and best practice
* Use salience to explicitly set rule priorities.
* Use agenda-group or ruleflow-group for structured rule execution.
* Organize rules semantically — one DRL file for base logic, another for overrides or exceptions, but control execution explicitly.

