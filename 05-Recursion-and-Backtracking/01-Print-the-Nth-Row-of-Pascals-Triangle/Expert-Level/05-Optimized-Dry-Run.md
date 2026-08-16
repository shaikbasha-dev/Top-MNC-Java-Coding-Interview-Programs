# 05 — Optimized Dry Run

## Complete Expert-Level Program

```java
import java.util.*;

public class PascalNthRow {
    static List<Integer> getRow(int n) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            row.add(1);
            for (int j = i - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(getRow(n));
    }
}
```

## State Trace

Start with:

```text
n = 4
```

Then repeatedly:

```text
Choose -> Recurse -> Reach base case or reject -> Undo -> Try next choice
```

Final result:

```text
[1, 4, 6, 4, 1]
```
