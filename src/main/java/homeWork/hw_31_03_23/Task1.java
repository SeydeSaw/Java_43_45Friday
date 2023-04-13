package homeWork.hw_31_03_23;

import java.util.Arrays;
import java.util.List;

/*todo
    Допустим, у нас есть коллекция состоящая из строк.
    Arrays.asList(«Highload», «High», «Load», «Highload»).
    Посчитайте, сколько раз объект «High» встречается в коллекции.
    Используйте Stream API.
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Highload", "High", "Load", "Highload"); // создаем список из строк
        long count = list.stream() // получаем поток данных из списка
                .filter(x -> x.equals("High")) // фильтруем поток, оставляя в нем только строки, равные "High"
                .count(); // подсчитываем количество строк
        System.out.println("Объект High встречается в коллекции " + count + " раз"); // выводим количество на экран
    }
}
