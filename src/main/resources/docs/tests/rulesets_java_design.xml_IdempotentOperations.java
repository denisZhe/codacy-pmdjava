//#Patterns: design_IdempotentOperations
      
public class Foo {
 public void bar() {
  int x = 2;
  //#Info: design_IdempotentOperations
  x = x;
 }
}

