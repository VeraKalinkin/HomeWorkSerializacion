import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private int age;
    transient double GPA;

    //region getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGPA() {
        return GPA;
    }
    //endregion


    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }
}
