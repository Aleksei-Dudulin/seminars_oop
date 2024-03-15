package Domain;

import java.util.Comparator;

public class PersonComparator<T extends Person> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int result = o1.getName().compareTo(o2.getName()); // переопределяем сравнение по имени
        return result;
    }
}
