# 09 — Step-by-Step Explanation

## Complete Program

```java
import java.util.*;

public class GraphBFSAndDFS {
    static void addEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static void bfs(List<List<Integer>> graph, int start) {
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int next : graph.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }

    static void dfs(List<List<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int next : graph.get(node)) {
            if (!visited[next]) {
                dfs(graph, next, visited);
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) graph.add(new ArrayList<>());

        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);

        System.out.print("BFS: ");
        bfs(graph, 0);

        System.out.print("\nDFS: ");
        dfs(graph, 0, new boolean[vertices]);
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
