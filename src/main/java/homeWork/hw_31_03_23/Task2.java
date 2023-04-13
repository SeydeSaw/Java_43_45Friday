package homeWork.hw_31_03_23;

import java.util.function.Predicate;

/*todo
      Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”.
      Используем функциональный интерфейс Predicate.
 */
public class Task2 {
    public static void main(String[] args) {
        String str = "Java"; // Объявляем строку для проверки
        Predicate<String> checkStr = s -> s.startsWith("J") || s.startsWith("N") && s.endsWith("A"); // Объявляем предикат с условием
        System.out.println(checkStr.test(str)); // Выводим результат проверки на экран
    }
}