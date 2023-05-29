package classOne;

/**
 * These wrappers in Java can be used AS IF they were a primitive, so no need for the "new" keyword
 * <br>
 * These come in handy if we need to do any sort of operation with the values as they offer some common methods that we can use
 * <br>
 * I will not reintroduce each type here, but there will be a link to their documentation, so you can see what they can do.
 * <br>
 * Fun fact: notice how we did not have to import any of the wrappers? Even though they are each a class. This happened because they are part of the "java.lang" package
 */
public class JavaPrimitiveWrappers {

    /**
     * {@link Byte}
     */
    Byte byteWrapper = 0;
    /**
     * {@link Short}
     */
    Short shortWrapper = 0;
    /**
     * {@link Integer}
     */
    Integer integerWrapper = 0;
    /**
     * {@link Long}
     */
    Long longWrapper = 0L; //Same thing as the primitive, notice the L
    /**
     * {@link Float}
     */
    Float floatWrapper = 0.0f;//Same thing as the primitive, notice the f
    /**
     * {@link Double}
     */
    Double doubleWrapper = 0.0d;//Same thing as the primitive, notice the d
    /**
     * {@link Boolean}
     */
    Boolean booleanWrapper = false;
    /**
     * {@link Character}
     */
    Character charWrapper = '\u0000';//Same thing, use unicode as default, but can be a single quote char such as 'a'

    /**
     * We covered this in the {@link JavaPrimitives} but here it is again
     * {@link String}
     */
    String string = null;






}
