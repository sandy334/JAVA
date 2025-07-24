
# 🍊 Rotting Oranges – Java Solution Explained Line-by-Line

## Problem Statement
Given a grid where:
- `0` represents an empty cell,
- `1` represents a fresh orange,
- `2` represents a rotten orange,

Each minute, any fresh orange adjacent to a rotten one becomes rotten. Return the minimum number of minutes to rot all oranges, or `-1` if not possible.

---

## ✅ Java Code with Explanation

```java
class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int totalFresh = 0;

        // Step 1: Add rotten oranges to queue and count fresh oranges
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 2) {
                    queue.add(new int[]{row, col});
                } else if (grid[row][col] == 1) {
                    totalFresh++;
                }
            }
        }

        if (totalFresh == 0) return 0; // No fresh oranges to rot

        int minutesElapsed = 0;
        int totalRotted = -1 * queue.size(); // Initial rotten are not from fresh

        int[] dRow = {0, 0, 1, -1};
        int[] dCol = {1, -1, 0, 0};

        // BFS processing
        while (!queue.isEmpty()) {
            int currentLevelSize = queue.size();
            totalRotted += currentLevelSize;

            for (int i = 0; i < currentLevelSize; i++) {
                int[] position = queue.poll();
                int currentRow = position[0];
                int currentCol = position[1];

                for (int dir = 0; dir < 4; dir++) {
                    int newRow = currentRow + dRow[dir];
                    int newCol = currentCol + dCol[dir];

                    if (newRow < 0 || newCol < 0 || newRow >= rows || newCol >= cols)
                        continue;
                    if (grid[newRow][newCol] != 1)
                        continue;

                    grid[newRow][newCol] = 2;
                    queue.add(new int[]{newRow, newCol});
                }
            }

            if (!queue.isEmpty()) minutesElapsed++;
        }

        return totalRotted == totalFresh ? minutesElapsed : -1;
    }
}
```

---

## 🧠 Explanation Highlights

- `Queue<int[]> queue` is used for BFS traversal.
- `totalFresh` counts how many oranges need to be rotted.
- The loop spreads rot every minute level-by-level.
- We track how many got rotted in `totalRotted`.
- The minute counter `minutesElapsed` increases only if new oranges were rotted.

---

## ✅ Output
- Returns number of minutes if successful.
- Returns `-1` if not all fresh oranges could rot.

---

## 📌 Edge Case
- If `totalFresh == 0`, returns `0` immediately (nothing to rot).
