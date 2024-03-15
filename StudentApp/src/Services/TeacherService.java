package Services;

import Domain.PersonComparator;
import Domain.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * Создаем класс TeacherService и имплементируем в него интерфейс iPersonService
 */
public class TeacherService implements iPersonService<Teacher> {
    /**
     * Создаем счетчик для хранения общего числа объектов класса Teacher
     */
    private int count;
    /**
     * Создаем список для хранения объектов класса Teacher
     */
    public List<Teacher> teachers;

    /**
     * Создаем конструктор и ничего в него не передаем
     */
    public TeacherService() {
        teachers = new ArrayList<>();
    }

    /**
     * Имплементируем в класс TeacherService методы интерфейса iPersonService.
     * getAll позволит вернуть весь список учителей
     */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * Метод create создает объект класса Teacher и наделяет его name, age и degree, добавляет его в список
     * учителей и увеличивает счетчик на единицу.
     * @param name
     * @param age
     */
    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age, "Basic");
        count++;
        teachers.add(teacher);
    }

    public void sortByName() {
        PersonComparator<Teacher> personComparator = new PersonComparator<>();
        teachers.sort(personComparator);
    }
}
