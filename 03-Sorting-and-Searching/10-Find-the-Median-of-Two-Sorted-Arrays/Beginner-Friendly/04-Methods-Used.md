# 04 — Methods Used

## Methods Used in This Program

1. `findMedian()`
2. `max()/min()`

## Method Details

### `findMedian()`

#### Method Definition
Finds a valid partition between two sorted arrays and derives the median from the boundary values.

#### Simple General Example
```java
// Example idea for findMedian()
findMedian();
```

#### Why This Method Is Used Here
It solves the problem without fully merging the arrays.

#### What Happens If We Do Not Use It
The same responsibility would have to be implemented somewhere else. If it is omitted completely, the corresponding part of the algorithm cannot be performed correctly.

#### Interview Point
Be ready to explain what information the method receives, what it changes or returns, and why that responsibility is separated from the main method.

### `max()/min()`

#### Method Definition
Selects the correct partition boundary values.

#### Simple General Example
```java
// Example idea for max()/min()
max()/min();
```

#### Why This Method Is Used Here
The median depends on the largest left-side value and smallest right-side value.

#### What Happens If We Do Not Use It
The same responsibility would have to be implemented somewhere else. If it is omitted completely, the corresponding part of the algorithm cannot be performed correctly.

#### Interview Point
Be ready to explain what information the method receives, what it changes or returns, and why that responsibility is separated from the main method.
