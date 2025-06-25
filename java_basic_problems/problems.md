

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
## 7. Calculate Factorial

**Problem:**  
Calculate the factorial of a number.

**Solution:**
```java
public class Factorial {
    public static void main(String[] args) {
        int n = 5, fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        System.out.println("Factorial: " + fact);
    }
}
```

**Explanation:**  
Multiply all numbers from 1 to n to get the factorial.

---

## 8. Reverse a String

**Problem:**  
Reverse a given string.

**Solution:**
```java
public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + rev);
    }
}
```

**Explanation:**  
`StringBuilder` has a built-in `reverse()` method for strings.

---

## 9. Check Palindrome String

**Problem:**  
Check if a string is a palindrome.

**Solution:**
```java
public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
```

**Explanation:**  
A palindrome reads the same forward and backward.

---

## 10. Fibonacci Series up to n Terms

**Problem:**  
Print the first `n` Fibonacci numbers.

**Solution:**
```java
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
```

**Explanation:**  
Each number is the sum of the previous two.

---

## 11. Find Prime Number

**Problem:**  
Check if a number is prime.

**Solution:**
```java
public class PrimeCheck {
    public static void main(String[] args) {
        int num = 7, count = 0;
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0) count++;
        if (count == 0 && num > 1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
```

**Explanation:**  
A prime number has no divisors other than 1 and itself.

---

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

## 20. Count Even and Odd in Array
**Problem:** Count the number of even and odd numbers in an array.

**Solution:**
```java
public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }
}
```
**Explanation:** Use modulus to separate even and odd numbers.

---

## 21. Check Armstrong Number
**Problem:** Check if a number is an Armstrong number (sum of cubes of its digits equals the number).

**Solution:**
```java
public class Armstrong {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (num == sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
```
**Explanation:** Extract each digit, cube it, and sum; compare with original.

---

## 22. Reverse an Integer
**Problem:** Reverse the digits of an integer.

**Solution:**
```java
public class ReverseInteger {
    public static void main(String[] args) {
        int num = 1234, rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed: " + rev);
    }
}
```
**Explanation:** Extract digits and build the reversed number.

---

## 23. Find GCD of Two Numbers
**Problem:** Find the greatest common divisor (GCD) of two numbers.

**Solution:**
```java
public class GCD {
    public static void main(String[] args) {
        int a = 54, b = 24;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD: " + a);
    }
}
```
**Explanation:** Uses the Euclidean algorithm for GCD.

---

## 24. Find LCM of Two Numbers
**Problem:** Find the least common multiple (LCM) of two numbers.

**Solution:**
```java
public class LCM {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int lcm = (a * b) / gcd(a, b);
        System.out.println("LCM: " + lcm);
    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```
**Explanation:** LCM is calculated using the formula (a * b) / GCD(a, b).

---

## 25. Print Multiplication Table
**Problem:** Print the multiplication table of a number.

**Solution:**
```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }
}
```
**Explanation:** Use a loop to multiply n by numbers 1 to 10.

---

## 26. Print All Prime Numbers in Range
**Problem:** Print all prime numbers between two numbers.

**Solution:**
```java
public class PrimesInRange {
    public static void main(String[] args) {
        int start = 10, end = 20;
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++)
                if (i % j == 0) { isPrime = false; break; }
            if (isPrime && i > 1) System.out.print(i + " ");
        }
    }
}
```
**Explanation:** Check each number in the range for primality.

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


## 36. Insert Element in Array

**Problem:**  
Insert an element at a specific position in an array.

**Solution:**
```java
import java.util.*;
public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int insertIndex = 2, element = 3;
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, k = 0; i < newArr.length; i++) {
            if (i == insertIndex) newArr[i] = element;
            else newArr[i] = arr[k++];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
```
**Explanation:**  
We create a new array with one extra slot. As we copy elements, we insert the new element at the specified index and shift the rest.

## 37. Find Length of String

**Problem:**  
Find the length of a string.

**Solution:**
```java
public class StringLength {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Length: " + str.length());
    }
}
```
**Explanation:**  
The `length()` method returns the number of characters in the string.

## 38. Convert String to Uppercase

**Problem:**  
Convert a string to uppercase.

**Solution:**
```java
public class Uppercase {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.toUpperCase());
    }
}
```
**Explanation:**  
The `toUpperCase()` method converts all characters in the string to uppercase.

## 39. Convert String to Lowercase

**Problem:**  
Convert a string to lowercase.

**Solution:**
```java
public class Lowercase {
    public static void main(String[] args) {
        String str = "HELLO";
        System.out.println(str.toLowerCase());
    }
}
```
**Explanation:**  
The `toLowerCase()` method converts all characters in the string to lowercase.

## 40. Concatenate Two Strings

**Problem:**  
Concatenate two strings.

**Solution:**
```java
public class Concatenate {
    public static void main(String[] args) {
        String a = "Hello", b = "World";
        System.out.println(a + " " + b);
    }
}
```
**Explanation:**  
The `+` operator joins two strings together with a space in between.


## 41. Replace Character in String

**Problem:**  
Replace all occurrences of a character in a string.

**Solution:**
```java
public class ReplaceChar {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.replace('l', 'p'));
    }
}
```
**Explanation:**  
The `replace()` method replaces all occurrences of the specified character with another.

## 42. Split String into Array

**Problem:**  
Split a string into an array of words.

**Solution:**
```java
import java.util.*;
public class SplitString {
    public static void main(String[] args) {
        String str = "Java is fun";
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
    }
}
```
**Explanation:**  
The `split(" ")` method splits the string at each space, creating an array of words.

## 43. Check if String Contains Substring

**Problem:**  
Check if a string contains a specific substring.

**Solution:**
```java
public class ContainsSubstring {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(str.contains("world"));
    }
}
```
**Explanation:**  
The `contains()` method checks if the substring exists in the string.

## 44. Find Index of Character in String

**Problem:**  
Find the index of a character in a string.

**Solution:**
```java
public class IndexOfChar {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.indexOf('e'));
    }
}
```
**Explanation:**  
The `indexOf()` method returns the position of the first occurrence of the character.

## 45. Convert Integer to String

**Problem:**  
Convert an integer to a string.

**Solution:**
```java
public class IntToString {
    public static void main(String[] args) {
        int num = 123;
        String str = Integer.toString(num);
        System.out.println(str);
    }
}
```
**Explanation:**  
`Integer.toString()` converts an integer to its string representation.


## 46. Convert String to Integer

**Problem:**  
Convert a string to an integer.

**Solution:**
```java
public class StringToInt {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
}
```
**Explanation:**  
`Integer.parseInt()` parses the string and returns the integer value.

## 47. Reverse a Linked List (Iterative)

**Problem:**  
Reverse a singly linked list.

**Solution:**
```java
class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}
public class ReverseLinkedList {
    public static Node reverse(Node head) {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
```
**Explanation:**  
We use three pointers to reverse the links between nodes, making the previous node the next node at each step.

## 48. Swap Two Strings Without Temp Variable

**Problem:**  
Swap two string variables without using a temporary variable.

**Solution:**
```java
public class SwapStrings {
    public static void main(String[] args) {
        String a = "hello", b = "world";
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("a=" + a + ", b=" + b);
    }
}
```
**Explanation:**  
Concatenate both strings, then use substring to extract the original values in swapped order.

## 49. Remove Duplicates from String

**Problem:**  
Remove duplicate characters from a string.

**Solution:**
```java
public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray())
            if (sb.indexOf(String.valueOf(c)) == -1) sb.append(c);
        System.out.println(sb.toString());
    }
}
```
**Explanation:**  
We build a new string, adding each character only if it hasn't already been added.

## 50. Find Most Repeated Word in Text

**Problem:**  
Find the most repeated word in a text.

**Solution:**
```java
import java.util.*;
public class MostRepeatedWord {
    public static void main(String[] args) {
        String text = "this is a test this is only a test";
        String[] words = text.split("\\s+");
        Map freq = new HashMap<>();
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
We split the text into words, count each word's frequency using a map, and then find the word with the highest count.

