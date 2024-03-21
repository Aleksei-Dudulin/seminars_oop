package Controller;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetViewEng;
import Model.Domain.Student;

import java.util.ArrayList;
import java.util.List;

public class ControllerClassEng {
    private iGetModel model;
    private iGetViewEng viewEng;
    private List<Student> buffer = new ArrayList<>();

    public ControllerClassEng(iGetModel model, iGetViewEng viewEng) {
        this.model = model;
        this.viewEng = viewEng;
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
            viewEng.printAllStudents(buffer);
        } else {
            System.out.println("List of students is empty!");
        }

    }

    public void run() {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = viewEng.prompt("Введите команду: ");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    //MVC
                    viewEng.printAllStudents(model.getAllStudents());
                    break;
            }
        }
    }
}
