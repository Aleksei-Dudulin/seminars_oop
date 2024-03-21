package Controller.Interfaces;

import Model.Domain.Student;

import java.util.List;

public interface iGetViewEng {
    public void printAllStudents(List<Student> students);
    public String prompt(String msg);
}
