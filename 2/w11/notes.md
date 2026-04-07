# Week 11 Notes

## Queue ADT

queue operations are similar to stack:

- enqueue: add element to back of queue
- dequeue: remove element from front of queue
- peek: get front element without removing it
- clear
- size
- isEmpty

## Postfix Calculator

infix: operator between operands, 2 + 2 = 4

postfix: operator after operands, 2 2 + = 4

parsing/evaluating postfix:

- make a stack
- iterate over input (command line args, string array containing operators and operands)
  - if number: push onto stack
  - if operator:
    - pop two elements from stack
    - apply operator to elements
    - push result onto stack
- top (only) element is the result
