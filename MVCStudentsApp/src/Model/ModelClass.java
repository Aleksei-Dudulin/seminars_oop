package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.List;


public class ModelClass implements iGetModel {
    private List<Student> students;
    public ModelClass(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents() {
        return students;
    }


}
