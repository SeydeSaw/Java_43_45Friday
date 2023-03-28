package homeWork._17_03_23;
/*todo
    Что выведет фрагмент кода? Объяснить.
    import java.util.HashSet;
    class Person {
    String name;
    Person(String name) { this.name = name; }
    public String toString() { return name; }
    }
    class TestHashSet {
    public static void main(String args[]) {
       HashSet set = new HashSet<>();
       Person p1 = new Person("Иван");
       Person p2 = new Person("Мария");
       Person p3 = new Person("Пётр");
       Person p4 = new Person("Мария");
       set.add(p1);
       set.add(p2);
       set.add(p3);
       set.add(p4);
       System.out.print(set.size());
    }
    }
 */
import java.util.HashSet;

public class Task2 {
/* todo
    Выведет число 3.
    HashSet - коллекция, которая отличается тем, что в ней хранятся только уникальные значения.
    Таким образом, при добавлении в нее объекта, такого же как и другие (с таким же значением поля name),
    такой объект не будет добавлен в коллекцию.
    В данном случае в коллекцию было добавлено 4 объекта, но последний идентичен одному из предыдущих,
    поэтому при выводе размер коллекции будет равен 3.
*/
}

//  Объявляем класс Person с полем name и методом toString, который возвращает имя
 class Person {
    String name;
    Person(String name) { this.name = name; }
    public String toString() { return name; }
 }
//  Объявляем класс TestHashSet с методом main, где создаём новый объект типа HashSet
 class TestHashSet {
    public static void main(String args[]) {
        HashSet set = new HashSet<>();
        //  Создаём 4 новых объекта типа Person с именами
        Person p1 = new Person("Иван");
        Person p2 = new Person("Мария");
        Person p3 = new Person("Пётр");
        Person p4 = new Person("Мария");
        //  Затем все эти 4 объекта добавляем в HashSet
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        //  В конце выводит в консоль размер HashSet, который равен 3, т.к.
        // последний объект с именем Мария не добавляется, т.к. такой элемент уже присутствует
        System.out.print(set.size());
    }
}