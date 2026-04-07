# Week 11 Notes

## Practice

- try reversing a string with a stack (1/w11/Reverse.java)
- try drawing sierpinski triangle fractal with a stack, no recursion (1/w11/Drawing.java)

## Postfix Calculator

to evaluate postfix expression with a stack:

- iterate over input (array of strings, operands and operators)
  - if an element is a number: push it onto the stack
  - if an element is an operator:
    - pop two numbers off the stack
    - evaluate using the operator
    - push result onto the stack
- top element of stack is the result of the expression
  - if we encounter an empty stack exception or the stack has a size other than 1, then
    there was a mistake in the postfix expression

## Queue ADT

Queue operations

- enqueue: add element to the back of the queue
- dequeue: remove element from the front of the queue
- peek: get element at front of queue without returning
- size
- isEmpty
- clear
