

# Java Method Overloading

## What is Method Overloading?

**Definition:**  
Method overloading means having multiple methods in the same class with the same name, but with different types or numbers of parameters.  
This lets you use the same method name to do similar things with different kinds of data.

---

## Why Use Method Overloading?

- Makes your code easier to read and use.
- Lets you perform similar actions with different types or amounts of information.

---

## Example: Displaying Information

Let's create a method called displayInfo that works for both a single name and for a name with an age.

```java
public class Main {
    static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        displayInfo("Riya");
        displayInfo("Arjun", 25);
    }
}
```
**Output:**
```
Name: Riya
Name: Arjun, Age: 25
```
Here, both methods have the same name, but one takes only a name and the other takes both a name and an age.

---

## Example: Calculating Area

Suppose you want to calculate the area of a square and a rectangle using the same method name.

```java
public class Main {
    static int area(int side) {
        return side * side;
    }

    static int area(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        int squareArea = area(4);        // Calls area(int side)
        int rectangleArea = area(5, 3);  // Calls area(int length, int width)
        System.out.println("Square area: " + squareArea);
        System.out.println("Rectangle area: " + rectangleArea);
    }
}
```
**Output:**
```
Square area: 16
Rectangle area: 15
```
Java knows which method to use based on the number of arguments you provide.

---

## Example: Greeting People

You can greet someone by just their name, or by their name and the time of day.

```java
public class Main {
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static void greet(String name, String timeOfDay) {
        System.out.println("Good " + timeOfDay + ", " + name + "!");
    }

    public static void main(String[] args) {
        greet("Sara");
        greet("Sara", "evening");
    }
}
```
**Output:**
```
Hello, Sara!
Good evening, Sara!
```

---

## Key Points

- Overloaded methods must have different parameter lists (type, number, or both).
- The return type can be different, but Java decides which method to use based on the parameters, not the return type.
- Method overloading makes your code cleaner and more flexible.

The use of "plus" in the context of Java method overloading typically refers to methods designed to perform addition, often named as "plusMethod" or similar. These methods demonstrate how you can have multiple methods with the same name but different parameter types or counts, allowing you to add integers, doubles, or other types using the same method name. For example:

```java
static int plusMethod(int x, int y) {
    return x + y;
}

static double plusMethod(double x, double y) {
    return x + y;
}
```

Here, `plusMethod` is overloaded: one version adds two integers, and the other adds two doubles. When you call `plusMethod(8, 5)`, the integer version is used, and when you call `plusMethod(4.3, 6.26)`, the double version is used

The "plus" in the method name is just a naming choice to indicate the method's purpose (addition). The actual addition is performed by the `+` operator within the method body. Java does not allow user-defined operator overloading (except for the built-in overloading of `+` for both numbers and string concatenation), so method overloading is the standard way to achieve similar functionality for different data types.

In summary, "plus" is used in method names to show addition operations, and method overloading allows you to define several "plus" methods to add different types or numbers of values

