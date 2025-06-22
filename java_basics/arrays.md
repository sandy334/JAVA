# Java Arrays

## What is an Array?

**Definition:**  
An array in Java is a container that lets you store many values of the same type in a single variable. Instead of creating a separate variable for each value, you can use an array to keep them all together

---

## Declaring and Initializing Arrays

**Declaring an Array:**  
To declare an array, write the data type, followed by square brackets, and then the variable name.

```java
int[] scores;
String[] colors;
```
This means `scores` can store a list of integers, and `colors` can store a list of strings

**Initializing an Array:**  
You can give values to an array right away, or later.

- **At the time of declaration:**

```java
int[] scores = {85, 90, 78, 92};
String[] colors = {"Red", "Green", "Blue"};
```

- **By specifying size first, then adding values:**

```java
int[] ages = new int[4]; // Array with 4 integer spots, all start as 0
ages[0] = 25;
ages[1] = 30;
ages[2] = 22;
ages[3] = 28;
```
Here, you create an array that can hold 4 numbers and then fill in each spot

---

## Accessing Array Elements

You can get a value from an array by using its index (position).  
Remember: Array indexes start at 0. The first element is at index 0, the second at 1, and so on.

**Example:**

```java
String[] cities = {"Paris", "London", "Rome"};
System.out.println(cities[1]); // Prints "London"
```
This prints the city at position 1, which is "London"

---

## Changing Array Elements

You can change any value in the array by assigning a new value to its index.

**Example:**

```java
int[] ages = {18, 21, 24};
ages[1] = 22; // Change the second value to 22
System.out.println(ages[1]); // Prints 22
```
This updates the value at index 1

---

## Array Length

To find out how many elements are in an array, use the `.length` property.

**Example:**

```java
double[] prices = {9.99, 14.99, 7.50, 12.00};
System.out.println(prices.length); // Prints 4
```
This tells you the array has 4 items

---

## Looping Through an Array

You can use a loop to go through each element in an array.

**Example: Print all fruit names**

```java
String[] fruits = {"Apple", "Banana", "Cherry"};
for (int i = 0; i  highest) {
        highest = score;
    }
}
System.out.println("The highest score is: " + highest);
```
**Explanation:**  
- Start by assuming the first score is the highest.
- Go through each score.
- If a score is higher than the current highest, update it.
- Print the final highest score.

---

## Multidimensional Arrays

A multidimensional array is like a table with rows and columns.

**Declaration and Initialization:**

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
```
Here, `matrix` has 2 rows and 3 columns

**Accessing Elements:**

```java
System.out.println(matrix[1][2]); // Prints 6
```
This gets the value in the second row, third column.

**Changing a Value:**

```java
matrix[0][1] = 9; // Changes the value in the first row, second column to 9
```

**Looping Through a 2D Array:**

```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```
This prints all values in the matrix row by row.

---

## Key Points

- Arrays store multiple values of the same type in one variable
- Indexes start at 0.
- The length of an array is fixed once it is created.
- Use loops to access or change all elements.
- Multidimensional arrays are useful for tables or grids.


