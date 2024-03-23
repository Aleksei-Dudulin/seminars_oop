package Controller;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerClass {
    private List<iGetModel> models;
    private iGetModel model;
    private iGetView view;
    private List<Student> buffer = new ArrayList<>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> studentList) {
        if (!studentList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
//        //MVC
//        view.printAllStudents(model.getAllStudents()); // напрямую передача от model на view
        // MVP
        for (iGetModel m: models){
            m.getAllStudents();
        }
        buffer = model.getAllStudents();
        if (testData(buffer)) {
            view.printAllStudents(buffer);
        } else {
            System.out.println("List of students is empty!");
        }

    }

    public void run() {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду: ");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    //MVC
                    view.printAllStudents(model.getAllStudents());
                    break;
                /**
                 * Переключатель switch, который запрашивает у user номер и передает значение в метод
                 * deleteStudent, вызываемый у объекта model, тем самым запуская процесс удаления студента из файла
                 */
                case DELETE:
                    String num = view.prompt("Введите номер студента: ");
                    model.deleteStudent(Integer.parseInt(num));
                    view.printAllStudents(model.getAllStudents());

            }
        }
    }
}
