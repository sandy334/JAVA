

# Java Break and Continue

## Break Statement

**Definition:**  
The break statement is used to immediately stop a loop, even if the loop’s condition is still true. When Java sees break inside a loop, it jumps out of the loop and continues with the code after the loop

**Example 1: Stop Loop When a Number is Found**
```java
for (int i = 1; i <= 10; i++) {
    if (i == 6) {
        break; // Stop the loop when i is 6
    }
    System.out.println(i);
}
```
**Output:**
```
1
2
3
4
5
```
The loop stops printing numbers after reaching 5, because when i becomes 6, break is executed.

**Example 2: Searching in a List**
```java
String[] fruits = {"Apple", "Banana", "Mango", "Cherry"};
for (String fruit : fruits) {
    if (fruit.equals("Mango")) {
        System.out.println("Found Mango!");
        break; // Stop searching after finding Mango
    }
}
```
**Output:**
```
Found Mango!
```
The loop ends as soon as "Mango" is found

---

## Continue Statement

**Definition:**  
The continue statement skips the rest of the code inside the loop for the current iteration and jumps to the next round of the loop. The loop itself does not stop; only the current cycle is skipped

**Example 1: Skip a Number**
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // Skip printing when i is 3
    }
    System.out.println(i);
}
```
**Output:**
```
1
2
4
5
```
The number 3 is skipped; the loop continues with the next numbers.

**Example 2: Print Only Odd Numbers**
```java
for (int i = 1; i <= 7; i++) {
    if (i % 2 == 0) {
        continue; // Skip even numbers
    }
    System.out.println(i);
}
```
**Output:**
```
1
3
5
7
```
Only odd numbers are printed; even numbers are skipped[3][5].

---

## Break and Continue in a While Loop

**Break Example:**
```java
int n = 1;
while (n <= 10) {
    if (n == 5) {
        break; // Stop the loop when n is 5
    }
    System.out.println(n);
    n++;
}
```
**Output:**
```
1
2
3
4
```

**Continue Example:**
```java
int n = 0;
while (n < 5) {
    n++;
    if (n == 3) {
        continue; // Skip printing when n is 3
    }
    System.out.println(n);
}
```
**Output:**
```
1
2
4
5
```

---

## Summary Table

| Statement | What It Does                                  | When to Use                        |
|-----------|-----------------------------------------------|------------------------------------|
| break     | Stops the loop completely                     | When you want to exit a loop early |
| continue  | Skips to the next loop iteration              | When you want to skip one round    |

---

**How to use this file:**  
Copy all the text above, paste it into a text editor, and save it as break_continue.md.  
This file gives you clear definitions and practical examples of break and continue in Java.

