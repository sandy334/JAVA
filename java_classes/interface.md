
# Java Interfaces - Concept & Example

## 📘 What is an Interface in Java?

An **interface** in Java is a completely abstract class that is used to group related methods with **empty bodies**. It acts as a **contract** that a class must follow when it chooses to implement it.

### ✅ Key Points:

- Interface methods are **implicitly public and abstract**.
- Interface fields are **implicitly public, static, and final**.
- A class **implements** an interface using the `implements` keyword.
- Interfaces are used to achieve **abstraction** and **multiple inheritance** in Java.

---

## 💡 Why Use Interfaces?

1. To **achieve abstraction** – hide internal details and only show important features.
2. To support **multiple inheritance** – a class can implement multiple interfaces unlike extending classes.

---

## 🧪 Custom Example

### 🔹 Interface Definition

```java
// Interface
interface Vehicle {
    void start();
    void stop();
}
```

### 🔹 Implementing Class

```java
// Implementing class
class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
}
```

### 🔹 Main Class

```java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.stop();
    }
}
```

### 🔍 Output:

```
Car started
Car stopped
```

---

## 🔁 Implementing Multiple Interfaces

```java
interface Camera {
    void takePhoto();
}

interface GPS {
    void navigate();
}

class Smartphone implements Camera, GPS {
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }
    public void navigate() {
        System.out.println("Navigating to destination...");
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.takePhoto();
        phone.navigate();
    }
}
```

### 🔍 Output:

```
Taking a photo...
Navigating to destination...
```

---

## 📌 Summary

- Interfaces help define **what** a class should do, not **how** it should do it.
- Ideal for APIs, callback functions, and polymorphic behavior.
- They provide a way to achieve **loose coupling** in software design.
