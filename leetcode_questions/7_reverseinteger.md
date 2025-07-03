# Reverse Integer – LeetCode Problem 7

## Problem Statement

Given a signed 32-bit integer `x`, return `x` with its digits reversed. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2^31, 2^31 - 1]`, then return 0.

**Note:** Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

### Examples

- Input: `x = 123`  
  Output: `321`

- Input: `x = -123`  
  Output: `-321`

- Input: `x = 120`  
  Output: `21`

### Constraints

- `-2^31 <= x <= 2^31 - 1`

---

## ✅ Java Solution

```java
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
```

---

## 💡 Explanation

- Pop last digit using `x % 10`
- Append it to result using `rev * 10 + digit`
- Shrink `x` using `x / 10`
- Check for 32-bit overflow before updating `rev`
