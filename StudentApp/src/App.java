import Controllers.AccountController;
import Domain.*;
import Services.EmployeeService;
import Services.StudentService;
import Services.TeacherService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * Создаем студентов
         */
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
        Student student11 = new Student ("Юлия", 26);
        Student student12 = new Student ("Руслан", 29);


        /**
         * Инициализируем пустые списки и добавляем в них студентов
         */
        List<Student> students1 = new ArrayList<>();
        students1.add(student12);
        students1.add(student2);
        students1.add(student6);
        students1.add(student3);
        students1.add(student8);
        students1.add(student5);
        students1.add(student4);
        students1.add(student10);

        List<Student> students2 = new ArrayList<>();
        students2.add(student11);


        List<Student> students3 = new ArrayList<>();
        students3.add(student1);
        students3.add(student7);
        students3.add(student9);

        /**
         * Создаём объекты класса StudentGroup и передаем в них списки студентов и номера их группы
         */
        StudentGroup group1 = new StudentGroup(students1, 58302);

//        // Выводим список студентов по группам (group5830 не является итерируемым объектом, поэтому сначала его надо сделать итерируемым)
//        System.out.println("Группа 5830");
//        for (Student stud : group1){
//            System.out.println(stud);
//        }
//        System.out.println("________________________________");
//
//        // Сортируем студентов в группе сначала по возрасту, потом по id
//        Collections.sort(group1.getGroup());
//        for (Student stud : group1){
//            System.out.println(stud);
//        }
//        System.out.println("________________________________");

        StudentGroup group2 = new StudentGroup(students2, 583);
        StudentGroup group3 = new StudentGroup(students3, 5830);

        /**
         * Создаём объект класса StudentSteam поток и передаем в него номер потока, добавляем туда группы
         */
        StudentSteam steam = new StudentSteam(121);
        steam.addGroup(group1);
        steam.addGroup(group2);
        steam.addGroup(group3);

//        System.out.println(steam);

//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        /**
         * Сортируем группы в потоке сначала по количеству студентов, потом по номеру группы
         */
        Collections.sort(steam.getGroups());
//        System.out.println(steam);

////        AccountController accountController = new AccountController(); // не нужен, потому что мы сделали AccountController staticом
//        AccountController.print(students1); // AccountController вместо accountController, следствие стр. 93

        StudentService studentService = new StudentService();
        for (Student stud : students1) { // переменной stud типа данных Student проходим по списку students1
            studentService.create(stud.getName(), stud.getAge());
//            System.out.println(stud);
        }
//        System.out.println("-------------------------------------------");

//        studentService.print(studentService.getAll());
//        System.out.println("-------------------------------------------");
        studentService.sortByFIO(); // сортируем по имени
//        AccountController.print(studentService.getAll());

        Teacher teacher1 = new Teacher("Иван Алексеевич", 53, "Доцент");
        Employee employee1 = new Employee("Олег", 36, "Слесарь");

        /**
         * Ранее классы Teacher, Employee и Student были наследниками одного класса Person, и чтобы зарплату нам платить
         * только Teacher и Employee, мы добавляем безопасность по типам и создаем промежуточного наследника Worker класса Person,
         * и уже после этого делаем Teacher и Employee наследниками класса Worker
         */
//        AccountController.paySalary(teacher1, 145000);
//        AccountController.paySalary(employee1, 45000);
////        AccountController.paySalary(student1, 5000);

        /**
         *  Домашнее задание после 4 семинара. Создаем объект класса TeacherService и добавляем в него учителей.
         */
        TeacherService teacherService = new TeacherService();
        teacherService.create("Михаил Семёнович", 43);
        teacherService.create("Ольга Анатольевна", 52);
        teacherService.create("Ирина Леонидовна", 55);
        teacherService.create("Елена Степановна", 49);
        teacherService.create("Михаил Юрьевич", 54);

        /**
         * Выводим список учителей в консоль.
         */
        AccountController.print(teacherService.getAll());
        System.out.println("----------------------------------------");

        /**
         * Сортируем по имени и выводим в консоль.
         */
        teacherService.sortByName();
        AccountController.print(teacherService.getAll());

        System.out.println("----------------------------------------");

        /**
         * Вызываем метод подсчета среднего возраста группы.
         */
        AccountController.averageAge(teacherService.getAll());
        System.out.println("----------------------------------------");

        /**
         * Проверка на группе студентов.
         */
        AccountController.print(studentService.getAll());
        AccountController.averageAge(studentService.getAll());
        System.out.println("----------------------------------------");

        /**
         * Проверка на группе служащих.
         */
        EmployeeService employeeService = new EmployeeService();
        employeeService.create("Михаил", 43);
        employeeService.create("Ольга", 52);
        employeeService.create("Ирина", 55);
        employeeService.create("Елена", 49);
        employeeService.create("Михаил", 54);

        AccountController.print(employeeService.getAll());
        AccountController.averageAge(employeeService.getAll());


//        // Создаем список учителей обычным способом
//        List<Teacher> teacherList = new ArrayList<>();
//        teacherList.add(new Teacher("Римма", 55, "Высшая категория"));
//        teacherList.add(new Teacher("Сергей", 50, "Вторая категория"));
//        teacherList.add(new Teacher("Марианна", 58, "Первая категория"));
//
//        // Создаем список работников обычным способом
//        List<Employee> employeeGroup1 = new ArrayList<>();
//        employeeGroup1.add(new Employee("Матвей", 47, "Электрик"));
//        employeeGroup1.add(new Employee("Виталий", 38, "Сантехник"));
//        employeeGroup1.add(new Employee("Марина", 62, "Бухгалтер"));


    }

}
