# Kotlin removeIf() Gotcha

This repository demonstrates a subtle but common issue when using the `removeIf()` function in Kotlin with mutable collections (Lists, Sets, and Maps). Unlike filtering functions that return a new collection, `removeIf()` modifies the original collection directly.  This can lead to unexpected behavior if not handled carefully.

The `bug.kt` file shows the behavior. The solution `bugSolution.kt` shows how to correctly use `removeIf()` or alternative approaches for safer handling.

This example highlights the importance of understanding the in-place nature of `removeIf()` to avoid potential bugs in your Kotlin code.