package Controller;

import Controller.Interfaces.iGetModel;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

import java.util.ArrayList;
import java.util.List;

public class ControllerClass {
    private iGetModel model;
    private iGetView view;
    private List<Student> buffer = new ArrayList<>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> students) {
        if (!students.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public void update() {
//        //MVC
//        view.printAllStudents(model.getAllStudents()); // напрямую передача от model на view
        // MVP
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
            }
        }
    }
}
