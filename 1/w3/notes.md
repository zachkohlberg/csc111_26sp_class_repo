# Week 3 Notes

## Defining a Type

- classes define types:

```java
class TypeName {

    // contents

}
```

- instance variables normally go at the beginning of a class:
  - just need type and name
  - no initialization necessary (default values will be assigned)
  - you can initialize them if you want to

```java
class Dog {
    // instance variable:
    String name;

}
```

- constructors normally go next
  - should initialize all instance variables
  - looks like a method, but no return type
  - same name as the class
  - the instance being initialized is implicitly passed as "this"

```java
class Dog {
    // instance variable:
    String name;

    Dog(String initName) {
        this.name = initName;
    }
}
```

- methods go after constructors
  - has a return type, name, parameter list, and body
  - the instance we called the method on is implicitly passed as "this"

```java
class Dog {
    // instance variable:
    String name;

    Dog(String initName) {
        this.name = initName;
    }

    void sayHello() {
        System.out.printf("Bark! Hello, my name is %s.\n", this.name);
    }
}
```

If we make the instance parameter explicit, we might write the code like this (won't compile):

```java
class Dog {
    // instance variable:
    String name;
}

void constructor(Dog this, String initName) {
    this.name = initName;
}

void sayHello(Dog this) {
    System.out.printf("Bark! Hello, my name is %s.\n", this.name);
}
```

## Using a User-Defined Type

note about terminology:

- "end user" refers to a (typically nonprogrammer) user of our software
- user can also refer to another programmer who uses your programming language
  or a library you're writing

what can we do with our type?

- our type is now a type!
  - we can define variables of our type

```java
OurType x = ...;
Dog y = ...;
```

- we can initialize these variable by **instantiating** our type
  - we can instantiate a class with `new ClassName(...)`, which both creates a
    new object and calls the constructor to initialize it

```java
// declare a Dog variable
Dog a;
// initialize the variable by instantiating a Dog
a = new Dog("Fido");
```

- we can call instance methods on our object
  - we need a variable that stores an instance of our class to call the method on
  - that object is implicitly passed to that method (see `this` above)

```java
Dog a = ...;

a.sayHello();
```

## Class vs Instance

Variables and methods can belong to either the class or every instance of the
class.



