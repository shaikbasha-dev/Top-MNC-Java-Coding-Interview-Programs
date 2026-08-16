# 05 — Method Definitions and Examples

## Definitions and Examples

1. `add()`
2. `poll()`

## Method Details

### `add()`

#### Method Definition
Adds an element to a PriorityQueue.

#### Simple General Example
```java
// Example idea for add()
add();
```

#### Why This Method Is Used Here
The heap maintains the smallest value among the current k largest elements.

#### What Happens If We Do Not Use It
The same responsibility would have to be implemented somewhere else. If it is omitted completely, the corresponding part of the algorithm cannot be performed correctly.

#### Interview Point
Be ready to explain what information the method receives, what it changes or returns, and why that responsibility is separated from the main method.

### `poll()`

#### Method Definition
Removes the smallest element from the min-heap.

#### Simple General Example
```java
// Example idea for poll()
poll();
```

#### Why This Method Is Used Here
It discards the smallest candidate when more than k elements are stored.

#### What Happens If We Do Not Use It
The same responsibility would have to be implemented somewhere else. If it is omitted completely, the corresponding part of the algorithm cannot be performed correctly.

#### Interview Point
Be ready to explain what information the method receives, what it changes or returns, and why that responsibility is separated from the main method.
