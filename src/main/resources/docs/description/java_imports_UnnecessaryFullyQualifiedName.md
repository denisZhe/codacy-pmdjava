Since: PMD 5.0

Import statements allow the use of non-fully qualified names.  The use of a fully qualified name
which is covered by an import statement is redundant.  Consider using the non-fully qualified name.

Example(s):
```
import java.util.List;

public class Foo {
   private java.util.List list1; // Unnecessary FQN
   private List list2; // More appropriate given import of 'java.util.List'
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/imports.html#UnnecessaryFullyQualifiedName)
