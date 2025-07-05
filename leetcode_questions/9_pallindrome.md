### 📘 LeetCode 9: Palindrome Number
---

### 🧠 Problem Statement:

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

An integer is a palindrome when it reads the same forward and backward.

---

### 🧮 Examples:

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and right to left.
```

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
Therefore it is not a palindrome.
```

```
Input: x = 10
Output: false
Explanation: 10 reads as 01 from right to left. Therefore, it is not a palindrome.
```

---

### 💡 Approach:

1. Negative numbers are not palindromes.
2. Reverse the integer and compare it with the original.
3. If they are equal, it is a palindrome.

This method avoids converting the number to a string and uses mathematical operations instead.

---

### ✅ Code (Java):

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int xcopy = x;
        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }
        return reverse == xcopy;
    }
}
```

---


