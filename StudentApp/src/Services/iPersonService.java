package Services;

import Domain.Person;
import Domain.Student;

import java.util.List;

public interface iPersonService<T extends Person> {
    List<T> getAll();
    void create(String name, int age);
//    void print(List<T> group);
}
