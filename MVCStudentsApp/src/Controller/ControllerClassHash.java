package Controller;

i
import Controller.Interfaces.iGetView;
import Model.Domain.Student;
import Model.ModelClassHash;

import java.util.ArrayList;
import java.util.List;

public class ControllerClassHash {
    private ModelClassHash modelHash;
    private iGetView view;
    private List<Student> buffer = new ArrayList<>();

    public ControllerClassHash(ModelClassHash modelHash, iGetView view) {
        this.modelHash = modelHash;
        this.view = view;
    }

    private boolean testData(List<Student> students) {
        if (!students.isEmpty()) {
            return true;
        } else {
            return false;
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
                    view.printAllStudents(modelHash.getAllStudents());
                    break;
            }
        }
    }
}
