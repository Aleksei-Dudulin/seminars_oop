package Controller.Interfaces;

import Model.Domain.Student;

import java.util.List;
import java.util.Map;

public interface iGetView {
    public void printAllStudents(List<Student> studentList);

    public String prompt(String msg);
}
