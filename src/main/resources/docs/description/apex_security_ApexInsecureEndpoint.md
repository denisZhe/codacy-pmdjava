Since: PMD 5.5.3

Checks against accessing endpoints under plain **http**. You should always use
**https** for security.

Example(s):
```
public without sharing class Foo {
    void foo() {
        HttpRequest req = new HttpRequest();
        req.setEndpoint('http://localhost:com');
    }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-apex/rules/apex/security.html#ApexInsecureEndpoint)
