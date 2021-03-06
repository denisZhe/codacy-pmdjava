Since: PMD 5.1

Do not use protected methods in most final classes since they cannot be subclassed. This should 
only be allowed in final classes that extend other classes with protected methods (whose
visibility cannot be reduced). Clarify your intent by using private or package access modifiers instead.

Example(s):
```
public final class Foo {
  private int bar() {}
  protected int baz() {} // Foo cannot be subclassed, and doesn't extend anything, so is baz() really private or package visible? 
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/design.html#AvoidProtectedMethodInFinalClassNotExtending)
