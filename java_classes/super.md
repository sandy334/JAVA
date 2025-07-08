
# Java `super` Keyword

In Java, the `super` keyword is used to refer to the **parent class** (superclass) of a subclass. It is helpful when subclass and superclass contain methods or variables with the same name or when you need to invoke the parent class constructor.

---

## 🔑 Use Cases of `super`

1. **Accessing Parent Class Methods**
2. **Accessing Parent Class Attributes**
3. **Calling Parent Class Constructor**

---

## 1️⃣ Accessing Parent Methods

If both subclass and superclass have a method with the same name, use `super.methodName()` to call the superclass version.

### ✅ Example

```java
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    public void start() {
        super.start(); // Call parent method
        System.out.println("Car is starting...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}
```

### 🧠 Output

```
Vehicle is starting...
Car is starting...
```

---

## 2️⃣ Accessing Parent Attributes

Use `super.variableName` to access a variable from the parent class if it is shadowed by a variable in the child class.

### ✅ Example

```java
class Vehicle {
    String type = "Generic Vehicle";
}

class Car extends Vehicle {
    String type = "Sports Car";

    public void printTypes() {
        System.out.println("Child type: " + type);
        System.out.println("Parent type: " + super.type); // Access parent attribute
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.printTypes();
    }
}
```

### 🧠 Output

```
Child type: Sports Car
Parent type: Generic Vehicle
```

---

## 3️⃣ Calling Parent Constructor

Use `super()` to explicitly call the constructor of the parent class. It must be the **first statement** in the subclass constructor.

### ✅ Example

```java
class Vehicle {
    Vehicle(String name) {
        System.out.println("Vehicle: " + name);
    }
}

class Car extends Vehicle {
    Car(String name) {
        super(name); // Call parent constructor
        System.out.println("Car: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Ferrari");
    }
}
```

### 🧠 Output

```
Vehicle: Ferrari
Car: Ferrari
```

---

## 📚 Summary

| Use Case             | Syntax Example       |
|----------------------|----------------------|
| Call parent method   | `super.methodName()` |
| Access parent field  | `super.fieldName`    |
| Call parent constructor | `super(args)`    |

---

## 💡 Notes

- `super()` must be the first line in a constructor.
- You cannot use `super` in static contexts.
- If no `super()` is explicitly written, Java automatically inserts a no-arg `super()` if the parent class has a no-argument constructor.

---

