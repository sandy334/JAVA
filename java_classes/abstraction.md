
# 🧠 Abstract Classes and Methods in Java

---

## 📌 What is Abstraction?

**Abstraction** is the process of hiding complex implementation details and showing only essential features of the object.

In Java, **abstraction** can be achieved using:

- **Abstract Classes**
- **Interfaces** (explained in a separate lesson)

---

## 🔑 Abstract Class and Method - Definition

- **Abstract class** is a class that **cannot be instantiated** (you cannot create an object of it).
- **Abstract method** is a method that is **declared without an implementation** (no method body).
- A class containing one or more abstract methods **must be declared abstract**.
- Abstract classes **can have regular methods as well**.

---

## 🧪 Example: Abstract Class `Shape`

Let's consider an abstract class `Shape`, which is a base class for different types of shapes like `Circle` and `Rectangle`.

### 📌 Code:

```java
// Abstract class
abstract class Shape {
    // Abstract method
    public abstract double area();

    // Regular method
    public void display() {
        System.out.println("Calculating area of the shape...");
    }
}

// Subclass 1: Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract method
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Subclass 2: Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of abstract method
    public double area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.display();
        System.out.println("Area of circle: " + circle.area());

        Shape rectangle = new Rectangle(4, 6);
        rectangle.display();
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}
```

---

## 🔍 Code Explanation

1. **Abstract class `Shape`**:
   - It has one **abstract method** `area()` – no body provided.
   - It also has a **concrete method** `display()` with a regular implementation.

2. **Concrete classes `Circle` and `Rectangle`**:
   - Both inherit from `Shape` using the `extends` keyword.
   - They **override** the `area()` method to provide their specific implementation.

3. **Main class**:
   - Objects of `Circle` and `Rectangle` are created using **Shape** reference (demonstrating polymorphism).
   - Abstract methods are called through the child classes.

---

## 📎 Why Use Abstract Classes and Methods?

- To enforce a **base structure** that all derived classes must follow.
- To achieve **security** by hiding the implementation details.
- To enable **polymorphism** in object-oriented design.

---

## 🛑 Key Points to Remember

- You **cannot instantiate** an abstract class directly.
- An abstract class **can** have both abstract and concrete methods.
- Any class inheriting from an abstract class **must** implement all abstract methods unless it is also declared abstract.

---

## 📚 Related Topics

- Interfaces in Java (for full abstraction)
- Polymorphism
- Inheritance and Method Overriding

---

## 🧠 Summary

Using abstract classes helps create a strong and flexible object-oriented design where shared behavior is enforced and specific behavior is customized.
