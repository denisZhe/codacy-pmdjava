//#Patterns: javabeans_MissingSerialVersionUID

//#Warn: javabeans_MissingSerialVersionUID
public class Foo implements java.io.Serializable {
    String name; // Define serialization id to avoid serialization related bugs
    // i.e., public static final long serialVersionUID = 4328743;

}