# 10 — Beginner-Friendly Code Explanation

## Complete Code

```java
public class ClimbingStairs {
    static int countWays(int n) {
        if (n <= 1) return 1;
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Ways = " + countWays(n));
    }
}
```

## Line-by-Line Beginner Explanation

- The class contains the complete solution.
- `main()` creates the starting input.
- The recursive method receives the current state.
- The base case answers the question: **“Have we completed one valid solution?”**
- If not, the program tries one possible choice.
- The recursive call means: **“Now solve the remaining smaller problem.”**
- After returning, the program undoes the choice.
- This undo operation is the heart of backtracking.
- The loop tries the next possible choice.
- The process continues until all valid branches are explored.

### Easy Way to Remember

**Choose → Explore → Undo → Choose another.**
