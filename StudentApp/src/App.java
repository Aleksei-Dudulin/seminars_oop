import Domain.Student;
import Domain.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student ("Алексей", 32);
        Student student2 = new Student ("Cергей", 22);
        Student student3 = new Student ("Игорь", 22);
        Student student4 = new Student ("Антон", 25);
        Student student5 = new Student ("Илья", 29);
        Student student6 = new Student ("Денис", 22);

        System.out.println(student3);

        List<Student> students = new ArrayList<>();
        students.add(student6);
        students.add(student5);
        students.add(student4);
        students.add(student3);
        students.add(student2);
        students.add(student1);

        StudentGroup group5830 = new StudentGroup(students, 5830);
        for (Student stud : group5830){ // group5830 не является итерируемым объектом ,поэтому сначала его надо сделать итерируемым
            System.out.println(stud);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Collections.sort(group5830.getGroup());
        for (Student stud : group5830){
            System.out.println(stud);
        }


    }
}
