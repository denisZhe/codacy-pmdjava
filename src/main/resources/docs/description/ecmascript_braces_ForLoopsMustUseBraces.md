Since: PMD 5.0

Avoid using 'for' statements without using curly braces.

Example(s):
```
// Ok
for (var i = 0; i < 42; i++) {
   foo();
}

// Bad
for (var i = 0; i < 42; i++)
   foo();
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-javascript/rules/ecmascript/braces.html#ForLoopsMustUseBraces)
