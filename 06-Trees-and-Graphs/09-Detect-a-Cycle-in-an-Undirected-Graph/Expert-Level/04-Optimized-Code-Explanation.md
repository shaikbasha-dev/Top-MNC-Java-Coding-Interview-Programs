# 04 — Optimized Code Explanation

## Complete Expert-Level Program

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

## Expert Explanation

The implementation uses the strongest property of the selected data structure.

### Key Points

1. Each node or vertex is processed only when necessary.
2. Recursive results are combined without redundant full traversals where possible.
3. BFS uses FIFO ordering.
4. DFS uses depth-first exploration.
5. BST search uses ordering to eliminate entire subtrees.
6. Graph cycle detection uses visited and parent state.
