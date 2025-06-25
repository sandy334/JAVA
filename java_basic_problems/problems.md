# 50 Basic Java Problems with Full Explanations

## 1. Print "Hello, World!"

**Problem:**  
Write a Java program to print "Hello, World!" to the console.

**Solution:**
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
**Explanation:**  
Every Java program starts with a class. The `main` method is the entry point. `System.out.println` prints the message to the console.

## 2. Sum of Two Numbers

**Problem:**  
Write a program to add two numbers and display the result.

**Solution:**
```java
public class Sum {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
```
**Explanation:**  
We declare two integers, add them, and print the result using concatenation.

## 3. Swap Two Numbers

**Problem:**  
Swap the values of two variables.

**Solution:**
```java
public class Swap {
    public static void main(String[] args) {
        int a = 5, b = 10, temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a + ", b=" + b);
    }
}
```
**Explanation:**  
A temporary variable is used to hold one value while swapping.

## 4. Check Even or Odd

**Problem:**  
Check if a number is even or odd.

**Solution:**
```java
public class EvenOdd {
    public static void main(String[] args) {
        int num = 7;
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
```
**Explanation:**  
The modulus operator `%` checks for a remainder when divided by 2.

## 5. Find Largest of Two Numbers

**Problem:**  
Find the largest of two numbers.

**Solution:**
```java
public class Largest {
    public static void main(String[] args) {
        int a = 10, b = 20;
        if (a > b)
            System.out.println(a + " is larger");
        else
            System.out.println(b + " is larger");
    }
}
```
**Explanation:**  
A simple if-else statement compares the two numbers.

## 6. Print Numbers 1 to 10

**Problem:**  
Print numbers from 1 to 10 using a loop.

**Solution:**
```java
public class OneToTen {
    public static void main(String[] args) {
        for (int i = 1; i  1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
```
**Explanation:**  
A prime number has no divisors other than 1 and itself.

## 12. Sum of Array Elements

**Problem:**  
Find the sum of elements in an array.

**Solution:**
```java
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : arr)
            sum += num;
        System.out.println("Sum: " + sum);
    }
}
```
**Explanation:**  
Use a for-each loop to add all elements.

## 13. Find Largest in Array

**Problem:**  
Find the largest element in an array.

**Solution:**
```java
public class LargestArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 9, 5};
        int max = arr[0];
        for (int num : arr)
            if (num > max) max = num;
        System.out.println("Largest: " + max);
    }
}
```
**Explanation:**  
Iterate and update the max value found so far.

## 14. Count Vowels in String

**Problem:**  
Count the number of vowels in a string.

**Solution:**
```java
public class CountVowels {
    public static void main(String[] args) {
        String str = "hello world";
        int count = 0;
        for (char c : str.toCharArray())
            if ("aeiouAEIOU".indexOf(c) != -1) count++;
        System.out.println("Vowels: " + count);
    }
}
```
**Explanation:**  
Check each character against the set of vowels.

## 15. Reverse an Array

**Problem:**  
Print the elements of an array in reverse order.

**Solution:**
```java
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}
```
**Explanation:**  
Start from the last index and move backwards.

## 16. Remove White Spaces from String

**Problem:**  
Remove all white spaces from a string.

**Solution:**
```java
public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "This is a test string";
        System.out.println(str.replaceAll("\\s", ""));
    }
}
```
**Explanation:**  
`replaceAll("\\s", "")` removes all space characters.

## 17. Find Number of Elements in Array

**Problem:**  
Find the length of an array.

**Solution:**
```java
public class ArrayLength {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Length: " + array.length);
    }
}
```
**Explanation:**  
Arrays have a built-in `length` property.

## 18. Calculate Average of Array

**Problem:**  
Find the average of array elements.

**Solution:**
```java
public class AverageOfArray {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int num : array) sum += num;
        double average = (double) sum / array.length;
        System.out.println("Average: " + average);
    }
}
```
**Explanation:**  
Sum all elements and divide by the number of elements.

## 19. Find Smallest in Array

**Problem:**  
Find the smallest element in an array.

**Solution:**
```java
public class SmallestArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        int min = arr[0];
        for (int num : arr)
            if (num  1) System.out.print(i + " ");
        }
    }
}
```
**Explanation:**  
Check each number in the range for primality.

## 27. Find Duplicate Elements in Array

**Problem:**  
Find and print duplicate elements in an array.

**Solution:**
```java
public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3};
        for (int i = 0; i  set = new LinkedHashSet<>();
        for (int n : arr) set.add(n);
        System.out.println(set);
    }
}
```
**Explanation:**  
A `Set` automatically removes duplicates.

## 29. Find Frequency of Character in String

**Problem:**  
Count how many times a character appears in a string.

**Solution:**
```java
public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello";
        char ch = 'l';
        int count = 0;
        for (char c : str.toCharArray())
            if (c == ch) count++;
        System.out.println("Frequency: " + count);
    }
}
```
**Explanation:**  
Iterate over the string and count matches.

## 30. Find Second Largest in Array

**Problem:**  
Find the second largest element in an array.

**Solution:**
```java
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        System.out.println("Second Largest: " + second);
    }
}
```
**Explanation:**  
Track both the largest and second largest values.

## 31. Merge Two Arrays

**Problem:**  
Merge two arrays into one.

**Solution:**
```java
import java.util.*;
public class MergeArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3}, b = {4, 5, 6};
        int[] merged = new int[a.length + b.length];
        System.arraycopy(a, 0, merged, 0, a.length);
        System.arraycopy(b, 0, merged, a.length, b.length);
        System.out.println(Arrays.toString(merged));
    }
}
```
**Explanation:**  
Use `System.arraycopy` to combine arrays.

## 32. Sort Array in Ascending Order

**Problem:**  
Sort the elements of an array in ascending order.

**Solution:**
```java
import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
```
**Explanation:**  
`Arrays.sort()` sorts the array in place.

## 33. Linear Search in Array

**Problem:**  
Search for an element in an array using linear search.

**Solution:**
```java
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int key = 6;
        boolean found = false;
        for (int n : arr)
            if (n == key) found = true;
        System.out.println(found ? "Found" : "Not Found");
    }
}
```
**Explanation:**  
Check each element until the key is found.

## 34. Binary Search in Array

**Problem:**  
Search for an element in a sorted array using binary search.

**Solution:**
```java
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int key = 8;
        int index = Arrays.binarySearch(arr, key);
        System.out.println(index >= 0 ? "Found" : "Not Found");
    }
}
```
**Explanation:**  
`Arrays.binarySearch` returns the index if found, negative otherwise.

## 35. Remove Element from Array

**Problem:**  
Remove an element at a specific index from an array.

**Solution:**
```java
import java.util.*;
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int removeIndex = 2;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, k = 0; i  freq = new HashMap<>();
        for (String word : words)
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        String most = null;
        int max = 0;
        for (Map.Entry e : freq.entrySet())
            if (e.getValue() > max) { max = e.getValue(); most = e.getKey(); }
        System.out.println("Most repeated: " + most);
    }
}
```
**Explanation:**  
Use a map to count word frequencies, then find the word with the highest count.
