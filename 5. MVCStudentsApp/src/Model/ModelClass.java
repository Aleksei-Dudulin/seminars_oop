package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ModelClass implements iGetModel {
    private List<Student> studentList;

    public ModelClass(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getAllStudents() {
        return studentList;
    }

    /**
     * GПереопределили метод удаления студента из списка
     *
     * @param num
     */
    @Override
    public void deleteStudent(int num) {
        List<Student> studentList = getAllStudents(); // почему так можно записать
//        if (num < 1 || num > studentList.size()) {
//            System.out.println("Студент с таким номером отсутствует!");
//            System.out.println();
//        }
//        // Удаляем студента из списка. Индексы в списке начинаются с 0, поэтому вычитаем 1.
//        studentList.remove(num - 1);
//    }
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == num) {
                iterator.remove(); // Удаление студента из списка
                return; // Заканчиваем поиск после удаления студента
            }
        }
        System.out.println("Студент с таким номером отсутствует!");
        System.out.println();
    }
}
