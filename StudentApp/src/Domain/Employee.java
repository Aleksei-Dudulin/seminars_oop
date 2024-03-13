package Domain;

public class Employee extends Person {
    private String special;

    public Employee(String name, int age, String special) {
        super(name, age);
        this.special = special;
    }
}
