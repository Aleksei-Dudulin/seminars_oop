package Controller.Interfaces;

import Model.Domain.Student;

import java.util.HashMap;
import java.util.List;

public interface iGetModel {
    public List<Student> getAllStudents();

    void deleteStudent(int num);

}

