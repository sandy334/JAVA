
# 🔐 Java Modifiers: Access and Non-Access

Java provides **modifiers** to control **access levels** and **additional behavior** for classes, methods, attributes, and constructors.

Modifiers are classified into two main types:

---

## 🚪 1. Access Modifiers

Control **where** the class, method, or variable can be accessed from.

### 🔓 Access Modifiers for Classes

| Modifier | Description |
|----------|-------------|
| `public` | Class is accessible from any other class |
| *(default)* | Accessible only within the same package |

### 🔑 Access Modifiers for Attributes, Methods, Constructors

| Modifier | Description |
|----------|-------------|
| `public` | Accessible from anywhere |
| `private` | Accessible only within the class |
| *(default)* | Accessible only within the same package |
| `protected` | Accessible within the same package and by subclasses |

### 🧪 Example: Access Modifiers

```java
public class Person {
    public String name = "Raj";       // public
    private int age = 30;             // private
    protected String city = "Delhi";  // protected

    public void showName() {
        System.out.println("Name: " + name);
    }

    private void showAge() {
        System.out.println("Age: " + age);
    }

    protected void showCity() {
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.showName();
        p.showCity();
        // p.showAge(); // ❌ Error: private method
    }
}
```

---

## ⚙️ 2. Non-Access Modifiers

Provide **functional behavior** to classes, methods, and variables.

### 🏗️ For Classes

| Modifier | Description |
|----------|-------------|
| `final` | Class cannot be subclassed |
| `abstract` | Class cannot be instantiated |

### 🧩 For Methods and Attributes

| Modifier | Description |
|----------|-------------|
| `final` | Cannot be overridden (method) or changed (attribute) |
| `static` | Belongs to the class, not instances |
| `abstract` | No method body; must be implemented by subclass |
| `transient` | Not serialized |
| `synchronized` | Only one thread can access the method at a time |
| `volatile` | Always read from main memory, not cache |

---

## 🔒 Example: `final` Attribute

```java
public class Constants {
    final double PI = 3.14159;

    public static void main(String[] args) {
        Constants c = new Constants();
        System.out.println("Value of PI: " + c.PI);
        // c.PI = 3.14; // ❌ Error: Cannot assign a value to final variable
    }
}
```

---

## 🔁 Example: `static` Method

```java
public class Utility {
    static void greet() {
        System.out.println("Hello from a static method!");
    }

    public void nonStaticGreet() {
        System.out.println("Hello from a public method!");
    }

    public static void main(String[] args) {
        greet(); // ✅ No object needed
        Utility u = new Utility();
        u.nonStaticGreet(); // ✅ Requires object
    }
}
```

---

## 🧱 Example: `abstract` Class & Method

```java
abstract class Animal {
    public abstract void makeSound(); // No body
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
```

---

## 📋 Summary

### ✅ Access Modifiers

- `public`, `private`, `protected`, `default` (no keyword)
- Control **visibility and access scope**

### ✅ Non-Access Modifiers

- `static`, `final`, `abstract`, `transient`, `synchronized`, `volatile`
- Control **functionality, behavior, and restrictions**

Use these modifiers to design **secure, maintainable, and efficient** Java code.

---
