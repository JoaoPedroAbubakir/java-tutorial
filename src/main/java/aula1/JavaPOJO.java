package aula1;

/**
 * POJO stands for "Plain Old Java Object"
 * <br><br>
 * These classes are used for showing examples and in rare cases some quick tests to test out if something works.
 * For real though, they should never be used if you are doing serious work.
 * <br><br>
 * So now for what we are really doing here. We have a Java class, but it is all over the place.
 * No standard is being followed here, but it is a valid class and it works
 */
public class JavaPOJO {

    String name; //No visibility present
    public String id; //This is directly exposing this attribute
    private double salary;

    //note how the "salary" variable is not properly spaced from the "id"
    public JavaPOJO(String name, String id,double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name; //not using self-reference with "this"
    }

    public String getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }
}
