package Domain;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<StudentGroup> {

    private int count;
    private List<StudentGroup> studentGroups;

    /**
     * Конструктор
     * @param studentGroups - список групп
     */
    public GroupIterator(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    // Переопределили hasNext()
    @Override
    public boolean hasNext() {
        return count < studentGroups.size();
    }

    // Переопределили next()
    @Override
    public StudentGroup next() {
        return studentGroups.get(count++);
    }
}
