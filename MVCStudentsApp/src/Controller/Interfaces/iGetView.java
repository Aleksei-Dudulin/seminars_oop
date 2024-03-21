package Controller.Interfaces;

import Model.Domain.Student;

import java.util.List;

public interface iGetView {
    public void printAllStudents(List<Student> students);
    public String prompt(String msg);
}
