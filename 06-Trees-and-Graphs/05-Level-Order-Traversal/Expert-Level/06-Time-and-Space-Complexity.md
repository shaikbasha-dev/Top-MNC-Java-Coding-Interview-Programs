# 06 — Time and Space Complexity

## Time Complexity

**O(n)**

## Space Complexity

**O(n) queue in the worst case**

## How to Explain It

1. Count every node or vertex processed.
2. For graphs, count both vertices and edges.
3. Count queue/stack size.
4. Count recursion depth.
5. Include auxiliary arrays such as `visited`.

## Interview Answer

For a tree with `n` nodes, a complete traversal is generally **O(n)**. For a graph with `V` vertices and `E` edges, BFS/DFS using adjacency lists is generally **O(V + E)**.
