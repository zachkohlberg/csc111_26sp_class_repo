# Week 5 Notes

## Recursion/For Templates

for loop template:

```java
void f(int start, int end) {
    for (int i = start; i < end; i++) {
        DO_SOMETHING();
    }
}

f(START, END);
```

recursive function imitating above for loop:

```java
void f(int i, int end) {
    if (i < end) {
        DO_SOMETHING();
        f(i + 1, end);
    }
}

f(START, END);
```

## Minimal Versions of Above Functions

```java
for (int i = 0; i < COUNT; i++) {
    DO_SOMETHING();
}
```

```java
void f(int i) {
    if (i < COUNT) {
        DO_SOMETHING();
        f(i + 1);
    }
}

f(0);
```
