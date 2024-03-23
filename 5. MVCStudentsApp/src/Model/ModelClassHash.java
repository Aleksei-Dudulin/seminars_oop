package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.*;


public class ModelClassHash implements iGetModel {

    /**
     * Поле HashMap со студентами
     */
    private HashMap<Integer, Student> studentsListHash;


    /**
     * Конструктор
     * @param studentList
     */
    public ModelClassHash(List<Student> studentList) {
        HashMap<Integer, Student> resultsMap = new HashMap<Integer, Student>();
        for (Student o : studentList) {
            resultsMap.put(o.getId(), o);
        }
        this.studentsListHash = resultsMap;
    }

    /**
     * Переопределяем метод возврата всех студентов из хранилища HashMap
     * @return
     */
    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<Student>(studentsListHash.values());
    }

    @Override
    public void deleteStudent(int num) {
        if (studentsListHash.containsKey(num)) {
            studentsListHash.remove(num);
        } else {
            System.out.println("Студент с таким номером отсутствует!");
            System.out.println();
        }
    }

}
