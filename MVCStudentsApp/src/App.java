import Controller.ControllerClass;
import Controller.ControllerClassEng;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Controller.Interfaces.iGetViewEng;
import Model.FileModelClass;
import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception{
        Student student1 = new Student ("Алексей", 23);
        Student student2 = new Student ("Ольга", 22);
        Student student3 = new Student ("Игорь", 23);
        Student student4 = new Student ("Анна", 25);
        Student student5 = new Student ("Илья", 24);
        Student student6 = new Student ("Денис", 29);
        Student student7 = new Student ("Елена", 28);
        Student student8 = new Student ("Екатерина", 22);
        Student student9 = new Student ("Ксения", 28);
        Student student10 = new Student ("Арсений", 27);

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

        FileModelClass fmodel = new FileModelClass("D:/Программирование/2. Специализация/Язык Java/seminars_oop/MVCStudentsApp/StudentDB.csv");
//        fmodel.saveAllStudentToFile(studentList); // закомментировали чтобы не перезаписывать файл каждый раз при запуске программы

//        iGetModel model = new ModelClass(studentList); // вместо model у нас теперь fmodel (н-р, от стороннего разработчика)
//        iGetView view = new ViewClass();

        /**
         * Создаем экземпляр интерфейса iGetViewEng
         */
        iGetViewEng viewEng = new ViewClassEng();

        /**
         * Создаем экземпляр класса ControllerClassEng и передаем в него экземпляры интерфейсов iGetModel и iGetViewEng
         */
        ControllerClassEng controllerEng = new ControllerClassEng(fmodel, viewEng);
        controllerEng.run();

    }
}
