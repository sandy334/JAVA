
# 📘 Java Data Types – Explained Simply

In Java, every variable must have a **data type**. A data type tells Java what kind of value a variable can hold, like numbers, text, or true/false.

---

## 🔹 Example of Different Data Types
```java
int myNum = 5;               // Whole number
float myFloatNum = 5.99f;    // Decimal number
char myLetter = 'D';         // Single letter
boolean myBool = true;       // True or False
String myText = "Hello";     // Text
```

---

## 🧱 Types of Data in Java

Java divides data types into two groups:

### ✅ 1. Primitive Types
These are the basic building blocks, already built into Java:
- byte
- short
- int
- long
- float
- double
- boolean
- char

### ✅ 2. Non-Primitive Types
These are more advanced and made using the primitive types:
- String
- Arrays
- Classes

---

## 🔢 Primitive Types (Built-in)

These are simple types and can’t be broken down further.

### 🟧 Integers – Whole Numbers
Used when you don’t need any decimals.

| Type  | Range | Example |
|-------|-------|---------|
| byte  | -128 to 127 | `byte b = 100;` |
| short | -32,768 to 32,767 | `short s = 5000;` |
| int   | -2B to 2B approx | `int i = 100000;` |
| long  | Very large numbers | `long l = 15000000000L;` |

> 💡 Use `int` most of the time, unless the number is very big — then use `long`.

---

### 🟦 Floating Point – Decimal Numbers
Used when you need to store numbers with a decimal point.

| Type  | Digits After Decimal | Example |
|-------|-----------------------|---------|
| float | 6–7 digits | `float pi = 3.14f;` |
| double | 15–16 digits | `double bigPi = 3.1415926535;` |

> ℹ️ Use `double` when precision matters (like in science or money).

---

### 🔬 Scientific Notation
You can also use “E” or “e” to write very large/small numbers.

```java
float f = 35e3f;
double d = 12E4d;
System.out.println(f);  // 35000.0
System.out.println(d);  // 120000.0
```

---

### ✅ Boolean – True or False
Great for answering Yes/No questions.

```java
boolean isCodingFun = true;
boolean isSkyGreen = false;
System.out.println(isCodingFun);   // true
System.out.println(isSkyGreen);    // false
```

---

### 🔡 Char – A Single Character
Stores only one letter or symbol.

```java
char grade = 'A';
System.out.println(grade);  // A
```

You can also use ASCII values:
```java
char a = 65, b = 66, c = 67;
System.out.println(a);  // A
System.out.println(b);  // B
System.out.println(c);  // C
```

---

## 🧵 String – A Sequence of Characters
Use this to store words or sentences.

```java
String greeting = "Hello World";
System.out.println(greeting);  // Hello World
```

---

## 🎯 Real-Life Example with Different Data Types
```java
int items = 50;
float costPerItem = 9.99f;
float totalCost = items * costPerItem;
char currency = '$';

System.out.println("Number of items: " + items);
System.out.println("Cost per item: " + costPerItem + currency);
System.out.println("Total cost = " + totalCost + currency);
```

---

## 🧩 Non-Primitive Types (Objects)
These are made from primitive types and offer extra features.

### Differences from primitive types:
- You can create your own
- Can use built-in functions (methods)
- Start with uppercase letters (like `String`)
- Can hold `null` (meaning "no value")

### Examples:
- `String`
- `Array`
- `Class`

> 🧠 You'll learn more about non-primitive types in advanced topics.

---

## 📌 Summary Table

| Type Group | Data Type | Used For |
|------------|-----------|----------|
| Primitive  | `int`     | Whole numbers |
| Primitive  | `float`, `double` | Decimal numbers |
| Primitive  | `char`    | Single character |
| Primitive  | `boolean` | True/False logic |
| Non-Primitive | `String` | Text |
| Non-Primitive | `Array`, `Class` | Complex data |

---

> ✅ Tip: Always pick the smallest and most efficient data type for your task.
