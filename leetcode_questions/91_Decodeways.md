
# Leetcode 91 - Decode Ways

This Java program solves the "Decode Ways" problem using dynamic programming with constant space.

## 🧩 Problem Summary

Each letter maps to a number:  
- `'A' -> 1`, `'B' -> 2`, ..., `'Z' -> 26`  
Given a string containing only digits, return the total number of ways to decode it.

---

## ✅ Java Code

```java
class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0; // A string starting with '0' is invalid.
        }

        int one = 1; // Represents the number of ways to decode up to the previous character
        int two = 1; // Represents the number of ways to decode up to two characters ago

        for (int i = 1; i < s.length(); i++) {
            int current = 0;

            // Case 1: Current character is not '0', so it can be decoded alone
            if (s.charAt(i) != '0') {
                current = one;
            }

            // Case 2: Check if the two-digit number is between 10 and 26
            int value = Integer.parseInt(s.substring(i - 1, i + 1));
            if (value >= 10 && value <= 26) {
                current = current + two; // Valid two-digit decoding
            }

            // Move the window forward for next iteration
            two = one;
            one = current;
        }
        return one; // Final answer
    }
}
```

---

## 🧠 Explanation

### 🔹 Base Case:
- If the first character is `'0'`, return `0` immediately, as `'0'` can't be decoded alone.

### 🔹 Variables:
- `one` keeps track of the number of ways to decode the string up to the previous character.
- `two` keeps track of the number of ways to decode up to two characters ago.

### 🔹 Loop through characters (from index 1 to end):
- `current = 0` is used to calculate the number of ways for this character.
- If `s.charAt(i) != '0'`: it's a valid single-digit decode → add `one` ways.
- If the two-digit number formed by `s.substring(i-1, i+1)` is between 10 and 26 → add `two` ways.
- Slide the window: update `two` and `one` for next iteration.

### 🔹 Final Result:
- Return `one` which holds the number of decodings for the full string.

---

## 📌 Time & Space Complexity

- **Time Complexity:** `O(n)` — where `n` is the length of the string.
- **Space Complexity:** `O(1)` — only constant extra variables are used.

---

## 🧪 Example

### Input: `"226"`  
- Decoding options: `"2 2 6"`, `"22 6"`, `"2 26"`  
- Output: `3`

---
