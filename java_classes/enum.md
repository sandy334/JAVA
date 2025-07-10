
# 📚 Java Enum Tutorial

## 🧾 What is an Enum?

An `enum` (short for "enumeration") is a special Java type used to define collections of **constants** (unchangeable values). Enums make code **more readable and safer**, especially when dealing with fixed sets of options such as days of the week, directions, status codes, etc.

---

## 🔨 Syntax

```java
enum Day {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
```

Each enum constant is implicitly `public`, `static`, and `final`.

---

## 🧪 Example 1: Basic Enum Usage

```java
enum Day {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
  public static void main(String[] args) {
    Day today = Day.WEDNESDAY;
    System.out.println("Today is: " + today);
  }
}
```

### ✅ Output:
```
Today is: WEDNESDAY
```

---

## 🎛️ Example 2: Enum inside a Class

```java
public class Schedule {
  enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
  }

  public static void main(String[] args) {
    Day workDay = Day.MONDAY;
    System.out.println("Work starts on: " + workDay);
  }
}
```

---

## 🔄 Example 3: Enum with Switch Statement

```java
enum Day {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

public class Main {
  public static void main(String[] args) {
    Day today = Day.THURSDAY;

    switch (today) {
      case MONDAY:
        System.out.println("Start of the week!");
        break;
      case FRIDAY:
        System.out.println("Almost weekend!");
        break;
      default:
        System.out.println("Midweek day");
    }
  }
}
```

### ✅ Output:
```
Midweek day
```

---

## 🔁 Example 4: Loop Through Enum Values

```java
enum Day {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

public class Main {
  public static void main(String[] args) {
    for (Day d : Day.values()) {
      System.out.println(d);
    }
  }
}
```

### ✅ Output:
```
MONDAY
TUESDAY
WEDNESDAY
THURSDAY
FRIDAY
```

---

## ⚙️ Example 5: Enum with Attributes and Methods

```java
enum Level {
  LOW(1),
  MEDIUM(2),
  HIGH(3);

  private int levelCode;

  Level(int code) {
    this.levelCode = code;
  }

  public int getLevelCode() {
    return levelCode;
  }
}

public class Main {
  public static void main(String[] args) {
    Level lvl = Level.HIGH;
    System.out.println("Level: " + lvl + ", Code: " + lvl.getLevelCode());
  }
}
```

### ✅ Output:
```
Level: HIGH, Code: 3
```

---

## 🆚 Difference Between Enum and Class

| Feature             | Enum                          | Class                         |
|---------------------|-------------------------------|-------------------------------|
| Can hold constants? | ✅ Yes                         | ⚠️ Not intended for that       |
| Mutable?            | ❌ Immutable (constants)       | ✅ Can be mutable              |
| Inheritance?        | ❌ Cannot extend classes       | ✅ Can extend                  |
| Interfaces?         | ✅ Can implement interfaces    | ✅ Yes                         |
| Constructor use?    | ✅ Can have private constructor| ✅ Can have constructors       |

---

## ✅ When to Use Enums?

- Days of the week
- Months
- Status codes (e.g., SUCCESS, ERROR)
- Directions (NORTH, SOUTH, EAST, WEST)
- Modes or states in a machine or UI (ON, OFF, LOADING)

---

## 📌 Summary

- Enums are a special kind of class used to define constant values.
- They are type-safe, readable, and ideal for scenarios with fixed options.
- You can loop through enums, use them in switch statements, and even add fields/methods.

---

## 🧠 Tip

Although you can't create enum objects using `new`, each constant is itself an instance of the enum class.
