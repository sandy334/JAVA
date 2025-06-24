
# Java Classes and Objects

## What is a Class?

**Definition:**  
A **class** in Java is a blueprint for creating objects. It defines the attributes (variables) and methods (actions) that the objects will have.

**Example:**  
Let’s create a class called `Book` with two attributes.

```java
public class Book {
    String title = "Java Basics";
    int pages = 250;
}
```
**Explanation:**  
- `Book` is the class name.
- `title` and `pages` are attributes of the class.

---

## What is an Object?

**Definition:**  
An **object** is an actual thing created from a class. Each object can have different values for its attributes.

---

## Creating an Object

To create an object, use the class name, followed by the object name, and the `new` keyword.

**Example:**  
Create an object called `myBook` and print its title.

```java
public class Book {
    String title = "Java Basics";
    int pages = 250;

    public static void main(String[] args) {
        Book myBook = new Book();
        System.out.println(myBook.title);
    }
}
```
**Output:**
```
Java Basics
```
**Explanation:**  
- `Book myBook = new Book();` creates an object of the `Book` class.
- `myBook.title` accesses the `title` attribute of the object.

---

## Multiple Objects

You can create many objects from the same class, each with its own values.

**Example:**  
Create two `Book` objects with different titles.

```java
public class Book {
    String title;
    int pages;

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Java for Beginners";
        book1.pages = 200;

        Book book2 = new Book();
        book2.title = "Advanced Java";
        book2.pages = 350;

        System.out.println(book1.title + " - " + book1.pages + " pages");
        System.out.println(book2.title + " - " + book2.pages + " pages");
    }
}
```
**Output:**
```
Java for Beginners - 200 pages
Advanced Java - 350 pages
```
**Explanation:**  
Each object (`book1`, `book2`) has its own values for `title` and `pages`.

---

## Using Multiple Classes

You can create an object in one class and use it in another class. This helps organize your code better.

**Example:**  
Define a `Student` class and use it in another class.

**Student.java**
```java
public class Student {
    String name = "Amit";
    int rollNumber = 101;
}
```

**TestStudent.java**
```java
public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + " - Roll No: " + s.rollNumber);
    }
}
```
**Output:**
```
Amit - Roll No: 101
```
**Explanation:**  
- `Student` defines the attributes.
- `TestStudent` creates a `Student` object and prints its information.

---

## Key Points

- A class is a template for objects.
- An object is an instance of a class.
- Each object can have its own values for the class attributes.
- You can use objects across different classes for better code organization.

