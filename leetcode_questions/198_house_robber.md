# Leetcode 198 - House Robber

## 🧩 Problem Statement

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, represented by an integer array `nums`.

You **cannot rob two adjacent houses** because the security system will alert the police.

**Return the maximum amount of money you can rob tonight without alerting the police.**

### ✅ Constraints:
- `1 <= nums.length <= 100`
- `0 <= nums[i] <= 400`

---

## 🔍 Example:

### Input:
```

nums = \[2, 7, 9, 3, 1]

```

### Output:
```

12

````

### Explanation:
Rob house 1 (2) + house 3 (9) + house 5 (1) = **12**

---

## 💡 Optimized Dynamic Programming Solution (O(1) Space)

```java
class Solution {
    public int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = max;
        }

        return max;
    }
}
````

---

## 🧠 Explanation:

### Variables:

* `rob1`: Max amount robbed from house 0 to i-2
* `rob2`: Max amount robbed from house 0 to i-1
* `max`: Temporary variable to hold the new max after considering house i

### Logic:

At each house `i`, we decide:

* Either rob it: `rob1 + nums[i]`
* Or skip it: `rob2`
* Choose the **maximum** of the two.

Then update:

```java
rob1 = rob2;
rob2 = max;
```

---

## 🕒 Time & Space Complexity:

* **Time:** O(n)
* **Space:** O(1)

---

## ✅ Summary:

* You only need two variables to keep track of previous maximums.
* Elegant, efficient solution using bottom-up dynamic programming.
* No extra array needed.
it is so simple

