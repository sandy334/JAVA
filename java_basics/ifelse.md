
# Java If...Else Made Simple

## 🧠 What Are Conditions?

In real life, we make decisions all the time:

- If it rains, **carry an umbrella**.
- Else, **go without it**.

Java also makes decisions using conditions like:

- `a < b` → Is **a less than b**?
- `a == b` → Is **a equal to b**?
- `a != b` → Is **a not equal to b**?

These help the computer decide **what code to run**.

---

## ✅ The `if` Statement

Use `if` when you **want to do something only if a condition is true**.

### 🧾 Syntax:
```java
if (condition) {
  // Do this if condition is true
}
```

### 💡 Example:
```java
if (20 > 18) {
  System.out.println("20 is greater than 18");
}
```

**Output:**
```
20 is greater than 18
```

---

## 🧩 The `else` Statement

Use `else` when you **want to do something else if the condition is false**.

### 🧾 Syntax:
```java
if (condition) {
  // True block
} else {
  // False block
}
```

### 💡 Example:
```java
int time = 20;

if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
```

**Output:**
```
Good evening.
```

---

## 🔁 The `else if` Statement

Use `else if` when you **want to check more than one condition**.

### 🧾 Syntax:
```java
if (condition1) {
  // If condition1 is true
} else if (condition2) {
  // If condition2 is true
} else {
  // If none of the above are true
}
```

### 💡 Example:
```java
int time = 22;

if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
```

**Output:**
```
Good evening.
```

---

## ⚡ Short Hand If...Else (Ternary Operator)

If your condition is simple, you can write it in **one line** using this syntax:

### 🧾 Syntax:
```java
variable = (condition) ? valueIfTrue : valueIfFalse;
```

### 💡 Example:
```java
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);
```

**Output:**
```
Good evening.
```

---

## 🛠️ Real-Life Examples

### 🔐 Open a door with a secret code
```java
int doorCode = 1337;

if (doorCode == 1337) {
  System.out.println("Correct code. The door is now open.");
} else {
  System.out.println("Wrong code. The door remains closed.");
}
```

---

### ➕ Is a number positive or negative?
```java
int myNum = 10;

if (myNum > 0) {
  System.out.println("The value is a positive number.");
} else if (myNum < 0) {
  System.out.println("The value is a negative number.");
} else {
  System.out.println("The value is 0.");
}
```

---

### 🗳️ Can a person vote?
```java
int myAge = 25;
int votingAge = 18;

if (myAge >= votingAge) {
  System.out.println("Old enough to vote!");
} else {
  System.out.println("Not old enough to vote.");
}
```

---

### 🔢 Is a number even or odd?
```java
int myNum = 5;

if (myNum % 2 == 0) {
  System.out.println(myNum + " is even");
} else {
  System.out.println(myNum + " is odd");
}
```

**Output:**
```
5 is odd
```
