import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * Создаем студентов
         */
        Student student1 = new Student ("Алексей", 23);
        Student student2 = new Student ("Ольга", 22);
        Student student3 = new Student ("Игорь", 23);
        Student student4 = new Student ("Анна", 25);
        Student student5 = new Student ("Илья", 24);
        Student student6 = new Student ("Денис", 29);
        Student student7 = new Student ("Елена", 28);
        Student student8 = new Student ("Екатерина", 22);
        Student student9 = new Student ("Ксения", 28);
        Student student10 = new Student ("Арсений", 27);
        Student student11 = new Student ("Юлия", 26);
        Student student12 = new Student ("Руслан", 29);


        /**
         * Инициализируем пустые списки и добавляем в них студентов
         */
        List<Student> students1 = new ArrayList<>();
        students1.add(student12);
        students1.add(student2);
        students1.add(student6);

        List<Student> students2 = new ArrayList<>();
        students2.add(student11);
        students2.add(student3);
        students2.add(student8);
        students2.add(student5);
        students2.add(student4);
        students2.add(student10);

        List<Student> students3 = new ArrayList<>();
        students3.add(student1);
        students3.add(student7);
        students3.add(student9);

        /**
         * Создаём объекты класса StudentGroup и передаем в них списки студентов и номера их группы
         */
        StudentGroup group1 = new StudentGroup(students1, 58302);

//        // Выводим список студентов по группам (group5830 не является итерируемым объектом, поэтому сначала его надо сделать итерируемым)
//        System.out.println("Группа 5830");
//        for (Student stud : group1){
//            System.out.println(stud);
//        }
//        System.out.println("________________________________");
//
//        // Сортируем студентов в группе сначала по возрасту, потом по id
//        Collections.sort(group1.getGroup());
//        for (Student stud : group1){
//            System.out.println(stud);
//        }
//        System.out.println("________________________________");

        StudentGroup group2 = new StudentGroup(students2, 583);
        StudentGroup group3 = new StudentGroup(students3, 5830);

        /**
         * Создаём объект класса StudentSteam поток и передаем в него номер потока, добавляем туда группы
         */
        StudentSteam steam = new StudentSteam(121);
        steam.addGroup(group1);
        steam.addGroup(group2);
        steam.addGroup(group3);

        System.out.println(steam);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        /**
         * Сортируем группы в потоке сначала по количеству студентов, потом по номеру группы
         */
        Collections.sort(steam.getGroups());
        System.out.println(steam);

    }
}
