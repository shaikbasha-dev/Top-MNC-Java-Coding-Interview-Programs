# 09 — Step-by-Step Explanation

## Complete Program

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

## Step-by-Step Program Explanation

1. **Program setup:** Define the class and required helper methods.
2. **Input setup:** Create the sample data.
3. **Initial call:** Start recursion with the initial index, position or state.
4. **Base-case check:** Determine whether the complete solution has been formed.
5. **Make a choice:** Select one possible candidate.
6. **Recursive call:** Solve the remaining smaller problem.
7. **Backtrack:** Undo the choice so another branch can be explored.
8. **Repeat:** Continue until every required branch has been processed.
9. **Output:** Display or return the generated result.
