
# 🚀 Leetcode 62: Unique Paths

## 📘 Problem Statement
There is a robot located at the top-left corner of an `m x n` grid. The robot can only move either **down** or **right** at any point in time. The robot is trying to reach the bottom-right corner of the grid.

Find **how many possible unique paths** are there to reach the destination.

---

## 💡 Approach: Dynamic Programming

We use a 2D DP table `dp[i][j]` where each cell represents the number of unique paths to reach that position.

### 🔧 Transition Formula:
```
dp[i][j] = dp[i-1][j] + dp[i][j-1]
```

### 🧱 Base Case:
- Only **one** path to reach any cell in the first row (→ moves only).
- Only **one** path to reach any cell in the first column (↓ moves only).

---

## ✅ Java Code

```java
import java.util.Arrays;

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // Fill the dp table with 1s for base case
        for (int[] row : dp) {
            Arrays.fill(row, 1);
        }

        // Fill the rest using the recurrence
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // The result is in the bottom-right cell
        return dp[m - 1][n - 1];
    }
}
```

---

## 🧠 Dry Run Example

For `m = 3`, `n = 3`, the `dp` table evolves as:

```
Step 1 (after filling base):
1 1 1
1 - -
1 - -

Step 2 (filling rest):
1 1 1
1 2 3
1 3 6
```

👉 Output: `6` (Total unique paths)

---

## ⏱️ Time & Space Complexity

| Complexity | Value      |
|------------|------------|
| Time       | O(m × n)   |
| Space      | O(m × n)   |

