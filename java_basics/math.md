
# 📘 Java `Math` Class – Simple Guide

Java has a built-in `Math` class that helps you do common math tasks easily.

---

## 🔼 Math.max(x, y)
This finds the **bigger** number between two values.

**Example:**
```java
Math.max(5, 10);  // Gives 10
```

---

## 🔽 Math.min(x, y)
This finds the **smaller** number between two values.

**Example:**
```java
Math.min(5, 10);  // Gives 5
```

---

## 🧮 Math.sqrt(x)
This gives you the **square root** of a number.

**Example:**
```java
Math.sqrt(64);  // Gives 8
```
(Why? Because 8 × 8 = 64)

---

## ➕ Math.abs(x)
This gives the **absolute value**, which means it removes any minus sign.

**Example:**
```java
Math.abs(-4.7);  // Gives 4.7
```

Even if the number is negative, this gives you the positive version.

---

## 🎲 Math.random()
This gives you a **random number** between **0.0 (inclusive)** and **1.0 (exclusive)**.

**Example:**
```java
Math.random();  // Might give something like 0.56789
```

---

## 🎯 Want a random number between 0 and 100?
Use this trick:

**Example:**
```java
int randomNum = (int)(Math.random() * 101);  // Gives a number from 0 to 100
```

- `Math.random()` gives a decimal like `0.5`
- `* 101` scales it up
- `(int)` turns it into a whole number
