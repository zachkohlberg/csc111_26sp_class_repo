# Week 7 Notes

## Recursive Linear/Binary Search

inputs:

- array to search
- start index (inclusive)
- end index (exclusive)
- target value

### Linear

- base case (fail): start = end ---> -1
- base case (success): target = array[start] ---> start
- recursive case: search from start + 1 to end

### Binary

also calculate mid from inputs: mid = (start + end) / 2

- base case (fail): start = end ---> -1
- base case (success): target = array[mid] ---> mid
- recursive case (lower): target < array[mid] ---> search from start to mid
- recursive case (upper): target > array[mid] ---> search from mid + 1 to end

## Guess Bot

notes

- can only ask whether secret is greater than a number, can't check for equality

input

- min value
- max value

calculate mid from inputs: mid = (min + max) / 2

algorithm

- base case: min = max ---> min (or max, doesn't matter)
- recursive case (upper): secret > mid ---> search from mid + 1 to max
- recursive case (lower): search from min to mid

