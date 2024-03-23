/**
 * Привнесенная модель извне, которую легко подключить к проекту вместо ModelClass
 */
package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileModelClass implements iGetModel {

    /**
     * Присваиваем объектам класса FileModelClass поле fileName
     */
    private String fileName;

    /**
     * Конструктор объектов класса
     * @param fileName
     */
    public FileModelClass(String fileName) {
        this.fileName = fileName;

        /**
         * Открывает файл для записи и выполняет сброс буфера.
         *
         * @param fileName имя файла для записи
         * @throws IOException если происходит ошибка ввода-вывода при открытии файла или сбросе буфера
         */
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Сохраняет всех студентов из списка в файл.
     *
     * @param studentList список студентов для сохранения
     */
    public void saveAllStudentToFile(List<Student> studentList) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            // Для каждого студента в списке записывает его идентификатор, имя и возраст в файл
            for (Student pers : studentList) {
                fw.write(pers.getId() + " " +pers.getName() + " " + pers.getAge());
                fw.append('\n'); // Сбрасывает буфер FileWriter
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Выводит сообщение об ошибке, если она произошла
        }
    }

    /**
     * Получает значения всех студентов из файла.
     */
    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<Student>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] param = line.split(" ");
                Student pers = new Student(Integer.parseInt(param[0]), param[1], Integer.parseInt(param[2]));
                students.add(pers);
                line = reader.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return students;
    }

    /**
     * Удаляет студента из файла по номеру его id.
     *
     * @param num список студентов для сохранения
     */
    @Override
    public void deleteStudent(int num) {

        List<Student> studentList = getAllStudents(); // Получаем список всех студентов из файла

        if (num < 1 || num > studentList.size()) { // Проверяем, есть ли студент с таким номером
            System.out.println("Студент с таким номером отсутствует!");
            return;
        } else {
            studentList.remove(num - 1); // Удаляем студента из списка

            try (FileWriter fw = new FileWriter(fileName, false)) {
            for (Student student : studentList) {
                fw.write(student.getId() + " " + student.getName() + " " + student.getAge());
                fw.append('\n');
            }

            fw.flush();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
