# Week 4 Notes

## Exceptions

- checked
  - compiler will force you to handle these
  - often means a type of error you can't prevent and should try to recover from
    or at least tell the program how to respond to
- unchecked
  - compiler will not make you handle these
  - often means a type of error that you can prevent by writing good code or
    checking a condition before the operation that might throw an exception
  - you're usually (not always) able to rewrite your code to stop these from
    happening instead of handling them with try-catch

I didn't write many notes, so I'm including the notes written during the other
section below.

- exceptions
  - exceptions are classes (types) that represent runtime errors
  - you can instantiate exceptions just like any other type of object
  - you can use the `throw` keyword to pass the exception to the caller of
    your method, which will crash the program if the caller doesn't handle it
  - java code and the jvm can throw exceptions when something is about to go
    wrong (about to divide by zero or index an array out of bounds, for example)
  - exceptions will crash a program unless handled by code (try-catch)

## Handling Exceptions

there are a few ways to respond to exceptions

- try-catch
  - attempts to run code in the `try` block
  - if an exception occurs, stops and checks the `catch` block(s)
  - if a catch block handles that kind of exception, then the catch block takes
    over
  - if no catch block handles that kind of exception, then the exception will
    pass to the caller as usual
- throw the exception
  - if an exception isn't handled, then it is thrown to the caller
  - checked exceptions can't be thrown like this unless the method is declared
    to throw that type of exception (see below)
  - you should throw the exception to the caller if it doesn't make sense to
    handle it in this method, not to avoid writing a try-catch
  - you can also instantiate and throw your own exceptions to signal that
    something went wrong and force the caller to handle it
- ignore the exception
  - usually a bad idea
  - declaring that `main` throws a checked exception will effectively treat it
    as an unchecked exception, which means the compiler won't warn you about it
    - remember, the compiler warns you about checked exceptions to help you
      avoid causing worse errors
    - it is almost always a terrible idea to do this in your main method
  - you can write a try-catch that does nothing to make the compiler think
    you've handled the exception, but this is also usually a bad idea
  - even if you can't recover from an exception, you can at least print a more
    user-friendly error message and fail gracefully instead of crashing with a
    stack trace
