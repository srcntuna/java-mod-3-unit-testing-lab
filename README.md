# Unit Testing Lab

## Learning Goals

- Write tests to check program logic

## Introduction

Let's consider the classic "FizzBuzz" logic problem: given a string `str`, if
the string starts with "f", return "Fizz". If the string ends with "b", return
"Buzz". If both previous conditions are true, return "FizzBuzz". In all other
cases, return the original `str` value.

Let's consider some code that looks like it should solve this problem:

```java
public String fizzBuzzString(String str) {
    if (str.startsWith("f"))  return "Fizz";
    if (str.endsWith("b")) return "Buzz";

    if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";

    return str;
}
```

## Instructions

This code has 2 bugs! Write unit tests to test the logic and find the bugs -
here are the steps:j

1. Test the "starts with f" case first - this should pass.
2. Test the "ends with b" case - this should also pass.
3. Test the "starts with f and ends with b" case - _this will not pass_.
4. Fix the logic in the solution so that all 3 test cases pass.
5. Add a test for when `str` is `null` - this will not pass.
6. Fix the logic in the solution so that all 4 test cases pass.
