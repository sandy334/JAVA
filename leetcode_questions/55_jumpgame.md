
# 🏃‍♂️ Leetcode 55: Jump Game

## 📘 Problem Statement
You are given an array of non-negative integers `nums`. Each element represents your maximum jump length at that position.

Determine if you are able to reach the **last index** starting from the first index.

---

## 💡 Approach: Greedy (Backwards)

We iterate from the end of the array towards the beginning, updating the position we need to reach (called `finall`). If we can reach the current `finall` from a previous index `i`, then we update `finall` to `i`.

If in the end, `finall` is at index 0, that means we can jump from the start to the end.

---

## ✅ Java Code

```java
class Solution {
    public boolean canJump(int[] nums) {
        int finall = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= finall) {
                finall = i;
            }
        }
        return finall == 0;
    }
}
```

---

## 🧠 Dry Run Example

### Input:
```
nums = [2,3,1,1,4]
```

### Steps:
- Start from index 3: `3 + 1 >= 4` → ✅ Update `finall = 3`
- Index 2: `2 + 1 >= 3` → ✅ Update `finall = 2`
- Index 1: `1 + 3 >= 2` → ✅ Update `finall = 1`
- Index 0: `0 + 2 >= 1` → ✅ Update `finall = 0`

✅ We reached index 0 ⇒ It's possible to reach the end → return `true`

---

## 🔍 Key Logic Summary

- Start with `finall = last index`
- Loop from second last index to 0:
  - If `i + nums[i] >= finall`, we can jump to or past `finall`
  - Update `finall = i`
- Return `true` if `finall == 0`, else `false`

---

## ⏱️ Time & Space Complexity

| Complexity | Value    |
|------------|----------|
| Time       | O(n)     |
| Space      | O(1)     |

