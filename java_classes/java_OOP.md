# Java OOP (Object-Oriented Programming)

## What is OOP?

**Object-Oriented Programming (OOP)** is a way of writing programs by creating objects that combine data and actions.  
Instead of just writing procedures that work on data, you organize your code around objects that represent real-world things.

---

## Advantages of OOP

- **Faster and easier to execute**: OOP makes programs run efficiently.
- **Clear structure**: Code is organized and easier to understand.
- **DRY Principle**: "Don't Repeat Yourself"—reuse code instead of repeating it.
- **Easy to maintain and modify**: Changes can be made in one place and reused everywhere.
- **Reusable code**: Build applications faster by reusing classes and objects.

---

## Classes and Objects

### What is a Class?

A **class** is like a blueprint for creating objects. It defines what data (fields) and actions (methods) the objects will have.

**Example:**
```java
public class Animal {
    String name;
    void speak() {
        System.out.println(name + " makes a sound.");
    }
}
```

### What is an Object?

An **object** is a specific instance of a class.  
You create objects from a class, and each object has its own values for the fields.

**Example:**
```java
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Buddy";
        dog.speak(); // Output: Buddy makes a sound.

        Animal cat = new Animal();
        cat.name = "Whiskers";
        cat.speak(); // Output: Whiskers makes a sound.
    }
}
```
**Explanation:**  
- `Animal` is the class (blueprint).
- `dog` and `cat` are objects created from the `Animal` class, each with their own name.

---

## OOP Principles (Short Overview)

1. **Encapsulation**: Keeping data (fields) and code (methods) together in one unit (class), and hiding details from outside.
2. **Inheritance**: Creating new classes based on existing ones, inheriting their features.
3. **Polymorphism**: Using a single interface to represent different types or actions.
4. **Abstraction**: Hiding complex details and showing only the necessary features.

---

## Real-Life Example

**Class:** Car  
**Objects:**  
- `Car myCar = new Car();`  
- `Car yourCar = new Car();`

Each `Car` object can have different values for properties like color, speed, or model, but they are all created from the same `Car` class.

---

## Key Points

- OOP helps organize code around real-world things.
- Classes are blueprints; objects are the real things you use in your program.
- OOP makes code reusable, organized, and easier to maintain.
