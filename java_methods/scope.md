

# Java Scope

## What is Scope?

**Definition:**  
In Java, the *scope* of a variable is the part of the program where that variable can be used. A variable only exists and is accessible within the region it was created[2][6][7][8].

---

## Types of Scope in Java

### 1. Class Scope (Instance and Static Variables)

Variables declared inside a class but outside any method are called *class variables* (also known as fields or attributes).  
- **Instance variables** belong to an object.
- **Static variables** belong to the class itself.

**Example:**

```java
public class Animal {
    String species = "Dog";      // Instance variable (class scope)
    static int count = 0;        // Static variable (class scope)

    public void showSpecies() {
        System.out.println(species);
    }
}
```
**Explanation:**  
- `species` can be used by any method in the class, but each object has its own value.
- `count` can be used by any method in the class and is shared by all objects[1][4][8].

---

### 2. Method Scope (Local Variables)

Variables declared inside a method are called *local variables*.  
They only exist within that method and cannot be used outside it[2][6][7][8].

**Example:**

```java
public class Calculator {
    public void addNumbers() {
        int sum = 10 + 5; // sum is only accessible inside this method
        System.out.println("Sum: " + sum);
    }
}
```
**Explanation:**  
- `sum` is only available inside `addNumbers()`.  
- If you try to use `sum` in another method, you’ll get an error.

---

### 3. Block Scope

A *block* is any code inside curly braces `{ }`, such as inside an if statement, loop, or just a standalone block.  
Variables declared inside a block only exist within that block[2][3][6][8].

**Example:**

```java
public class Example {
    public static void main(String[] args) {
        // Code here CANNOT use message

        {
            String message = "Inside the block!";
            System.out.println(message); // This works
        }

        // Code here CANNOT use message
        // System.out.println(message); // This would cause an error
    }
}
```
**Explanation:**  
- `message` only exists inside the curly braces where it was declared.

---

### 4. Loop Scope

Variables declared in a loop (like in a `for` statement) only exist inside that loop

**Example:**

```java
public class LoopScope {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("i is: " + i);
        }
        // System.out.println(i); // This would cause an error, i is out of scope
    }
}
```
**Explanation:**  
- `i` only exists inside the loop.

---

### 5. Variable Shadowing

If you declare a variable with the same name in an inner scope, it hides (or "shadows") the outer variable

**Example:**

```java
public class Shadowing {
    int number = 50; // Class scope

    public void printNumber() {
        int number = 20; // Method scope, shadows the class variable
        System.out.println(number); // Prints 20, not 50
    }
}
```
**Explanation:**  
- The local `number` in `printNumber()` hides the class variable with the same name.

---

## Key Points

- Variables only exist and can be used within their scope.
- Class variables can be used by all methods in the class.
- Local variables exist only in the method or block where they are declared.
- Variables in loops or blocks disappear after the block ends.
- Declaring variables with the same name in inner scopes can cause shadowing, which may lead to confusion.
