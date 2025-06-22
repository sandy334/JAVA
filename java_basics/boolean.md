# Java Booleans (in Simple Words)

In programming, we often need to **check if something is either true or false**, like:

- Is the light ON or OFF?  
- Is this answer YES or NO?  
- Is the person old enough to vote or not?

To do this, **Java uses a special type of value called a `boolean`**.

---

## 🔹 What is a Boolean?

A **boolean** is a data type in Java that can only have **two values**:

- `true` (yes, correct, on, allowed)
- `false` (no, wrong, off, not allowed)

### ✅ Example:
```java
boolean isJavaFun = true;
boolean isFishTasty = false;

System.out.println(isJavaFun);     // prints: true
System.out.println(isFishTasty);   // prints: false
```

---

## 🔹 Boolean Expressions

You can also use **math comparisons** to get a boolean answer:

### ✅ Example:
```java
int x = 10;
int y = 9;
System.out.println(x > y);  // prints: true (because 10 is more than 9)
```

Even simpler:
```java
System.out.println(10 > 9);  // prints: true
System.out.println(10 == 15); // prints: false (because 10 is not equal to 15)
```

---

## 🔹 Real-Life Example – Voting Age

Let’s say you want to check if someone is old enough to vote:

```java
int myAge = 25;
int votingAge = 18;

System.out.println(myAge >= votingAge); // prints: true
```

Here, `>=` means "greater than or equal to".

---

## 🔹 Using if...else with Booleans

You can do **something based on the result** of a boolean value using `if...else`:

```java
int myAge = 25;
int votingAge = 18;

if (myAge >= votingAge) {
  System.out.println("Old enough to vote!");
} else {
  System.out.println("Not old enough to vote.");
}
```

### Output:
```
Old enough to vote!
```

---

## 🎯 Summary

- A `boolean` is either `true` or `false`.
- You use it when you want to **check conditions** like comparisons.
- It helps you **decide what to do** in your program based on results.
