
# 📚 Java User Input with Scanner

## 🔍 What is Scanner?

`Scanner` is a class in `java.util` package used to receive user input from various input sources, including keyboard input. It provides various methods to read different types of input like strings, integers, booleans, etc.

---

## 📦 Importing Scanner

Before using Scanner, it must be imported:
```java
import java.util.Scanner;
```

---

## 🧪 Example 1: Reading Basic String Input

```java
import java.util.Scanner;

public class UserInfo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your city: ");
    String city = scanner.nextLine();
    System.out.println("You live in: " + city);
  }
}
```

### ✅ Output:
```
Enter your city: Bengaluru
You live in: Bengaluru
```

---

## 🔢 Input Types and Methods

| Method         | Description                        |
|----------------|------------------------------------|
| nextBoolean()  | Reads a `boolean` value            |
| nextByte()     | Reads a `byte` value               |
| nextDouble()   | Reads a `double` value             |
| nextFloat()    | Reads a `float` value              |
| nextInt()      | Reads an `int` value               |
| nextLine()     | Reads a `String` value (entire line)|
| nextLong()     | Reads a `long` value               |
| nextShort()    | Reads a `short` value              |

---

## 🧪 Example 2: Reading Multiple Data Types

```java
import java.util.Scanner;

public class Profile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your full name, age and GPA:");

    String fullName = scanner.nextLine();
    int age = scanner.nextInt();
    double gpa = scanner.nextDouble();

    System.out.println("Student Profile:");
    System.out.println("Name: " + fullName);
    System.out.println("Age: " + age);
    System.out.println("GPA: " + gpa);
  }
}
```

### ⚠️ Note:
Be cautious when mixing `nextLine()` with other methods like `nextInt()` or `nextDouble()`. Use an extra `scanner.nextLine()` to clear the buffer if needed.

---

## 🧪 Example 3: Handling Different Data Types and Buffer

```java
import java.util.Scanner;

public class MixedInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    scanner.nextLine();  // Consume leftover newline

    System.out.print("Enter your favorite quote: ");
    String quote = scanner.nextLine();

    System.out.println("Age: " + age);
    System.out.println("Quote: "" + quote + """);
  }
}
```

---

## 🛠 Common Errors

### ❗ InputMismatchException

Occurs when the input does not match the expected type.

```java
// Example: Trying to read int, but input is text
int num = scanner.nextInt();  // Input: "abc" -> Throws InputMismatchException
```

🛡️ To handle such errors, use exception handling (`try-catch`) or input validation.

---

## 📌 Summary

- `Scanner` is a powerful class for accepting input from the user.
- Use `nextLine()` for Strings, and type-specific methods for other data types.
- Always manage the input buffer when switching between data types.
- Exception handling is recommended to deal with invalid inputs.

---
