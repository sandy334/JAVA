
# 🔄 Java Type Casting – Explained Simply

Sometimes, you might need to change a value from one type to another. This is called **Type Casting** in Java.

---

## 🎭 What is Type Casting?

It means **changing the type** of a value from one form to another.

Example: Changing an `int` (whole number) into a `double` (decimal number), or vice versa.

There are **two main types** of casting in Java:

---

## 1️⃣ Widening Casting (Automatic)

When you change a smaller type into a bigger one — Java does this for you **automatically**.

### ✅ Example:
```java
int myInt = 9;
double myDouble = myInt;  // int to double

System.out.println(myInt);     // 9
System.out.println(myDouble);  // 9.0
````

| Small Type | Bigger Type |
| ---------- | ----------- |
| byte       | short       |
| short      | int         |
| int        | long        |
| long       | float       |
| float      | double      |

> ✅ No extra code is needed — Java handles it on its own.

---

## 2️⃣ Narrowing Casting (Manual)

When changing a **bigger** type into a **smaller** one, Java needs your **permission**, so you must do it **manually** using parentheses.

### ⚠️ Example:

```java
double myDouble = 9.78;
int myInt = (int) myDouble;  // double to int (manual)

System.out.println(myDouble);  // 9.78
System.out.println(myInt);     // 9
```

| Big Type | Small Type |
| -------- | ---------- |
| double   | float      |
| float    | long       |
| long     | int        |
| int      | short      |
| short    | byte       |

> ⚠️ You might lose data during narrowing casting. For example, 9.78 becomes just 9.

---

## 🧠 Real-Life Example – Game Score Percentage

Let’s say you’re building a game and want to show the player’s score as a percentage.

If you don’t cast, the division might give an incorrect result (as integer division gives whole numbers).

### ✅ Code:

```java
int maxScore = 500;
int userScore = 423;

// Convert userScore to float for accurate division
float percentage = (float) userScore / maxScore * 100.0f;

System.out.println("User's percentage is " + percentage);
```

> ✅ Here, we cast `userScore` to `float` so that we get decimal accuracy like `84.6%` instead of just `84`.

---

## 📌 Summary Table

| Casting Type      | Done By       | From Type → To Type | Example               |
| ----------------- | ------------- | ------------------- | --------------------- |
| Widening (Safe)   | Automatically | `int` → `double`    | `double d = intVal;`  |
| Narrowing (Risky) | Manually      | `double` → `int`    | `int i = (int) dVal;` |

---

> 🧪 Always be careful with narrowing casting — you might lose part of your data!

```

