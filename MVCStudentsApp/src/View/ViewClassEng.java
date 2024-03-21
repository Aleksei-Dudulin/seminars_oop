package View;

import Controller.Interfaces.iGetView;
import Controller.Interfaces.iGetViewEng;
import Model.Domain.Student;

import java.util.List;
import java.util.Scanner;

public class ViewClassEng implements iGetViewEng {

    /**
     * Реализация метода напечатать всех студентов
     * @param students
     */
    public void printAllStudents(List<Student> students) {
        System.out.println("************ List of students **************");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("********************************************");
    }

    /**
     * Реализация метода ввода строки с консоли
     * @param msg
     * @return
     */
    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }

}
