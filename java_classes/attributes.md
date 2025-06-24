# Java Class Attributes

## What are Class Attributes?

**Definition:**  
Class attributes (also called **fields** or **variables**) are pieces of data stored inside a class. Each object created from the class gets its own copy of these attributes.

---

## Declaring Class Attributes

You declare attributes inside the class, but outside any methods.

**Example:**  
Let’s create a `Person` class with two attributes:

```java
public class Person {
    String name = "Alice";
    int age = 28;
}
```
**Explanation:**  
- `name` and `age` are attributes of the `Person` class.

---

## Accessing Attributes

To access an attribute, create an object from the class and use the dot `.` operator.

**Example:**  
Print the `name` attribute of a `Person` object:

```java
public class Person {
    String name = "Alice";
    int age = 28;

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name); // Output: Alice
    }
}
```
**Explanation:**  
- `p.name` gets the value of the `name` attribute from the `p` object.

---

## Modifying Attributes

You can change the value of an attribute after creating the object.

**Example:**  
Change the `age` attribute:

```java
public class Person {
    String name = "Alice";
    int age = 28;

    public static void main(String[] args) {
        Person p = new Person();
        p.age = 30; // Change age to 30
        System.out.println(p.age); // Output: 30
    }
}
```
**Explanation:**  
- `p.age = 30;` updates the `age` attribute for the `p` object.

---

## The `final` Keyword

If you want an attribute’s value to never change, use the `final` keyword.

**Example:**  
```java
public class Constants {
    final double PI = 3.14159;

    public static void main(String[] args) {
        Constants c = new Constants();
        // c.PI = 3.14; // This line would cause an error!
        System.out.println(c.PI); // Output: 3.14159
    }
}
```
**Explanation:**  
- `final` makes `PI` a constant. You cannot change its value after it’s set.

---

## Multiple Objects, Independent Attributes

Each object has its own copy of the class attributes. Changing one object’s attribute does not affect another’s.

**Example:**  
```java
public class Car {
    String model = "Sedan";

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car2.model = "SUV";
        System.out.println(car1.model); // Output: Sedan
        System.out.println(car2.model); // Output: SUV
    }
}
```
**Explanation:**  
- `car1` and `car2` are separate objects with their own `model` values.

---

## Multiple Attributes

A class can have as many attributes as you need.

**Example:**  
```java
public class Student {
    String firstName = "Rahul";
    String lastName = "Sharma";
    int rollNumber = 102;

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Name: " + s.firstName + " " + s.lastName);
        System.out.println("Roll Number: " + s.rollNumber);
    }
}
```
**Output:**
```
Name: Rahul Sharma
Roll Number: 102
```

---

## Key Points

- Class attributes are variables inside a class.
- Access attributes using the dot `.` operator on an object.
- You can change attribute values unless they are marked `final`.
- Each object has its own copy of the attributes.
