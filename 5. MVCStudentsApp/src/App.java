import Controller.ControllerClass;
import Model.Domain.Student;
import Model.FileModelClass;
import Model.ModelClass;
import Model.ModelClassHash;
import View.ViewClass;
import View.ViewClassEng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * Cоздаём представителей класса Student/
         */
        Student student1 = new Student(1,"Алексей", 23);
        Student student2 = new Student(2,"Ольга", 22);
        Student student3 = new Student(3,"Игорь", 23);
        Student student4 = new Student(4,"Анна", 25);
        Student student5 = new Student(5,"Илья", 24);
        Student student6 = new Student(6,"Денис", 29);
        Student student7 = new Student(7,"Елена", 28);
        Student student8 = new Student(8,"Екатерина", 22);
        Student student9 = new Student(9,"Ксения", 28);
        Student student10 = new Student(10,"Арсений", 27);

        /**
         * Добавляем их в список объектов класса Student.
         */
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);

////        1 вариант:
        /**
         * Создаем объекты наших интерфейсов
         */
//        iGetModel model = new ModelClass(studentList);
//        iGetView view = new ViewClassEng();
        /**
         * Создаем объект класса ControllerClass и передаем в него необходимые нам view и model
         */
//        ControllerClass controller = new ControllerClass(model, view);

////        2 вариант:
//        /**
//         * Создаем объект класса FileModelClass с расширением .csv
//         */
//        FileModelClass fmodel = new FileModelClass("D:/Программирование/2. Специализация/Язык Java/seminars_oop/5. MVCStudentsApp/StudentDB.csv");
//
//        /**
//         * Сохраняем список студентов в файл, вызывая метод класса FileModelClass на объект этого класса.
//         * Комментируем строку перед повторным запуском программы.
//         */
////       fmodel.saveAllStudentToFile(studentList); // закомментить чтобы не перезаписывать файл каждый раз при запуске программы
//
//        ControllerClass controller = new ControllerClass(fmodel, new ViewClass());

//      3 вариант:
        /**
         * Создаем объект класса ModelClassHash и передаем в него studentList
         */
        ModelClassHash modelClassHash = new ModelClassHash(studentList);
        ControllerClass controller = new ControllerClass(modelClassHash, new ViewClassEng());

        /**
         * Вызываем метод run y controller, тем самым запускаем логике управления нашим приложением
         */
        controller.run(); // при любых model и view один и тот же контроллер

    }
}
