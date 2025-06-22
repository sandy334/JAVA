
# Java For Loop Examples

## 1. Printing Numbers from 1 to 5

```java
for (int i = 1; i  0; i--) {
    System.out.println("Countdown: " + i);
}
System.out.println("Start!");
```
**Output:**
```
Countdown: 10
Countdown: 9
...
Countdown: 1
Start!
```
This loop starts at 10 and counts down to 1, decreasing by 1 each time

---

## 4. Printing Multiples of 3 up to 15

```java
for (int i = 3; i <= 15; i += 3) {
    System.out.println(i);
}
```
**Output:**
```
3
6
9
12
15
```
This loop prints numbers that are multiples of 3, starting from 3 up to 15

---

## 5. Printing All Items in a Shopping List (For-Each Loop)

```java
String[] shoppingList = {"Milk", "Eggs", "Bread"};
for (String item : shoppingList) {
    System.out.println(item);
}
```
**Output:**
```
Milk
Eggs
Bread
```
The for-each loop is a simple way to go through all items in an array

---

## 6. Nested Loop: Printing a 2x3 Grid

```java
for (int row = 1; row <= 2; row++) {
    for (int col = 1; col <= 3; col++) {
        System.out.print("(" + row + "," + col + ") ");
    }
    System.out.println();
}
```
**Output:**
```
(1,1) (1,2) (1,3) 
(2,1) (2,2) (2,3) 
```
This uses a loop inside another loop to print grid coordinates

---

## 7. Printing Each Character in a Word

```java
String word = "JAVA";
for (int i = 0; i < word.length(); i++) {
    System.out.println(word.charAt(i));
}
```
**Output:**
```
J
A
V
A
```
This loop prints each letter of the word "JAVA" one by one

---

## 8. Adding Numbers from 1 to 10

```java
int sum = 0;
for (int i = 1; i <= 10; i++) {
    sum += i;
}
System.out.println("Sum is: " + sum);
```
**Output:**
```
Sum is: 55
```
This loop calculates the sum of numbers from 1 to 10

---

## Key Points

- The for loop is great when you know how many times you want to repeat something.
- The for-each loop is useful for going through every item in an array or list.
- Nested loops help with grids or tables.
- Always make sure your loop will eventually stop, or it could run forever.
