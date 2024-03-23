package View;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ViewClass implements iGetView {
    public void printAllStudents(List<Student> studentList) {
        System.out.println("************ Список студентов **************");
        for (Student s : studentList) {
            System.out.println(s);
        }
        System.out.println("********************************************");
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
