package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student> {

    private int count; // точка отслеживания где мы находимся в списке
    private List<Student> students;

    public StudentIterator(List<Student> students) {
//        this.count = 0;
        this.students = students; // надо или нет?
    }

    @Override
    public boolean hasNext() {
        return count < students.size();
    }

    @Override
    public Student next() {
        if(!hasNext())
        {
            return null;
        }
        return students.get(count++);
    }
}
