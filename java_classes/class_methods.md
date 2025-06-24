

# Java Class Methods

## What is a Method?

**Definition:**  
A **method** is a block of code inside a class that performs a specific action. You can call (run) a method whenever you need to perform that action.

---

## Declaring a Method

You declare a method inside a class.  
Here’s how to create a simple method that prints a message:

```java
public class Greeting {
    static void sayHello() {
        System.out.println("Hello, Java learner!");
    }
}
```
**Explanation:**  
- `sayHello()` is a method that prints a greeting.
- `static` means you can call it without creating an object.

---

## Calling a Method

To use a method, write its name followed by parentheses.

**Example:**

```java
public class Greeting {
    static void sayHello() {
        System.out.println("Hello, Java learner!");
    }

    public static void main(String[] args) {
        sayHello(); // Calls the method
    }
}
```
**Output:**
```
Hello, Java learner!
```

---

## Static vs. Public Methods

- **Static methods** can be called without creating an object.
- **Public methods** (without `static`) must be called on an object.

**Example:**

```java
public class Calculator {
    static void showInfo() {
        System.out.println("Calculator ready!");
    }

    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        showInfo(); // Static method call

        Calculator calc = new Calculator(); // Create object
        calc.add(4, 7); // Public method call
    }
}
```
**Output:**
```
Calculator ready!
Sum: 11
```
**Explanation:**  
- `showInfo()` is static and called directly.
- `add()` is public and called using the object `calc`.

---

## Methods with Parameters

Methods can take input values called **parameters**.

**Example:**  
A method to print a custom message:

```java
public class Messenger {
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Messenger m = new Messenger();
        m.printMessage("Welcome to Java!");
    }
}
```
**Output:**
```
Message: Welcome to Java!
```

---

## Accessing Methods with Objects

You can call methods on objects using the dot `.` operator.

**Example:**  
A `Light` class with two methods:

```java
public class Light {
    public void turnOn() {
        System.out.println("The light is on.");
    }

    public void setBrightness(int level) {
        System.out.println("Brightness set to: " + level);
    }

    public static void main(String[] args) {
        Light lamp = new Light();
        lamp.turnOn();
        lamp.setBrightness(75);
    }
}
```
**Output:**
```
The light is on.
Brightness set to: 75
```

---

## Using Methods Across Multiple Classes

You can define methods in one class and call them from another.

**Example:**

**Printer.java**
```java
public class Printer {
    public void printPage() {
        System.out.println("Printing page...");
    }
}
```

**TestPrinter.java**
```java
public class TestPrinter {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.printPage();
    }
}
```
**Output:**
```
Printing page...
```

---

## Key Points

- Methods are blocks of code that perform actions.
- Static methods can be called without objects; public methods need objects.
- Use the dot `.` operator to call methods on objects.
- Methods can take parameters and can be used across multiple classes.

