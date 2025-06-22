
# Java While Loop Explained (Layman Terms)

Loops help us repeat actions in code without writing the same thing over and over.

## What is a While Loop?

A **while loop** keeps running a block of code as long as a condition is true.

### Syntax

```java
while (condition) {
  // code to repeat
}
```
- The loop checks the condition first.
- If true, it runs the code inside.
- If false, it stops.

---

## Example 1: Counting from 0 to 4

```java
int i = 0;
while (i  0) {
  System.out.println(countdown);
  countdown--;
}
System.out.println("Happy New Year!!");
```
**What happens?**
- Prints 3, 2, 1, then "Happy New Year!!"

---

## Example 4: Yatzy Game

```java
int dice = 1;
while (dice <= 6) {
  if (dice < 6) {
    System.out.println("No Yatzy.");
  } else {
    System.out.println("Yatzy!");
  }
  dice++;
}
```
**What happens?**
- Prints "No Yatzy." for dice values 1 to 5.
- Prints "Yatzy!" when dice is 6.

---

## Key Points

- Remember to update the variable in the condition, or the loop will never stop (infinite loop)
- Use while loops when you don't know how many times you need to repeat the code in advance.
- The loop stops as soon as the condition becomes false.

