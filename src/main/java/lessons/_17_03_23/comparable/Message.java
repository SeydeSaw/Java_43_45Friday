package lessons._17_03_23.comparable;
import java.util.Random;

public class Message implements Comparable<Message> {

    private int id;
    private String text;

    public Message(String text) {
        this.id = new Random().nextInt(1000);
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }

    // compareTo возвращает int.
    // отрицательный int (если первый объект меньше второго)
    // положительный int (если первый объект больше второго)
    // ноль - объекты равны

    @Override
    public int compareTo(Message o) {
//        return (id < o.id) ? -1 : ((id > o.id) ? 1 : 0);
        return Integer.compare(this.id, o.id);
    }
}