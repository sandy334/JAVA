
# LeetCode 207 - Course Schedule 🧠

## Problem Statement:
There are `numCourses` courses labeled from `0` to `numCourses - 1`. You are given an array `prerequisites` where `prerequisites[i] = [a, b]` indicates that you must take course `b` before course `a`.

Return `true` if you can finish all courses. Otherwise, return `false`.

---

## ✅ Approach: DFS with Cycle Detection

We treat the courses and prerequisites as a **directed graph** and perform **Depth-First Search (DFS)** to detect **cycles**.

- Each course is a **node**.
- A prerequisite relationship like `[a, b]` creates a **directed edge** from `b → a`.
- If there's a **cycle**, you cannot finish all courses.

---

## 🔁 Steps:

1. **Build a graph** (adjacency list) from the prerequisites.
2. **Traverse each node** using DFS.
3. Use a `visited` set to **track recursion stack** and detect cycles.
4. If we reach a course that's already in the current path (`visited`), a cycle exists.
5. After exploring a node, we remove it from the path and **mark it as processed** by setting its adjacency list to `null`.

---

## ✅ Java Code

```java
import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> courseGraph = new HashMap<>();

        // Build adjacency list for the graph
        for (int[] pre : prerequisites) {
            if (courseGraph.containsKey(pre[1])) {
                courseGraph.get(pre[1]).add(pre[0]);
            } else {
                List<Integer> nextCourses = new LinkedList<>();
                nextCourses.add(pre[0]);
                courseGraph.put(pre[1], nextCourses);
            }
        }

        // Set to track recursion stack for cycle detection
        HashSet<Integer> visited = new HashSet<>();

        // Check each course for cycles
        for (int currentCourse = 0; currentCourse < numCourses; currentCourse++) {
            if (!courseSchedule(currentCourse, visited, courseGraph)) {
                return false;
            }
        }
        return true;
    }

    // Helper method to detect cycles using DFS
    public boolean courseSchedule(int course, HashSet<Integer> visited, HashMap<Integer, List<Integer>> courseGraph) {
        if (visited.contains(course)) {
            return false; // Cycle detected
        }
        if (!courseGraph.containsKey(course)) {
            return true; // No prerequisites to check
        }

        visited.add(course);

        for (int pre : courseGraph.get(course)) {
            if (!courseSchedule(pre, visited, courseGraph)) {
                return false;
            }
        }

        visited.remove(course); // Backtrack
        courseGraph.put(course, null); // Mark as processed
        return true;
    }
}
```

---

## 🧪 Example

**Input:** `numCourses = 2, prerequisites = [[1,0]]`  
**Output:** `true`  
**Explanation:** You can take course 0 then course 1.

**Input:** `numCourses = 2, prerequisites = [[1,0],[0,1]]`  
**Output:** `false`  
**Explanation:** There is a cycle: 0 → 1 → 0.

---

## ⏱️ Time and Space Complexity

- **Time Complexity:** `O(V + E)` — where `V` is number of courses, `E` is number of prerequisites.
- **Space Complexity:** `O(V + E)` — adjacency list + visited set.
...