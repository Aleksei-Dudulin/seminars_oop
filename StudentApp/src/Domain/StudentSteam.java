package Domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup>{
    // Номер потока
    private int steamId;
    // Список групп в потоке
    private List<StudentGroup> groups = new ArrayList<>();

    /**
     * Конструктор
     * @param steamId
     */
    public StudentSteam(int steamId) {
        this.steamId = steamId;
    }

    /**
     * Констркутор
     * @param groups
     * @param steamId
     */
    public StudentSteam(List<StudentGroup> groups, int steamId) {
        this.steamId = steamId;
        this.groups = groups;
    }

    // Сеттеры и геттеры
    public List<StudentGroup> getGroups() {
        return groups;
    }
    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }
    public int getSteamName() {
        return steamId;
    }
    public void setSteamName(String steamName) {
        this.steamId = steamId;
    }

    /**
     * Добавить группу в поток
     * @param group - группа
     */
    public void addGroup (StudentGroup group) {
        groups.add(group);
    }

    /**
     * Формируем представление потока с именем количеством групп и списком студентов
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Поток студентов №" +
                steamId +
                " (groups number is " +
                groups.size() +
                ")" +
                ":\n");
        for (StudentGroup group: groups) {
            stringBuilder.append(group).append("\n");
        }
        return stringBuilder.toString();
    }

    /**
     * Реализовали метод интерфейса Iterable (теперь по классу StudentSteam можно итерироваться по группам)
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(groups);
    }
}
