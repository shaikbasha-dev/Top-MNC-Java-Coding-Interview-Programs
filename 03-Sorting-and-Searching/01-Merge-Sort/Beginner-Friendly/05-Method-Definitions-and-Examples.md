# 05 — Method Definitions and Examples

## Definitions and Examples

1. `mergeSort()`
2. `merge()`

## Method Details

### `mergeSort()`

#### Method Definition
Recursively divides the array into smaller ranges until each range contains one element.

#### Simple General Example
```java
// Example idea for mergeSort()
mergeSort();
```

#### Why This Method Is Used Here
Without it, the divide-and-conquer structure would not be implemented.

#### What Happens If We Do Not Use It
The same responsibility would have to be implemented somewhere else. If it is omitted completely, the corresponding part of the algorithm cannot be performed correctly.

#### Interview Point
Be ready to explain what information the method receives, what it changes or returns, and why that responsibility is separated from the main method.

### `merge()`

#### Method Definition
Combines two already-sorted portions into one sorted portion.

#### Simple General Example
```java
// Example idea for merge()
merge();
```

#### Why This Method Is Used Here
Without it, the sorted halves could not be combined into the final sorted range.

#### What Happens If We Do Not Use It
The same responsibility would have to be implemented somewhere else. If it is omitted completely, the corresponding part of the algorithm cannot be performed correctly.

#### Interview Point
Be ready to explain what information the method receives, what it changes or returns, and why that responsibility is separated from the main method.
