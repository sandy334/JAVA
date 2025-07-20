# **DSA Patterns – Java Implementations (With Explanations)**

This repository contains **15 common DSA (Data Structures and Algorithms) patterns** implemented in Java.  
Each section includes:
- **Pattern Name & Problem Summary**
- **Java Code with Line-by-Line Explanation (comments)**
- **Time and Space Complexity Analysis**

---

## **Pattern 1: Prefix Sum**

### **Problem Summary**
The prefix sum array stores cumulative sums: `prefix[i] = nums[0] + nums[1] + ... + nums[i]`.  
It helps in answering subarray sum queries in O(1) time.

### **Code with Explanation**
```java
class PrefixSum {
    public static int[] computePrefixSum(int[] nums) {
        int[] prefix = new int[nums.length];  // Create array to store prefix sums
        prefix[0] = nums[0];                  // First prefix is same as first element
        for (int i = 1; i < nums.length; i++) // Start from second element
            prefix[i] = prefix[i - 1] + nums[i]; // Add current element to previous prefix sum
        return prefix;                        // Return prefix array
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] prefix = computePrefixSum(nums); // Compute prefix sum
        for (int sum : prefix) 
            System.out.print(sum + " ");       // Print: 1 3 6 10
    }
}
```

### **Time Complexity:** O(n)  
### **Space Complexity:** O(n)

---

## **Pattern 2: Two Pointers**

### **Problem Summary**
Given a sorted array, check if there exists a pair of elements whose sum equals a target.

### **Code with Explanation**
```java
class TwoPointers {
    public static boolean hasPairWithSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;    // Start from both ends
        while (left < right) {                    // Until pointers meet
            int sum = nums[left] + nums[right];   // Current pair sum
            if (sum == target) return true;       // Found target
            if (sum < target) left++;             // If sum too small, move left pointer right
            else right--;                         // Else, move right pointer left
        }
        return false;                             // No such pair
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 11};
        System.out.println(hasPairWithSum(nums, 9)); // Output: true
    }
}
```

### **Time Complexity:** O(n)  
### **Space Complexity:** O(1)

---

## **Pattern 3: Sliding Window**

### **Problem Summary**
Find the maximum sum of any contiguous subarray of size k.

### **Code with Explanation**
```java
class SlidingWindow {
    public static int maxSum(int[] nums, int k) {
        int windowSum = 0, maxSum = 0;
        for (int i = 0; i < k; i++)                // Sum of first k elements
            windowSum += nums[i];
        maxSum = windowSum;                        // Initialize max sum

        for (int i = k; i < nums.length; i++) {    // Slide window
            windowSum += nums[i] - nums[i - k];    // Add new element and remove first of window
            maxSum = Math.max(maxSum, windowSum);  // Update max sum
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        System.out.println(maxSum(nums, 3));       // Output: 9
    }
}
```

### **Time Complexity:** O(n)  
### **Space Complexity:** O(1)

---

## **Pattern 4: Fast & Slow Pointers (Cycle Detection)**

### **Problem Summary**
Detects if a linked list has a cycle using Floyd's cycle detection algorithm.

### **Code with Explanation**
```java
class FastSlowPointers {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }     // Node constructor
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;                     // Move slow by 1
            fast = fast.next.next;                // Move fast by 2
            if (slow == fast) return true;        // If they meet, cycle exists
        }
        return false;                             // No cycle
    }
}
```

### **Time Complexity:** O(n)  
### **Space Complexity:** O(1)

---

## **Pattern 5: In-place Linked List Reversal**

### **Problem Summary**
Reverse a singly linked list.

### **Code with Explanation**
```java
class LinkedListReversal {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;    // Save next node
            curr.next = prev;                 // Reverse current node's pointer
            prev = curr;                      // Move prev forward
            curr = nextNode;                  // Move curr forward
        }
        return prev;                          // New head of reversed list
    }
}
```

### **Time Complexity:** O(n)  
### **Space Complexity:** O(1)

---

## **Pattern 6: Monotonic Stack (Next Greater Element)**

### **Problem Summary**
Find the next greater element for each element in the array.

### **Code with Explanation**
```java
import java.util.*;

class MonotonicStack {
    public static int[] nextGreater(int[] nums) {
        Stack<Integer> stack = new Stack<>();  // Stores indices
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);                  // Default value if no greater element

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                res[stack.pop()] = nums[i];    // nums[i] is next greater for top index
            }
            stack.push(i);                     // Push current index
        }
        return res;
    }
}
```

### **Time Complexity:** O(n)  
### **Space Complexity:** O(n)

---

## **Pattern 7: Top K Elements (Heap)**

### **Problem Summary**
Find the k largest elements using a min-heap.

### **Code with Explanation**
```java
import java.util.*;

class TopKElements {
    public static int[] findTopK(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Min-heap
        for (int num : nums) {
            minHeap.offer(num);              // Add element to heap
            if (minHeap.size() > k)          // Keep only k elements
                minHeap.poll();
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) 
            result[i] = minHeap.poll();      // Extract elements
        return result;
    }
}
```

### **Time Complexity:** O(n log k)  
### **Space Complexity:** O(k)

---

## **Pattern 8: Overlapping Intervals**

### **Problem Summary**
Merge overlapping intervals.

### **Code with Explanation**
```java
import java.util.*;

class OverlappingIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])); // Sort by start
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (current[1] >= intervals[i][0]) {
                current[1] = Math.max(current[1], intervals[i][1]);  // Merge
            } else {
                result.add(current);
                current = intervals[i];
            }
        }
        result.add(current);
        return result.toArray(new int[0][]);
    }
}
```

### **Time Complexity:** O(n log n)  
### **Space Complexity:** O(n)

---

## **Pattern 9: Modified Binary Search**

### **Problem Summary**
Search for a target in a rotated sorted array.

### **Code with Explanation**
```java
class ModifiedBinarySearch {
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;  // Found target

            if (nums[low] <= nums[mid]) {         // Left side sorted
                if (nums[low] <= target && target < nums[mid]) 
                    high = mid - 1;
                else low = mid + 1;
            } else {                              // Right side sorted
                if (nums[mid] < target && target <= nums[high]) 
                    low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }
}
```

### **Time Complexity:** O(log n)  
### **Space Complexity:** O(1)

---

## **Pattern 10: Binary Tree Traversal (Inorder)**

### **Problem Summary**
Perform inorder traversal on a binary tree.

### **Code with Explanation**
```java
class BinaryTreeTraversal {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);               // Traverse left
        System.out.print(root.val + " "); // Visit root
        inorder(root.right);              // Traverse right
    }
}
```

### **Time Complexity:** O(n)  
### **Space Complexity:** O(h), where h is the tree height.

---

## **Pattern 11: Depth-First Search (DFS)**

### **Problem Summary**
Traverse a graph using DFS recursion.

### **Code with Explanation**
```java
import java.util.*;

class DFS {
    public static void dfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {
        if (visited.contains(node)) return;
        visited.add(node);                   // Mark node as visited
        System.out.print(node + " ");        // Process node
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            dfs(graph, neighbor, visited);   // Recursively visit neighbors
        }
    }
}
```

### **Time Complexity:** O(V + E)  
### **Space Complexity:** O(V)

---

## **Pattern 12: Breadth-First Search (BFS)**

### **Problem Summary**
Traverse a graph level-by-level.

### **Code with Explanation**
```java
import java.util.*;

class BFS {
    public static void bfs(Map<Integer, List<Integer>> graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(start);                   // Add start node
        visited.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();          // Visit front
            System.out.print(node + " ");     // Process node
            for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);    // Add unvisited neighbors
                }
            }
        }
    }
}
```

### **Time Complexity:** O(V + E)  
### **Space Complexity:** O(V)

---

## **Pattern 13: Matrix Traversal**

### **Problem Summary**
Print all elements of a matrix row by row.

### **Code with Explanation**
```java
class MatrixTraversal {
    public static void traverse(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                System.out.print(matrix[i][j] + " ");
    }
}
```

### **Time Complexity:** O(m * n)  
### **Space Complexity:** O(1)

---

## **Pattern 14: Backtracking (N-Queens)**

### **Problem Summary**
Place N queens on an N×N chessboard such that no two queens attack each other.

### **Code with Explanation**
```java
import java.util.*;

class Backtracking {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');
        solve(0, board, result);
        return result;
    }

    private static void solve(int row, char[][] board, List<List<String>> result) {
        if (row == board.length) {
            List<String> solution = new ArrayList<>();
            for (char[] r : board)
                solution.add(new String(r));
            result.add(solution);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isValid(board, row, col)) {
                board[row][col] = 'Q';        // Place queen
                solve(row + 1, board, result);// Recurse for next row
                board[row][col] = '.';        // Backtrack
            }
        }
    }

    private static boolean isValid(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }
}
```

### **Time Complexity:** O(N!)  
### **Space Complexity:** O(N^2)

---

## **Pattern 15: Dynamic Programming (0/1 Knapsack)**

### **Problem Summary**
Given weights and values, maximize value in a knapsack of capacity W.

### **Code with Explanation**
```java
class DynamicProgramming {
    public static int knapsack(int[] weights, int[] values, int W) {
        int n = weights.length;
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (weights[i - 1] <= w)
                    dp[i][w] = Math.max(dp[i - 1][w],
                                        dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }
        return dp[n][W];
    }
}
```

### **Time Complexity:** O(n * W)  
### **Space Complexity:** O(n * W)

---
