Since: PMD 5.4

Using that expression in dependency declarations seems like a shortcut, but it can go wrong. By far the most common problem is the use of
5.6.1 in a BOM or parent POM.

Example(s):
```
<project...>
  ...
  <dependency>
    ...
    <version>${project.dependency}</version>
  </dependency>
</project>
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-xml/rules/pom/basic.html#ProjectVersionAsDependencyVersion)
