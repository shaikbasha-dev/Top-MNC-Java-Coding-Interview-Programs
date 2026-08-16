# 03 — Java Concepts Used

## Concepts List

1. Graph
2. Adjacency list
3. BFS
4. DFS
5. Queue
6. Visited array

## Expanded Explanation

### Graph

A graph contains vertices connected by edges.

**General Example:**
```java
0 -- 1 -- 2
```

### Adjacency list

Each vertex stores a list of its neighboring vertices.

**General Example:**
```java
List<List<Integer>> graph;
```

### BFS

Breadth-First Search explores a graph level by level, normally using a queue.

**General Example:**
```java
Queue<Integer> queue = new LinkedList<>();
```

### DFS

Depth-first search explores one path as deeply as possible before backtracking.

**General Example:**
```java
dfs(graph, neighbor, visited);
```

### Queue

A queue follows FIFO order.

**General Example:**
```java
queue.offer(root);
```

### Visited array

Tracks vertices that have already been processed.

**General Example:**
```java
boolean[] visited = new boolean[n];
```
