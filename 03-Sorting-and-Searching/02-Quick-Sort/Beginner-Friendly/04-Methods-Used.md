# 04 — Methods Used

## Methods Used in This Program

1. `quickSort()`
2. `partition()`

## Method Details

### `quickSort()`

#### Method Definition
Recursively sorts the portions on both sides of the pivot.

#### Simple General Example
```java
// Example idea for quickSort()
quickSort();
```

#### Why This Method Is Used Here
It breaks the complete sorting task into smaller sorting tasks.

#### What Happens If We Do Not Use It
The same responsibility would have to be implemented somewhere else. If it is omitted completely, the corresponding part of the algorithm cannot be performed correctly.

#### Interview Point
Be ready to explain what information the method receives, what it changes or returns, and why that responsibility is separated from the main method.

### `partition()`

#### Method Definition
Places the chosen pivot into its correct final position.

#### Simple General Example
```java
// Example idea for partition()
partition();
```

#### Why This Method Is Used Here
It separates smaller and larger values around the pivot.

#### What Happens If We Do Not Use It
The same responsibility would have to be implemented somewhere else. If it is omitted completely, the corresponding part of the algorithm cannot be performed correctly.

#### Interview Point
Be ready to explain what information the method receives, what it changes or returns, and why that responsibility is separated from the main method.
