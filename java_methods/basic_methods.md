
# Java Methods

## What is a Method?

**Definition:**  
A method is a block of code that does a specific job. You write the method once, and then you can use (call) it whenever you need it.  
Methods help you organize your code, avoid repeating yourself, and make your programs easier to read.

---

## Why Use Methods?

- To organize code into reusable sections.
- To avoid writing the same code many times.
- To make your program easier to understand and maintain.

---

## Creating a Method

A method must be inside a class.  
Here’s how you create a simple method that prints a greeting:

```java
public class Main {
    static void sayHello() {
        System.out.println("Hello, welcome to Java!");
    }
}
```

- `static` means the method belongs to the class, not to an object.
- `void` means the method does not return any value.
- `sayHello` is the method’s name.

---

## Calling a Method

To use a method, you “call” it by writing its name followed by parentheses.

**Example:**

```java
public class Main {
    static void sayHello() {
        System.out.println("Hello, welcome to Java!");
    }

    public static void main(String[] args) {
        sayHello(); // This calls the method
    }
}
```
**Output:**
```
Hello, welcome to Java!
```
When you run this program, it prints the greeting.

---

## Calling a Method Multiple Times

You can call the same method as many times as you want.

**Example:**

```java
public class Main {
    static void printStar() {
        System.out.println("*");
    }

    public static void main(String[] args) {
        printStar();
        printStar();
        printStar();
    }
}
```
**Output:**
```
*
*
*
```
This prints a star three times, each on a new line.

---

## Methods with Parameters

You can make methods that take input values (called parameters).

**Example:**

```java
public class Main {
    static void greetPerson(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greetPerson("Alice");
        greetPerson("Bob");
    }
}
```
**Output:**
```
Hello, Alice!
Hello, Bob!
```
Here, the method greets different people based on the name you give it.

---

## Methods that Return Values

Some methods send back a value when they finish.

**Example:**

```java
public class Main {
    static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = addNumbers(5, 7);
        System.out.println("The sum is: " + sum);
    }
}
```
**Output:**
```
The sum is: 12
```
This method adds two numbers and returns the result.

---

## Key Points

- Methods are blocks of code you can reuse.
- You can pass data to methods using parameters.
- Some methods return a value; others do not.
- Methods help keep your code clean and organized.

