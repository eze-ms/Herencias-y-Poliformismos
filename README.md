# Java Inheritance and Polymorphism Exercises

This repository contains exercises designed to practice inheritance and polymorphism in Java. Below are the details of each exercise, grouped by level.

---

## **Level 1**

### **Exercise 1: Musical Instruments**
- Create a group of musical instruments, categorized into wind, string, and percussion types.
- All instruments share the attributes `name` and `price`, and a method `tocar()` (play), which is abstract in the parent class and implemented in the child classes:
  - **Wind instruments:** Print: *"Està sonant un instrument de vent"*.
  - **String instruments:** Print: *"Està sonant un instrument de corda"*.
  - **Percussion instruments:** Print: *"Està sonant un instrument de percussió"*.
- Demonstrate that a class is loaded only once in Java, either by creating the first instance or by accessing a static member.
- Research and use static and initialization blocks in Java.

---

### **Exercise 2: Car Attributes and Methods**
- Create a class `Cotxe` (Car) with the following attributes:
  - `marca` (static final).
  - `model` (static).
  - `potència` (final).
- Demonstrate the differences between these attributes. Identify which ones can be initialized in the constructor.
- Add the following methods to the `Cotxe` class:
  - A static method `frenar()` that prints: *"El vehicle està frenant"*.
  - A non-static method `accelerar()` that prints: *"El vehicle està accelerant"*.
- Demonstrate how to invoke static and non-static methods from the `main()` method.

---

## **Level 2**

### **Exercise 1: Smartphone Features**
- Create a `Telèfon` (Phone) class with attributes `marca` and `model`, and a method `trucar()` (call). This method takes a string (phone number) as a parameter and prints: *"S’està trucant al número {número}"*.
- Create the following interfaces:
  - `Camera` with a method `fotografiar()` (photograph).
  - `Rellotge` with a method `alarma()` (alarm).
- Create a `Smartphone` class that:
  - Inherits from `Telèfon`.
  - Implements both `Camera` and `Rellotge`.
  - Implements `fotografiar()` to print: *"S’està fent una foto"*.
  - Implements `alarma()` to print: *"Està sonant l’alarma"*.
- From the `main()` method, create a `Smartphone` object and invoke all its methods to demonstrate its functionality.

---

This repository focuses on mastering the principles of inheritance and polymorphism in Java, including abstract classes, method overriding, static and initialization blocks, and the implementation of inter
