
# Java Method Parameters and Arguments

## What are Parameters and Arguments?

**Definition:**  
- A **parameter** is a variable listed inside the parentheses in a method definition.  
- An **argument** is the actual value you pass to the method when you call it.

Think of parameters as empty boxes, and arguments as the things you put in those boxes when you use the method.

---

## Example: Greeting with a Name

```java
public class Main {
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greet("Sam");     // "Sam" is an argument
        greet("Priya");   // "Priya" is an argument
        greet("Alex");    // "Alex" is an argument
    }
}
```
**Output:**
```
Hello, Sam!
Hello, Priya!
Hello, Alex!
```
Here, `name` is the parameter. Each time you call `greet`, you pass a different argument.

---

## Multiple Parameters

You can use more than one parameter in a method. Separate them with commas.

**Example: Displaying Book Info**

```java
public class Main {
    static void printBookInfo(String title, int year) {
        System.out.println(title + " was published in " + year);
    }

    public static void main(String[] args) {
        printBookInfo("Java Basics", 2015);
        printBookInfo("Coding 101", 2020);
    }
}
```
**Output:**
```
Java Basics was published in 2015
Coding 101 was published in 2020
```
Here, `title` and `year` are parameters. `"Java Basics"` and `2015` are arguments.

---

## Important Rules

- The number and order of arguments must match the parameters.
- The type of each argument must match the type of its parameter.

---

## Using If...Else in Methods

You can use conditions inside methods to make decisions.

**Example: Checking Voting Eligibility**

```java
public class Main {
    static void checkVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You are too young to vote.");
        }
    }

    public static void main(String[] args) {
        checkVotingEligibility(16);
        checkVotingEligibility(22);
    }
}
```
**Output:**
```
You are too young to vote.
You can vote!
```

---

## Methods that Return Values

Some methods send a value back using the return keyword.

**Example: Calculating Area of a Rectangle**

```java
public class Main {
    static int rectangleArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        int area = rectangleArea(5, 3);
        System.out.println("Area: " + area);
    }
}
```
**Output:**
```
Area: 15
```
Here, the method takes two parameters, multiplies them, and returns the result.

---

## Another Example: Adding Two Numbers

```java
public class Main {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(10, 7);
        System.out.println("Sum: " + sum);
    }
}
```
**Output:**
```
Sum: 17
```

---

## Key Points

- Parameters are like placeholders in method definitions.
- Arguments are the real values you give when calling the method.
- You can have as many parameters as you need.
- Methods can return values using the return keyword.

