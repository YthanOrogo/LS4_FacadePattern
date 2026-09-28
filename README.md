# LS4_FacadePattern

# Simplified Intelligent Home System

## Overview
The HomeApp manages various home services for an intelligent home system, including turning on and off the lights, TV, and air conditioning. It interacts with these services through a simplified, single interface provided by `HomeInterface`. This facade class delegates user requests to the appropriate service classes while abstracting the underlying service details from the user.

## Features
* **Unified Control Interface:** The `HomeInterface` delegates user requests to the appropriate subsystems (`Light`, `TV`, `AirConditioning`), abstracting internal details.
* **Simultaneous Execution:** Includes functionality to control all connected utilities at once using `turnOnAll()` and `turnOffAll()` methods.
* **Facade Design Pattern Integration:** Coordinates interactions between the client (`HomeApp`) and the individual home services to allow seamless access and utilization.

## System Architecture

### Client
* **`HomeApp`**: The client class that uses the `HomeInterface` to access and utilize home services seamlessly.

### Facade
* **`HomeInterface`**: The facade class that coordinates interactions between the client and individual services. 
    * Methods: `turnOnAll()`, `turnOffAll()`

### Subsystem Services
* **`HomeService` (Interface)**: Defines the common interface for all home services.
* **`Light`**: A service class implementing the `HomeService` interface, responsible for turning the lights on and off. 
    * Methods: `turnOn()`, `turnOff()`
* **`TV`**: A service class implementing the `HomeService` interface, responsible for turning the TV on and off. 
    * Methods: `turnOn()`, `turnOff()`
* **`AirConditioning`**: A service class implementing the `HomeService` interface, responsible for turning the air conditioning on and off. 
    * Methods: `turnOn()`, `turnOff()`