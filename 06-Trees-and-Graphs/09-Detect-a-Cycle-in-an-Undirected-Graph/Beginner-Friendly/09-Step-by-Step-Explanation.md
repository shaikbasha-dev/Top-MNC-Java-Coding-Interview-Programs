# 09 — Step-by-Step Explanation

## Complete Program

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

## Program Explanation

1. **Program setup:** Define the node class and required data structures.
2. **Input construction:** Build the sample tree or graph.
3. **Initialization:** Set the root, start vertex, queue, visited array or required variables.
4. **Boundary check:** Handle null nodes or already visited vertices.
5. **Core operation:** Apply traversal, recursion, BST search or graph search.
6. **Child/neighbor processing:** Explore the next required nodes.
7. **Result calculation:** Combine values or identify the requested node/result.
8. **Output:** Display the final answer.
