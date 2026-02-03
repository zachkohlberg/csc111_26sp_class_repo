# Week 3 Notes

## Defining a Type

- declare a class

```java
// declaring a class creates a new type
class MyNewType {

    // contents

}
```

- instance variables are normally at the start of a class
  - just need type and name
  - you can initialize an instance variable, but you don't have to
  - if you don't initialize it, it will get the default value for its type

```java
class Dog {
    // instance variable
    String name;

}
```

- constructors are usually after instance variables
  - look similar to functions/methods
  - no return type, and the name matches the class name
  - constructor's job is to initialize the object
  - constructor is run on a new object that needs to be initialized, which it
    implicitly receives as `this`

```java
class Dog {
    // instance variable
    String name;

    // constructor
    Dog(String initName) {
        this.name = initName;
    }
}
```

- methods are usually after constructors
  - instance methods are implicitly passed the instance they were called on as
    `this`

```java
class Dog {
    // instance variable
    String name;

    // constructor
    Dog(String initName) {
        this.name = initName;
    }

    void sayHello() {
        System.out.printf("Bark! Hello, my name is %s.\n", this.name);
    }
}
```

the `this` keyword

- usually isn't necessary unless you need to resolve some ambiguity with
  variable names
- I'm keeping it in some examples to make them more explicit

## Working With User-Defined Types

note about terminology:

- "end user" is someone who uses software and typically isn't a programmer
- user can also refer to a programmer using your library or programming
  language

what can we do with our type?

- it's a type, so you can declare variables with it

```java
// declare and initialize
Dog a = ...;
// just declare
Dog b;
// then initialize
b = ...;
```

- create objects of that type with "new TypeName(...)"
  - this is called instantiating our class
   - easy to confuse instantiate (create and initialize an object) with
     initializing a variable
  - the new keyword creates a new uninitialized object
  - the constructor initializes the object

```java
Dog a = new Dog("Fido");
```

- call instance methods on those objects
  - start with the instance (the variable that refers to the instance), then a
    dot, and then the method name
  - the instance is implicitly passed to the method

```java
Dog a = ...;

a.sayHello();
```

