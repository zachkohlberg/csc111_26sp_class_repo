# Week 5 Notes

## Generic For vs Recursive Function

for loop template:

```java
void f(int start, int count) {
    for (int i = start; i < count; i++) {
        DO_SOMETHING();
    }
}

f(START, COUNT);
```

recursive function that imitates a for loop:

```java
void f(int i, int count) {
    if (i < count) {
        DO_SOMETHING();
        f(i + 1, count);
    }
}

f(START, COUNT);
```


