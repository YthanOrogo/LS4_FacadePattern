# Simplified Intelligent Home System

The HomeApp manages various home services for an intelligent home system, including turning on and off the lights, TV, and air conditioning. It interacts with these services through a simplified, single interface provided by the `HomeInterface`. The `HomeInterface` class delegates the user's requests to the appropriate service classes (`Light`, `TV`, `AirConditioning`) while abstracting the service details from the user. Additionally, the `HomeInterface` provides methods to turn on all services (`turnOnAll()`) and turn off all services (`turnOffAll()`).

## Class Definitions

* **`HomeService` (Interface):** Defines the common interface for all home services.
* **`Light`:** A service class implementing the `HomeService` interface, responsible for turning the lights on and off. It includes the `turnOn()` and `turnOff()` methods.
* **`TV`:** A service class implementing the `HomeService` interface, responsible for turning the TV on and off. It includes the `turnOn()` and `turnOff()` methods.
* **`AirConditioning`:** A service class implementing the `HomeService` interface, responsible for turning the air conditioning on and off. It includes the `turnOn()` and `turnOff()` methods.
* **`HomeInterface`:** The facade class that coordinates interactions between the client (`HomeApp`) and the individual home services. It includes the `turnOnAll()` and `turnOffAll()` methods to control all services simultaneously.
* **`HomeApp`:** The client class that uses the `HomeInterface` to access and utilize home services seamlessly.