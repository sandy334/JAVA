
# Java Inheritance (Subclass and Superclass)

Inheritance is one of the key features of Object-Oriented Programming (OOP) in Java. It allows one class (subclass or child class) to inherit the fields and methods of another class (superclass or parent class). This promotes **code reusability** and enables **polymorphism**.

---

## 🔑 Key Definitions

- **Superclass (Parent class)**: The class whose features are inherited.
- **Subclass (Child class)**: The class that inherits from another class.
- **`extends` keyword**: Used to inherit from a class.
- **`protected` modifier**: Makes attributes and methods accessible within the same package and subclasses.
- **`final` keyword**: Prevents a class from being inherited.

---

## 📌 Example

Let's look at a simple example using `Animal` as the superclass and `Dog` as the subclass.

```java
// Superclass
class Animal {
    protected String name = "Animal";

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    private String breed = "Labrador";

    public void displayInfo() {
        System.out.println("Name: " + name); // inherited attribute
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();        // inherited method
        myDog.displayInfo();  // subclass method
    }
}
```

### 🧠 Explanation

1. `class Animal` is the **superclass** with:
   - A `protected` attribute `name`
   - A public method `sound()`

2. `class Dog extends Animal` is the **subclass**, which:
   - Inherits `name` and `sound()` from `Animal`
   - Adds a new field `breed`
   - Defines a new method `displayInfo()`

3. Inside `main()`:
   - A `Dog` object is created.
   - It can call `sound()` because it's inherited from `Animal`.
   - It prints both the inherited and the new attributes.

---

## ❌ Final Class Example

If we make the superclass `final`, inheritance will no longer be allowed:

```java
final class Animal {
    public void sound() {
        System.out.println("This is a final class");
    }
}

class Dog extends Animal {  // ❌ Error: Cannot inherit from final class
    ...
}
```

🛑 This will result in a **compilation error**: `cannot inherit from final Animal`.

---

## ✅ When to Use Inheritance?

- To promote **code reusability**
- To follow **DRY (Don't Repeat Yourself)** principles
- To create **polymorphic** behavior

---
