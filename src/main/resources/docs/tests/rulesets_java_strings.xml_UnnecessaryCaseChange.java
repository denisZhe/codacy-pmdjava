//#Patterns: strings_UnnecessaryCaseChange

public class Foo {
    public void bar() {
//#Warn: strings_UnnecessaryCaseChange
boolean answer1 = buz.toUpperCase().equals("baz"); // should be buz.equalsIgnoreCase("baz") boolean answer2 = buz.toUpperCase().equalsIgnoreCase("baz"); // another unnecessary toUpperCase()


    }
}

