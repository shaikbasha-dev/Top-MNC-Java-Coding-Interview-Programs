# 03 — Java Concepts Used

## Concepts List

1. Graph
2. Adjacency list
3. DFS
4. Visited array
5. Parent tracking

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

### DFS

Depth-first search explores one path as deeply as possible before backtracking.

**General Example:**
```java
dfs(graph, neighbor, visited);
```

### Visited array

Tracks vertices that have already been processed.

**General Example:**
```java
boolean[] visited = new boolean[n];
```

### Parent tracking

In an undirected DFS, the parent prevents the edge back to the previous vertex from being mistaken for a cycle.

**General Example:**
```java
dfs(graph, next, node, visited);
```
