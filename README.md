# Type Inference Issue in Scala Generic Class

This example demonstrates a common type inference issue in Scala when using generic classes. The `MyClass` class is designed to work with various types, but an unexpected compilation error occurs when using it with different types.

## Problem

The `myMethod` within the `MyClass` is expected to work with the generic type T. When the code tries to execute `myInstance2.myMethod(25)`, it results in a compilation error because the type `Int` (25) doesn't match the String type of `myInstance2`.

## Solution

The solution involves adjusting either the type parameter or ensuring consistent type usage.
