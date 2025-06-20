
# 📘 Java Variable Declaration and Assignment

In Java, a variable is a container that holds data during the execution of a program. You must declare its type before using it.

---

## 🔤 Syntax
```java
type variableName = value;
```
- `type`: Data type (e.g., `int`, `String`, `float`, etc.)
- `variableName`: Name of the variable (e.g., `age`, `name`)
- `value`: The data assigned to the variable

---

## 🧾 Example: Text Storage (`String`)
```java
String name = "John";
System.out.println(name);  // Output: John
```

---

## 🔢 Example: Number Storage (`int`)
```java
int myNum = 15;
System.out.println(myNum);  // Output: 15
```

---

## ✍️ Declare First, Assign Later
```java
int myNum;
myNum = 15;
System.out.println(myNum);  // Output: 15
```

---

## 🔁 Changing Variable Value
```java
int myNum = 15;
myNum = 20;  // myNum is now 20
System.out.println(myNum);  // Output: 20
```

---

## 🔒 Final Variables (Constants)
Use `final` to make a variable unchangeable after assignment.
```java
final int myNum = 15;
myNum = 20;  // ❌ Error: Cannot assign a value to a final variable
```

---

## 🔣 More Variable Types

### ✅ `float` – Decimal Numbers
```java
float pi = 3.14f;
System.out.println(pi);  // Output: 3.14
```

### ✅ `char` – Single Characters
```java
char letter = 'A';
System.out.println(letter);  // Output: A
```

### ✅ `boolean` – True or False
```java
boolean isJavaFun = true;
System.out.println(isJavaFun);  // Output: true
```

---

## 📌 Summary

| Data Type | Example        | Description                    |
|-----------|----------------|--------------------------------|
| `int`     | 15             | Whole numbers                  |
| `float`   | 3.14f          | Decimal numbers                |
| `char`    | 'A'            | Single characters              |
| `String`  | "Hello"        | Text values                    |
| `boolean` | true / false   | True or false values           |
| `final`   | `final int x`  | Constant (value can't change)  |

---

> ✨ Java is strictly typed – always declare a variable’s type before using it.
