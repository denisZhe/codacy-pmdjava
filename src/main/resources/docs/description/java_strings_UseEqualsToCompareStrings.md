Since: PMD 4.1

Using '==' or '!=' to compare strings only works if intern version is used on both sides.
Use the equals() method instead.

Example(s):
```
public boolean test(String s) {
    if (s == "one") return true; 		// unreliable
    if ("two".equals(s)) return true; 	// better
    return false;
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/strings.html#UseEqualsToCompareStrings)
