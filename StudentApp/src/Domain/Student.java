package Domain;

public class Student extends Person implements Comparable<Student> {
    private int id;
    private static int generaleId;

    public Student(String name, int age) { // static поле сюда не добавляется, потому что конструктор понимает что мы хотим что-то с этим полем сделать
        super(name, age);
        this.id = generaleId;
        generaleId++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student {" +
                "id = " + id +
                ", " +
                "Name " + super.getName() +
                ", " +
                "Age " + super.getAge() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        System.out.println(super.getName() + " " + o.getName());
        if (o.getAge() == super.getAge()) {
            if (id == o.id) {
                return 0;
            }
            if (id > o.id) {
                return 1;
            } else {
                return -1;
            }
        }
        if (o.getAge() > super.getAge()) {
            return -1;
        } else {
            return 1;
        }
    }
}
