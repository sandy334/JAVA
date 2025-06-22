
# Java Strings (Made Easy)

Strings in Java are used to store text. Think of a string like a sentence or a word inside double quotes, like this: "Hello".

## Creating a String
To make a string in Java:
```java
String greeting = "Hello";
```

## Getting the Length of a String
Want to know how many characters are in a string?
Use `.length()`
```java
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length is: " + txt.length());
// Output: The length is: 26
```

## Changing Letter Cases
Turn all letters to upper or lower case:
```java
String txt = "Hello World";
System.out.println(txt.toUpperCase()); // HELLO WORLD
System.out.println(txt.toLowerCase()); // hello world
```

## Finding a Word in a String
Use `.indexOf("word")` to find where a word first appears:
```java
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate"));
// Output: 7
```

## Joining Strings Together (Concatenation)
You can combine strings in two ways:
1. Using `+`:
```java
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName);
// Output: John Doe
```

2. Using `.concat()`:
```java
String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));
// Output: John Doe
```

## Numbers vs Strings
Java uses `+` for both numbers and text.

### Adding Numbers:
```java
int x = 10;
int y = 20;
int z = x + y;
// z is 30 (a number)
```

### Adding Strings:
```java
String x = "10";
String y = "20";
String z = x + y;
// z is "1020" (a string)
```

### Mixing String and Number:
```java
String x = "10";
int y = 20;
String z = x + y;
// z is "1020" (a string)
```

## Special Characters in Strings
Sometimes, you need to include special characters like quotes or backslashes in your string. Use a backslash (`\`) to escape them.

| Escape Code | Shows as | Meaning           |
|-------------|----------|-------------------|
| `\'`        | `'`      | Single quote      |
| `\"`        | `"`      | Double quote      |
| `\\`        | `\`      | Backslash         |

### Examples:
```java
String txt1 = "We are the so-called \"Vikings\" from the north.";
String txt2 = "It\'s alright.";
String txt3 = "The character \\ is called backslash.";
```

## More Escape Sequences with Examples
These help format your string output better!

| Code | What it Does      | Example |
|------|-------------------|---------|
| `\n` | New Line           | `System.out.println("Hello\nWorld");` → Hello \n World printed on two lines |
| `\r` | Carriage Return    | `System.out.println("Hello\rWorld");` → Output may vary based on system |
| `\t` | Tab                | `System.out.println("Hello\tWorld");` → Hello (tab) World |
| `\b` | Backspace          | `System.out.println("Hello\bWorld");` → Output: HellWorld |
| `\f` | Form Feed          | `System.out.println("Hello\fWorld");` → Output may vary, often ignored |

### Try it in Java:
```java
System.out.println("Line1\nLine2");
System.out.println("Carriage\rReturn");
System.out.println("Tabbed\tText");
System.out.println("Back\bspace");
System.out.println("Form\fFeed");
```

---
That's it! Strings are powerful and easy once you get the hang of them.
