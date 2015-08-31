//#Patterns: strictexception_DoNotThrowExceptionInFinally

public class Foo {
    public void bar() {
        try { // Here do some stuff

        } catch( Exception e) {
            // Handling the issue
        //#Warn: strictexception_DoNotThrowExceptionInFinally
        } finally {
            // is this really a good idea ?
            throw new Exception();
        }
    }
}