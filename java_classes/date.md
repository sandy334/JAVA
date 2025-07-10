
# 📅 Java Date & Time (java.time Package)

Java provides the `java.time` package to handle date, time, and related formatting. It offers modern replacements for the older `java.util.Date` and `java.text.SimpleDateFormat` classes.

---

## 📦 Common Classes in java.time

| Class             | Description |
|------------------|-------------|
| `LocalDate`      | Represents a date (yyyy-MM-dd) |
| `LocalTime`      | Represents a time (HH:mm:ss:ns) |
| `LocalDateTime`  | Represents both date and time |
| `DateTimeFormatter` | Used to format and parse date/time objects |

---

## 🧪 Example 1: Display Current Date

```java
import java.time.LocalDate;

public class DateExample {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println("Today's Date: " + today);
  }
}
```

### ✅ Output:
```
Today's Date: 2025-07-10
```

---

## 🕒 Example 2: Display Current Time

```java
import java.time.LocalTime;

public class TimeExample {
  public static void main(String[] args) {
    LocalTime currentTime = LocalTime.now();
    System.out.println("Current Time: " + currentTime);
  }
}
```

### ✅ Output:
```
Current Time: 09:00:25.123456789
```

---

## 🗓️🕒 Example 3: Display Date and Time

```java
import java.time.LocalDateTime;

public class DateTimeExample {
  public static void main(String[] args) {
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("Date and Time: " + currentDateTime);
  }
}
```

### ✅ Output:
```
Date and Time: 2025-07-10T09:00:25.123456789
```

---

## 🎨 Example 4: Formatting Date & Time

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatExample {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    String formatted = now.format(formatter);
    System.out.println("Formatted DateTime: " + formatted);
  }
}
```

### ✅ Output:
```
Formatted DateTime: 10/07/2025 09:00:25
```

---

## 📋 Custom Format Patterns

| Pattern | Output Example |
|---------|----------------|
| yyyy-MM-dd | 2025-07-10 |
| dd/MM/yyyy | 10/07/2025 |
| dd-MMM-yyyy | 10-Jul-2025 |
| E, MMM dd yyyy | Thu, Jul 10 2025 |

Use these with `DateTimeFormatter.ofPattern("pattern")`.

---

## 🧠 Summary

- Use `LocalDate.now()` for the current date.
- Use `LocalTime.now()` for the current time.
- Use `LocalDateTime.now()` for date and time together.
- Use `DateTimeFormatter` for readable/customized output.

Modern Java uses the `java.time` package as a replacement for the outdated `Date` class.

---
