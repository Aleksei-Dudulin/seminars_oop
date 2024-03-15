package Controllers;

import Domain.Person;
import Domain.Student;
import Domain.Teacher;
import Domain.Worker;

import java.util.List;

public class AccountController {
    public static <V extends Person> void print(List<V> group) {
        for (V stud : group) {
            System.out.println(stud);;
        }
    }

    public static <T extends Worker> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачена зарплата " + salary + " руб.");
    }
}


