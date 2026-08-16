# 10 — Beginner-Friendly Code Explanation

## Complete Code

```java
import java.util.*;

public class CycleInUndirectedGraph {
    static void addEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static boolean hasCycle(List<List<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];

        for (int start = 0; start < graph.size(); start++) {
            if (!visited[start] && dfs(graph, start, -1, visited)) {
                return true;
            }
        }
        return false;
    }

    static boolean dfs(List<List<Integer>> graph, int node, int parent, boolean[] visited) {
        visited[node] = true;

        for (int next : graph.get(node)) {
            if (!visited[next]) {
                if (dfs(graph, next, node, visited)) return true;
            } else if (next != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int vertices = 3;
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) graph.add(new ArrayList<>());

        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 0);

        System.out.println("Cycle Detected = " + hasCycle(graph));
    }
}
```

## Beginner-Friendly Explanation

- The `Node` class represents a tree node.
- `left` and `right` references connect a binary tree node to its children.
- `main()` creates the sample structure.
- The core method receives the root or graph and starts processing.
- In recursive tree problems, a null node means there is nothing more to process.
- In BFS, the queue stores nodes that still need to be processed.
- In DFS, recursion continues deeper into an unvisited neighbor.
- The visited array prevents repeated graph processing.
- In a BST, values tell us whether to move left or right.
- The final print statement displays the requested result.

### Beginner Tip

For every tree problem ask:

**“What should happen at the current node, and what should happen in its left and right subtrees?”**

For graph problems ask:

**“Which neighbors have I already visited?”**
