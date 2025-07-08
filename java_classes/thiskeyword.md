
# 🔑 Java `this` Keyword Explained

In Java, the `this` keyword is a **reference variable** that refers to the **current object** of a class.

It is commonly used to:
- Resolve naming conflicts between **class fields** and **constructor or method parameters**.
- Call **another constructor** from within a constructor.
- Pass the current object as a parameter.

---

## 🧠 1. Why Use `this` Keyword?

When the parameter name of a method or constructor is the same as a class attribute, `this` helps in differentiating between the two.

---

## 🧪 Example 1: Resolving Naming Conflict

```java
public class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name; // 'this.name' refers to class variable
        this.id = id;     // 'id' is the parameter
    }

    public void printDetails() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Anjali", 1001);
        emp.printDetails();
    }
}
```

### ✅ Output:
```
Employee Name: Anjali, ID: 1001
```

### 🔍 Explanation:
- `this.name = name;` means the **class attribute `name`** gets the value from the **parameter `name`**.
- Without `this`, Java would not know whether `name` refers to the parameter or the field.

---

## 🔄 Example 2: Calling One Constructor from Another

```java
public class Book {
    String title;
    String author;

    // Constructor with one parameter
    public Book(String title) {
        this(title, "Unknown Author"); // Call another constructor with default author
    }

    // Constructor with two parameters
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book("Advanced Java", "Raj Patel");

        b1.displayInfo();
        b2.displayInfo();
    }
}
```

### ✅ Output:
```
Title: Java Basics, Author: Unknown Author
Title: Advanced Java, Author: Raj Patel
```

### 🔍 Explanation:
- `this(title, "Unknown Author")` calls another constructor in the same class.
- **Constructor chaining** is used to avoid repetition and provide default values.

> 📌 Note: The call to `this()` must be the **first line** inside the constructor.

---

## ✨ Bonus: Using `this` to Pass Current Object

```java
public class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void show(Student s) {
        System.out.println("Student name is: " + s.name);
    }

    void display() {
        show(this); // passing current object
    }

    public static void main(String[] args) {
        Student s1 = new Student("Vikram");
        s1.display();
    }
}
```

### ✅ Output:
```
Student name is: Vikram
```

### 🔍 Explanation:
- `this` can be passed as an argument to a method or constructor.
- Here, `show(this)` sends the current object to the `show` method.

---

## 📝 Summary

| Use Case                             | Description                                                |
|-------------------------------------|------------------------------------------------------------|
| `this.variable`                     | Refers to current object's field                           |
| `this()`                            | Calls another constructor in the same class                |
| `this` as argument                  | Passes current object to method or constructor             |
| Inside method or constructor        | Resolves ambiguity between class fields and parameters     |

---

## 📘 Best Practices

- Use `this` only when needed (especially when variables are shadowed).
- Always place `this()` as the first statement when used in constructors.
- Prefer meaningful parameter names to avoid overusing `this`.

