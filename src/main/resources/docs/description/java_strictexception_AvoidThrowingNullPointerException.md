Since: PMD 1.8

Avoid throwing NullPointerExceptions. These are confusing because most people will assume that the
virtual machine threw it. Consider using an IllegalArgumentException instead; this will be
clearly seen as a programmer-initiated exception.

Example(s):
```
public class Foo {
  void bar() {
    throw new NullPointerException();
  }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/strictexception.html#AvoidThrowingNullPointerException)
