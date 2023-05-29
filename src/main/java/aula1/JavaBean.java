package aula1;

import java.io.Serializable;
/**
 * It is called "Bean" not because of an acronym, the name comes from literal coffee beans. That's it Since Java is a type of coffee and such
 * <br><br>
 * Basically a Bean is a class that follows some conventions
 *<br><br>
 * <h1>it should</h1>
 * <pre>
 * <p>implement the {@link java.io.Serializable} Interface. You can read a bit into what is serialization if you wish </p>
 * {@code implements Serializable}
 * have a public no args constructor
 * {@code public ClassName() {}}
 * must have private attributes accessible with getters and setters
 * {@code
 * private String someField;
 * public String getSomeField() {
 *     return someField;
 * }
 * public void setSomeField(String someValue) {
 *     this.someField = someValue;
 * }
 * }
 * </pre>
 *
 */
public class JavaBean implements Serializable {

    //All our attributes (fields are private)
    private int id;
    private String name;
    private double salary;

    //We have a constructor that has no arguments (things that come inside the ())
    public JavaBean() {
        //default no-args constructor
    }

    //Access to our fields is made with getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
