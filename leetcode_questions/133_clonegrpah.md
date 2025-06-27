
# LeetCode 133: Clone Graph

## Problem Statement
You are given a reference of a node in a **connected** undirected graph.

Return a **deep copy** (clone) of the graph.

Each node in the graph contains a value (`int`) and a list (`List[Node]`) of its neighbors.

---

## Code

```java
class Solution {
    HashMap<Node, Node> visited = new HashMap<>();
    
    public Node cloneGraph(Node node) {
        // Base case: if the input node is null, return null
        if (node == null) {
            return node;
        }

        // If the node has already been visited and cloned, return the clone from the map
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        // Create a new node with the same value, but an empty neighbor list for now
        Node cloneNode = new Node(node.val, new ArrayList<>());

        // Store this clone in the visited map before recursion to avoid cycles
        visited.put(node, cloneNode);

        // Recursively clone and add all neighbors
        for (Node neighbor : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }

        // Return the clone node
        return cloneNode;
    }
}
```

---

## Approach

### 🔁 DFS with HashMap (Memoization)
This problem can be solved using **DFS traversal** while keeping track of already cloned nodes to prevent infinite loops (especially in graphs with cycles).

### Steps:
1. **Base Case:** If the `node` is `null`, return `null`.
2. **Visited Check:** If the node is already cloned (exists in the `visited` map), return the clone.
3. **Clone the Node:** Create a new `Node` object with the same value but an empty list of neighbors.
4. **Memoize:** Save the clone in the `visited` map to use it if we encounter this node again.
5. **Recurse:** Go through all the neighbors of the original node and add the recursively cloned neighbors to the clone’s neighbors list.
6. **Return:** Finally, return the cloned node.

---

## Time & Space Complexity

- **Time Complexity:** `O(N)` where `N` is the number of nodes in the graph. Each node is visited once.
- **Space Complexity:** `O(N)` for the visited map and recursion stack in the worst case.
