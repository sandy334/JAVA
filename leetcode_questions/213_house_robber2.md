
# Leetcode 213 - House Robber II

## 🧩 Problem Summary

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses **form a circle**, which means the first house is adjacent to the last one. You **cannot rob two adjacent houses**.

Given an integer array `nums`, return the maximum amount of money you can rob without alerting the police.

---

## ✅ Java Code

```java
class Solution {
    public int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;
        int max1 = nums[0];
        int max2 = 0;

        // Case 1: Rob from house 0 to n-2 (exclude last house)
        for (int i = 0; i < nums.length - 1; i++) {
            max1 = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = max1;
        }

        // Reset rob1 and rob2 for second case
        rob1 = 0;
        rob2 = 0;

        // Case 2: Rob from house 1 to n-1 (exclude first house)
        for (int i = 1; i < nums.length; i++) {
            max2 = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = max2;
        }

        // Return the maximum from both cases
        return Math.max(max1, max2);
    }
}
```

---

## 🔍 Explanation

### 🔄 Why Two Loops?
Because the houses are in a circle, **we can't rob both the first and the last house**. So we consider two scenarios:

1. **Rob from house 0 to n-2** (skip the last house)
2. **Rob from house 1 to n-1** (skip the first house)

Take the **maximum** of these two scenarios.

### 🧠 Variables:

- `rob1`, `rob2`: Used to track previous maximum values like in standard House Robber I problem.
- `max1`, `max2`: Store the maximum rob values for the two scenarios.

### 💡 Dynamic Programming Formula:

For each house `i`:

```
max_current = max(rob1 + nums[i], rob2)
rob1 = rob2
rob2 = max_current
```

It means:
- Either rob current house and add it to rob1 (which excludes adjacent house)
- Or skip current house and take rob2

### ⏱️ Time Complexity:
- O(n), where n is the number of houses

### 📦 Space Complexity:
- O(1), constant space

---

## 📌 Edge Case:

- If there’s only one house: return `nums[0]` directly (handle separately if needed).

---

