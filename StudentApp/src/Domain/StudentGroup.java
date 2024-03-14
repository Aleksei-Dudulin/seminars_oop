package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private int idGroup;

    public StudentGroup(List<Student> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup " + idGroup +
                " (students number is " +
                group.size() +
                ")" +
                " - " + group;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }

    // Реализовали метод compareTo интерфейса Comparable
    @Override
    public int compareTo(StudentGroup o) {
        if (o.group.size() > group.size()) {
            return 1;
        }
        if (o.group.size() < group.size()) {
            return -1;
        } else {
//            return 0;
            if (o.idGroup > idGroup) {
                return -1;
            }
            if (o.idGroup < idGroup) {
                return 1;
            } else {
                return 0;
            }
        }
    }

//    @Override
//    public int compareTo(StudentGroup o) {
//        if (group.size() != o.group.size()) {
//            return Integer.compare(o.group.size(), group.size());
//        } else {
//            return Integer.compare(idGroup, o.idGroup);
//        }
//    }
}
