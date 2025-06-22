# Java `switch` Statement – Easy Explanation

Sometimes, you want your program to **make decisions** based on different values. You might use **lots of `if-else` statements**, but that can get messy. Instead, Java gives us a neat tool called `switch`.

---

## 🔄 What is `switch`?

The `switch` statement lets your program **choose between many options** based on the value of a single variable.

---

## 📄 Syntax

```java
switch (value) {
  case choice1:
    // do something
    break;
  case choice2:
    // do something else
    break;
  ...
  default:
    // do this if no case matches
}
````

---

## 📌 How It Works

1. Java looks at the value inside `switch(...)`.
2. It checks each `case` to see if there's a match.
3. If it finds a match, it runs the code under that `case`.
4. The `break` stops Java from running more code after a match.
5. If no cases match, it runs the `default` block (if you wrote one).

---

## ✅ Example: Choosing a Fruit

```java
String fruit = "Mango";

switch (fruit) {
  case "Apple":
    System.out.println("You picked an Apple.");
    break;
  case "Banana":
    System.out.println("You picked a Banana.");
    break;
  case "Mango":
    System.out.println("You picked a Mango.");
    break;
  default:
    System.out.println("Unknown fruit.");
}
```

**Output:**

```
You picked a Mango.
```

---

## 🛑 What does `break` do?

The `break` tells Java:

> “Stop here. Don’t look at the other cases.”

If you **don’t use `break`**, Java will keep running the next cases too — even if they don’t match! This is usually not what you want.

---

## ❓What is `default`?

The `default` part runs **if nothing else matches**. It's like the “**otherwise**” or “**none of the above**” option.

---

## ✅ Example: Choosing a Mode of Transport

```java
String transport = "Bike";

switch (transport) {
  case "Car":
    System.out.println("You chose a Car.");
    break;
  case "Train":
    System.out.println("You chose a Train.");
    break;
  default:
    System.out.println("You chose something else.");
}
```

**Output:**

```
You chose something else.
```

---

## 🧠 Quick Tips

* `switch` works well with `int`, `char`, `String`, and `enum` values.
* Don’t forget to use `break` unless you really want to “fall through” to the next case.
* Use `default` to handle unexpected values.

