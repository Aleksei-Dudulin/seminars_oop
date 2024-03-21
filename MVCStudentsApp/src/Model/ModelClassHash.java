package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ModelClassHash implements iGetModel {

    /**
     * Поле HashMap со студентами
     */
    private HashMap<Integer, Student> studentsHash;


    /**
     * Конструктор
     * @param studentsHash
     */
    public ModelClassHash(HashMap<Integer, Student> studentsHash) {
        this.studentsHash = studentsHash;
    }

    /**
     * Переопределяем метод возврата всех студентов из хранилища HashMap
     * @return
     */
    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<Student>(studentsHash.values());
    }
}
