# Leetcode 417 - Pacific Atlantic Water Flow 🌊

## 🧩 Problem Summary

Given an `m x n` matrix of `heights`, determine which cells water can flow to both the **Pacific** and **Atlantic** ocean.

Water can only flow from a cell to **another with equal or lower height** (up, down, left, right).

- Pacific Ocean touches the **top and left** edges.
- Atlantic Ocean touches the **bottom and right** edges.

---

## ✅ Goal

Find all cells `(i, j)` from which water can flow to **both oceans**.

---

## 🧠 Main Idea

Instead of simulating water flowing from every cell, we **reverse the flow**:

1. Start DFS **from the ocean borders**.
2. Track which cells are **reachable** from each ocean.
3. A cell is a valid result if it's reachable from **both** oceans.

---

## 🧱 Code Walkthrough

```java
class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length, cols = heights[0].length;
        boolean[][] pac = new boolean[rows][cols];
        boolean[][] atl = new boolean[rows][cols];
        
        // Start DFS from Pacific Ocean (Top & Left borders)
        for (int col = 0; col < cols; col++) {
            dfs(0, col, rows, cols, pac, heights[0][col], heights);
            dfs(rows - 1, col, rows, cols, atl, heights[rows - 1][col], heights);
        }
        for (int row = 0; row < rows; row++) {
            dfs(row, 0, rows, cols, pac, heights[row][0], heights);
            dfs(row, cols - 1, rows, cols, atl, heights[row][cols - 1], heights);
        }
        
        // Collect cells reachable from both oceans
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pac[i][j] && atl[i][j])
                    result.add(Arrays.asList(i, j));
            }
        }
        return result;
    }

    private void dfs(int row, int col, int rows, int cols, boolean[][] visited, int prevHeight, int[][] heights) {
        if (row < 0 || row >= rows || col < 0 || col >= cols ||
            visited[row][col] || prevHeight > heights[row][col]) return;

        visited[row][col] = true;
        
        dfs(row + 1, col, rows, cols, visited, heights[row][col], heights);
        dfs(row - 1, col, rows, cols, visited, heights[row][col], heights);
        dfs(row, col + 1, rows, cols, visited, heights[row][col], heights);
        dfs(row, col - 1, rows, cols, visited, heights[row][col], heights);
    }
}
```

---

## 🧭 DFS Explanation

- From ocean edge, move **only if**:
  - Cell is inside bounds
  - Not visited yet
  - Current height ≤ next cell height (reverse of natural water flow)

---

## ✅ Final Result Collection

Add `(i, j)` to result if it is reachable from **both `pac[][]` and `atl[][]`** matrices.

---

## 📈 Complexity

- **Time:** `O(m × n)` — each cell is visited twice (once per ocean)
- **Space:** `O(m × n)` — visited matrices + recursion stack

---

## 📝 Summary

- Reverse the water flow concept.
- Use DFS from ocean borders.
- Intersect reachable areas from both oceans.
