package Domain;

public class Teacher extends Worker {
    private String degree;

    public Teacher(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }
}
