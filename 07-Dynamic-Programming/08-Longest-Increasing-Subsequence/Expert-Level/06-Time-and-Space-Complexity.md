# 06 — Time and Space Complexity

## Time Complexity

**O(n²)**

## Space Complexity

**O(n)**

## How to Analyze DP Complexity

1. Count the number of states.
2. Count the work performed for each state.
3. Multiply states by transition cost.
4. Count the size of the DP table.
5. Check whether the table can be reduced to rolling variables.

## Interview Answer

Dynamic Programming complexity is usually determined by:

**Number of states × transition work per state**

Space is determined by the number of stored states, unless the state can be compressed.
