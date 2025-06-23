

# Java Recursion

## What is Recursion?

**Definition:**  
Recursion is a programming technique where a method calls itself to solve a problem.  
It helps break down complex problems into smaller, simpler ones.

---

## How Recursion Works

A recursive method keeps calling itself with different arguments until it reaches a stopping point, called the **halting condition** or **base case**.  
Without a base case, the recursion would go on forever.

---

## Example 1: Calculating Factorial

Let’s use recursion to calculate the factorial of a number.  
The factorial of 5 (written as 5!) is 5 × 4 × 3 × 2 × 1 = 120.

```java
public class Main {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial: " + result);
    }

    public static int factorial(int n) {
        if (n == 1) { // Base case: stop when n is 1
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }
}
```
**Output:**
```
Factorial: 120
```
**Explanation:**  
- The method keeps multiplying `n` by `factorial(n-1)` until `n` is 1.
- When `n` is 1, it just returns 1 and stops calling itself.

---

## Example 2: Printing a Countdown

Let’s print a countdown from a given number to 1 using recursion.

```java
public class Main {
    public static void main(String[] args) {
        countdown(5);
    }

    public static void countdown(int n) {
        if (n == 0) { // Base case: stop when n is 0
            System.out.println("Go!");
        } else {
            System.out.println(n);
            countdown(n - 1); // Recursive call
        }
    }
}
```
**Output:**
```
5
4
3
2
1
Go!
```
**Explanation:**  
- The method prints the number and calls itself with `n-1`.
- When `n` reaches 0, it prints "Go!" and stops.

---

## Example 3: Sum of an Array Using Recursion

Let’s add all numbers in an array using recursion.

```java
public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        int result = sumArray(numbers, 0);
        System.out.println("Sum: " + result);
    }

    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) { // Base case: end of array
            return 0;
        } else {
            return arr[index] + sumArray(arr, index + 1); // Recursive call
        }
    }
}
```
**Output:**
```
Sum: 20
```
**Explanation:**  
- The method adds the current element to the sum of the rest of the array.
- When the index reaches the end, it returns 0.

---

## Why Use Recursion?

- Makes code shorter and sometimes easier to understand for problems that have a natural recursive structure (like trees, factorial, Fibonacci, etc.).
- Can replace some loops, especially when breaking down a problem is easier with self-calls.

---

## Be Careful!

- Always make sure to have a base case to stop the recursion.
- Too much recursion can use a lot of memory (stack overflow error).
- Not always the most efficient way for every problem.

---

## Key Points

- Recursion is when a method calls itself.
- Always include a base case to stop the recursion.
- Recursion is great for problems that can be divided into similar subproblems.

