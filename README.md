# LS4_FacadePattern

# Simplified Intelligent Home System[cite: 3]

## Overview
The HomeApp manages various home services for an intelligent home system, including turning on and off the lights, TV, and air conditioning[cite: 3]. It interacts with these services through a simplified, single interface provided by the `HomeInterface`[cite: 3]. The `HomeInterface` class delegates the user's requests to the appropriate service classes (`Light`, `TV`, `AirConditioning`) while abstracting the service details from the user[cite: 3]. Additionally, the `HomeInterface` provides methods to turn on all services (`turnOnAll()`) and turn off all services (`turnOffAll()`)[cite: 3].

## Class Definitions

* **`HomeService` (Interface):** Defines the common interface for all home services[cite: 3].
* **`Light`:** A service class implementing the `HomeService` interface, responsible for turning the lights on and off[cite: 3]. It includes the `turnOn()` and `turnOff()` methods[cite: 3].
* **`TV`:** A service class implementing the `HomeService` interface, responsible for turning the TV on and off[cite: 3]. It includes the `turnOn()` and `turnOff()` methods[cite: 3].
* **`AirConditioning`:** A service class implementing the `HomeService` interface, responsible for turning the air conditioning on and off[cite: 3]. It includes the `turnOn()` and `turnOff()` methods[cite: 3].
* **`HomeInterface`:** The facade class that coordinates interactions between the client (`HomeApp`) and the individual home services[cite: 3]. It includes the `turnOnAll()` and `turnOffAll()` methods to control all services simultaneously[cite: 3].
* **`HomeApp`:** The client class that uses the `HomeInterface` to access and utilize home services seamlessly[cite: 3].