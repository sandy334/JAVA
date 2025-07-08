
# Java Polymorphism

Polymorphism is a key concept in Object-Oriented Programming (OOP) that allows objects of different classes to be treated as objects of a common superclass. The word *Polymorphism* means "many forms".

---

## 🔑 Key Definitions

- **Polymorphism**: The ability of a method to behave differently based on the object calling it.
- **Method Overriding**: When a subclass provides its own specific implementation of a method already defined in its superclass.
- **Dynamic Method Dispatch**: The process in which a call to an overridden method is resolved at runtime rather than compile time.

---

## 📌 Example

Let's look at an example using a superclass `Shape` and subclasses `Circle`, `Rectangle`, and `Triangle`.

```java
// Superclass
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Subclass 1
class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Subclass 2
class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Subclass 3
class Triangle extends Shape {
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();

        s1.draw(); // Output: Drawing a circle
        s2.draw(); // Output: Drawing a rectangle
        s3.draw(); // Output: Drawing a triangle
    }
}
```

---

## 🧠 Explanation

1. `Shape` is the superclass with a method `draw()`.
2. `Circle`, `Rectangle`, and `Triangle` are subclasses that override the `draw()` method.
3. In the `main()` method, references of type `Shape` are used to refer to different subclass objects.
4. Each call to `draw()` executes the overridden version specific to the object type, not the reference type. This is **runtime polymorphism**.

---

## 💡 Real-life Analogy

Imagine a remote control (reference type `Shape`) that can operate a TV (`Circle`), AC (`Rectangle`), or Fan (`Triangle`). Pressing the "power" button (method `draw()`) results in different actions based on the actual appliance (object type).

---

## ✅ Benefits of Polymorphism

- **Code Reusability**: Common interface for many forms.
- **Scalability**: Add new behavior with minimal changes.
- **Flexibility**: Write generic code that works with different types.

---

## 🧪 Compile-Time vs Runtime Polymorphism

| Type                 | Example             | Resolution Time |
|----------------------|---------------------|------------------|
| Method Overloading   | Same method, different params | Compile Time     |
| Method Overriding    | Same method, subclass modifies | Runtime          |

---
