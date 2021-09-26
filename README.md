# [Arrays and List](https://redi-school.github.io/intermediate-java/arrays-arraylist/)

## [Print reversed array](./src/main/java/com/redi/j2/PrintReversed.java)

1. Complete the method `printReversedArray` that will print an `int` array reversed. For an array
   `{1,3,5,2,4}`, it prints `{4,2,5,3,1}`
2. Write another method `printReversedList` that will print an `Integer` array reversed.

## [Merge 2 arrays](./src/main/java/com/redi/j2/Merge.java)

1. Complete the method `mergeArrays` that will merge two int arrays into another int array and
   returns it. The merge rule is that for each index, that the element of the first array goes
   before the element of the second array e.g.

   ```
   first = {2, 5, 9}
   second = {1, 4, 0}
   merge = {2, 1, 5, 4, 9, 0}
   ```
   The two arrays are of the same length.

2. Write another method `mergeLists` that will do the same using `List` of `Integers`.

> However, how would you handle it if the two arrays are of different length?

## [Find an element](./src/main/java/com/redi/j2/FindElement.java)

1. Complete the method `findFirstInArray` that gets as input a `String` array and a `String`. The
   method should return the first position of the string in this array or -1 if the string is not in
   the array.
2. Write another method called `findLastInArray` that returns the last position of the element.
3. Write the equivalent methods `findFirstInList` and `findLastInList` that does the same as above
   but using a list instead.

## [Second smallest](./src/main/java/com/redi/j2/SecondSmallest.java)

Complete the method `secondSmallest` to return the second-smallest item in an array of integers.

For example 
- the second smallest of `[0, 1, 2, 3]` is `1`
- the second smallest of `[1, 3, 4, 1, 1, 4, 2]` is `2` and
- the second smallest of `[2]` is `2`
