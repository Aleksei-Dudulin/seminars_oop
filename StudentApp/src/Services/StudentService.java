package Services;

import Domain.PersonComparator;
import Domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iPersonService<Student> {
    private int count;
    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String name, int age) {
        Student student = new Student(name, age);
        count++;
        students.add(student);
    }

//    @Override
//    public void print(List<Student> group) {
//        for (Student stud : group) {
//            System.out.println(stud);;
//        }
//    }

    public void sortByFIO() {
        PersonComparator<Student> personComparator = new PersonComparator<>();
        students.sort(personComparator);
    }

}
