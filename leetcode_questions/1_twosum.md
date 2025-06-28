
# 🧮 LeetCode Problem 1: Two Sum

## ✅ Problem Statement
Given an array of integers `nums` and an integer `target`, return the **indices** of the two numbers such that they add up to the target.

You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

## 🧠 Approach

We use a **HashMap** (also known as a dictionary) to store each number and its index as we iterate through the array.

### Steps:
1. Iterate through the array using index `i`.
2. For each number, calculate the difference `diff = target - nums[i]`.
3. Check if this `diff` already exists in the map.
   - If yes: Return the current index `i` and the index of `diff` from the map.
   - If not: Store the number and its index in the map.
4. If no solution is found after the loop, return `null`. (Though in this problem, a solution always exists.)

## 🔍 Java Code

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
```

## 💡 Example

**Input:**
```
nums = [2, 7, 11, 15]
target = 9
```

**Output:**
```
[0, 1]
```
Explanation: `nums[0] + nums[1] == 2 + 7 == 9`

## 📌 Time & Space Complexity

- **Time Complexity:** O(n) – We traverse the array once.
- **Space Complexity:** O(n) – We use a hashmap to store up to n elements.
