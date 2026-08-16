# 05 — Method Definitions and Examples

## Definitions and Examples

1. `sort()`
2. `add()`

## Method Details

### `sort()`

#### Method Definition
Sorts interval rows by their starting value.

#### Simple General Example
```java
// Example idea for sort()
sort();
```

#### Why This Method Is Used Here
Sorting makes overlapping intervals appear next to each other.

#### What Happens If We Do Not Use It
The same responsibility would have to be implemented somewhere else. If it is omitted completely, the corresponding part of the algorithm cannot be performed correctly.

#### Interview Point
Be ready to explain what information the method receives, what it changes or returns, and why that responsibility is separated from the main method.

### `add()`

#### Method Definition
Adds a merged interval to the result list.

#### Simple General Example
```java
// Example idea for add()
add();
```

#### Why This Method Is Used Here
The result must store each completed non-overlapping interval.

#### What Happens If We Do Not Use It
The same responsibility would have to be implemented somewhere else. If it is omitted completely, the corresponding part of the algorithm cannot be performed correctly.

#### Interview Point
Be ready to explain what information the method receives, what it changes or returns, and why that responsibility is separated from the main method.
