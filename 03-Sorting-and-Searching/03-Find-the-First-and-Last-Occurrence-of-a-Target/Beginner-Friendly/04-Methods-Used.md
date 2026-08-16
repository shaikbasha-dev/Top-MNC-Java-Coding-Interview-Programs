# 04 — Methods Used

## Methods Used in This Program

1. `findFirst()`
2. `findLast()`

## Method Details

### `findFirst()`

#### Method Definition
Uses binary search but continues toward the left after finding the target.

#### Simple General Example
```java
// Example idea for findFirst()
findFirst();
```

#### Why This Method Is Used Here
A normal binary search can stop at any matching occurrence; this method finds the first one.

#### What Happens If We Do Not Use It
The same responsibility would have to be implemented somewhere else. If it is omitted completely, the corresponding part of the algorithm cannot be performed correctly.

#### Interview Point
Be ready to explain what information the method receives, what it changes or returns, and why that responsibility is separated from the main method.

### `findLast()`

#### Method Definition
Uses binary search but continues toward the right after finding the target.

#### Simple General Example
```java
// Example idea for findLast()
findLast();
```

#### Why This Method Is Used Here
It identifies the final occurrence without scanning the whole duplicate block.

#### What Happens If We Do Not Use It
The same responsibility would have to be implemented somewhere else. If it is omitted completely, the corresponding part of the algorithm cannot be performed correctly.

#### Interview Point
Be ready to explain what information the method receives, what it changes or returns, and why that responsibility is separated from the main method.
