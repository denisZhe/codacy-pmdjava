Since: PMD 3.0

When a class has the final modifier, all the methods are automatically final and do not need to be
tagged as such.

Example(s):
```
public final class Foo {
    // This final modifier is not necessary, since the class is final
    // and thus, all methods are final
    private final void foo() {
    }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/unnecessary.html#UnnecessaryFinalModifier)
