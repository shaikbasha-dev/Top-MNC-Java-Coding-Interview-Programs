# 05 — Optimized Dry Run

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

## State Trace

Start:

```text
Edges: 0-1, 1-2, 2-0
```

Then track the root/current vertex, child/neighbor selection, queue/recursion state and final result after every major operation.

Final:

```text
Cycle Detected = true
```
