# Java Operators Made Easy

Operators in Java are special symbols or words that let you do things with numbers and variables, like adding numbers, comparing values, or changing what's stored in a variable.

---

## 1. Arithmetic Operators

These are used to do basic math:

| Operator | What It Does                | Example     |
|----------|----------------------------|-------------|
| +        | Adds two numbers           | x + y       |
| -        | Subtracts one from another | x - y       |
| *        | Multiplies numbers         | x * y       |
| /        | Divides one by another     | x / y       |
| %        | Remainder after division   | x % y       |
| ++       | Adds 1 to a variable       | ++x         |
| --       | Subtracts 1 from a variable| --x         |

**Example:**
int x = 100 + 50; // x is now 150

text

You can add numbers, or add variables together:
int sum1 = 100 + 50; // 150
int sum2 = sum1 + 250; // 400
int sum3 = sum2 + sum2; // 800



## 2. Assignment Operators

These are used to put values into variables, or change them.

| Operator | Example   | Same As        |
|----------|-----------|----------------|
| =        | x = 5     | x = 5          |
| +=       | x += 3    | x = x + 3      |
| -=       | x -= 3    | x = x - 3      |
| *=       | x *= 3    | x = x * 3      |
| /=       | x /= 3    | x = x / 3      |
| %=       | x %= 3    | x = x % 3      |

**Example:**
int x = 10;
x += 5; // x is now 15



## 3. Comparison Operators

These are used to compare two values. The result is always `true` or `false`.

| Operator | What It Does         | Example   |
|----------|---------------------|-----------|
| ==       | Is equal to         | x == y    |
| !=       | Is not equal to     | x != y    |
| >        | Greater than        | x > y     |
| <        | Less than           | x < y     |
| >=       | Greater or equal    | x >= y    |
| <=       | Less or equal       | x <= y    |

**Example:**
int x = 5;
int y = 3;
System.out.println(x > y); // true, because 5 is more than 3



## 4. Logical Operators

These help you check if one or more conditions are true or false.

| Operator | What It Does                           | Example           |
|----------|---------------------------------------|-------------------|
| &&       | True if both things are true          | x < 5 && x < 10   |
| \|\|     | True if at least one is true          | x < 5 \|\| x < 4  |
| !        | Reverses true/false                   | !(x < 5 && x < 10)|

**Example:**
int x = 4;
System.out.println(x < 5 && x < 10); // true
System.out.println(x < 5 || x < 4); // true
System.out.println(!(x < 5 && x < 10)); // false



## Summary

- **Arithmetic operators**: Do math.
- **Assignment operators**: Set or change variable values.
- **Comparison operators**: Check if things are equal, bigger, or smaller.
- **Logical operators**: Combine true/false checks.

These are the basic building blocks for working with data and making decisions in Java!