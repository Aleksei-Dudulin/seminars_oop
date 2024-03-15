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

    /**
     * Добавлен статический метод подсчета среднего возраста группы, в него передается группа объектов А, которая
     * являются наследниками класса Person
     * @param group
     * @param <A>
     */
    public static <A extends Person> void averageAge(List<A> group) {
        double sumAge = 0;
        for (A pers : group) {
            sumAge += pers.getAge();
        }
        double averAge = sumAge / group.size();
        System.out.printf("Средний возраст группы %.1f\n", averAge);
    }
}


