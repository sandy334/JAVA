### 📘 LeetCode 172: Factorial Trailing Zeroes

---

### 🧠 Problem Statement:

Given an integer `n`, return the number of trailing zeroes in `n!` (n factorial).

You must write an algorithm that runs in logarithmic time complexity.

---

### 🧮 Example:

```
Input: n = 5  
Output: 1  
Explanation: 5! = 120, which has one trailing zero.
```

```
Input: n = 20  
Output: 4  
Explanation: 20! = 2432902008176640000, which has four trailing zeros.
```

---

### 💡 Approach:

Trailing zeroes in a factorial are produced by factors of 10, and since `10 = 2 × 5`, and there are always more factors of 2 than 5 in `n!`, we only count the number of times 5 is a factor.

We do this by:

1. Dividing `n` by 5 (how many numbers ≤ n are divisible by 5),
2. Then divide `n` by 25 (how many are divisible by 25),
3. Then `n` by 125, etc.,
4. Summing all those gives total count of trailing zeroes.

This runs in `O(log₅ n)` time.

---

### ✅ Code (Java):

```java
class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        while (n > 0) {
            n /= 5;
            res += n;
        }
        return res;
    }
}
```

---

