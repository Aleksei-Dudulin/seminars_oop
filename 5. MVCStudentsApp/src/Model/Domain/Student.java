package Model.Domain;

public class Student extends Person implements Comparable<Student> {
    private int id;

    public Student(int id, String name, int age) {
        super(name, age);
        this.id = id;
    }

//    public Student(int id, String name, int age) { // static поле сюда не добавляется, потому что конструктор понимает что мы хотим что-то с этим полем сделать
//        super(name, age);
//        this.id = generateId + 1;
//        generateId++;
//    }


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student " + id +
                " {name: " + super.getName() +
                ", " +
                "age: " + super.getAge() +
                "}";
    }

    @Override
    public int compareTo(Student o) {
//        System.out.println(super.getName() + " " + o.getName());
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
