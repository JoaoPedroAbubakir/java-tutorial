package classOne;

/**
 * Here we will look into some Java types
 * <br><br>
 * There are classes that wrap the primitives
 * <br><br>
 * Try to see if this is a POJO or a BEAN
 */
public class JavaPrimitives {

    //The primitive types along with their default values are
    //Primitive values do not need the "new" keyword to be initialized

    /**
     * The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).
     */
    byte byteType = 0;

    /**
     *  The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive)
     */
    short shorType = 0;

    /*
    byte and short are almost never used other than memory saving and optimization in large arrays, know they exist but don't need to
    pay much attention to them

    These next ones are used A LOT more
    */

    /**
     * By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -2^31 and a maximum value of 2^31-1. In Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer, which has a minimum value of 0 and a maximum value of 2^32-1
     */
    int intType = 0;

    /**
     * The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -2^63 and a maximum value of 2^63-1. In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 2^64-1.
     */
    long longType = 0L; //Note the "L" after the number

    /**
     * he float data type is a single-precision 32-bit IEEE 754 floating point.
     * Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification.
     * As with the recommendations for byte and short, use a float (instead of double) if you need to save memory in large arrays of floating point numbers.
     * <br><br>
     * <h1>This data type should never be used for precise values, such as currency</h1>
     * <br><br>
     * For that you should use {@link java.math.BigDecimal}
     */
    float floatType = 0.0f; //Not the "f" after the number

    /**
     * The double data type is a double-precision 64-bit IEEE 754 floating point
     * Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification.
     * For decimal values, this data type is generally the default choice.
     * <br><br>
     * <h1> As mentioned above, this data type should never be used for precise values, such as currency.</h1>
     * <br><br>
     * For that you should use {@link java.math.BigDecimal}
     */
    double doubleType = 0.0d; //Not the "d" after the number

    /**
     * The boolean data type has only two possible values: true and false. Use this data type for simple flags that track true/false conditions
     */
    boolean booleanType = false;

    /**
     * The char data type is a single 16-bit Unicode character. It has a minimum value of <code>'\u005Cu0000'</code> (or 0) and a maximum value of <code>'\u005Cuffff'</code> (or 65,535 inclusive).
     */
    char charType = '\u0000'; //By default, use unicode, but it works with a letter surrounded by single quotes such as 'a'

    /**
     * The String type in Java is a special case
     * <br><br>
     * <h4>From the official Java Documentation:</h4>
     *
     * In addition to the eight primitive data types listed above, the Java programming language also provides special support for character strings via the {@link java.lang.String } class.
     * Enclosing your character string within double quotes will automatically create a <pre>{@code new String object};</pre>
     * for example,
     * <pre>{@code String s = "this is a string";}</pre>
     * <br>String objects are immutable, which means that once created, their values cannot be changed. The String class is not technically a primitive data type, but considering the special support given to it by the language, you'll probably tend to think of it as such. You'll learn more about the String class in Simple Data Objects
     */
    String stringType = null;

}
