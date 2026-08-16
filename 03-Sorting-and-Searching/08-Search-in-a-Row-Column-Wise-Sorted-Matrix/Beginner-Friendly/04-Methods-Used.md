# 04 — Methods Used

## Methods Used in This Program

1. `search()`

## Method Details

### `search()`

#### Method Definition
Starts at the top-right cell and eliminates one row or one column at every step.

#### Simple General Example
```java
// Example idea for search()
search();
```

#### Why This Method Is Used Here
It uses both row-wise and column-wise ordering to avoid checking every cell.

#### What Happens If We Do Not Use It
The same responsibility would have to be implemented somewhere else. If it is omitted completely, the corresponding part of the algorithm cannot be performed correctly.

#### Interview Point
Be ready to explain what information the method receives, what it changes or returns, and why that responsibility is separated from the main method.
