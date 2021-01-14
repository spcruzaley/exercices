## Product Sum

### Description
Write a function that takes in a **"special"** array and returns its product sum.

A **"special"** array is a non-empty array that contains either integers or other **"special"** arrays. The product sum of a "special" array is the sum of its elements, where **"special"** arrays inside it are summed themselves and then multiplied by their level of depth.

The depth of a **"special"** array is how far nested it is. For instance, the depth of `[]` is `1` the depth of the inner array in `[[]]` is `2` the depth of the innermost array in `[[[]]]` is `3`.

### Example

Input
```java
inputArray = [[1, 2], 3, [4, 7, [2], 5]];
```

Output
```java
53 //Because '2' * (1 + 2) + 3 + '2' * (4 + 7 + '3' * 2 + 5)
```
