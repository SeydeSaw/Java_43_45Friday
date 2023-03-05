package homeWork.hw_03_03_23;

import java.util.ArrayList;
import java.util.Collections;

/*todo Task1
    Даны два ArrayList, элементы которых упорядочены.
    Объединить их в трерий ArrayList,
    элементы которого тоже должны быть отсортированы.
    Example 1:
    Input: list1 = [1,2,4], list2 = [1,3,4]
    Output: [1,1,2,3,4,4]
    Example 2:
    Input: list1 = [], list2 = []
    Output: []
    Example 3:
    Input: list1 = [], list2 = [0]
    Output: [0]
 */
public class Task1 {
    public static void main(String[] args) {
        //создаем лист типа Integer
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        //создаем лист типа Integer
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);

        //Создаем новый ArrayList для объединения двух других:
        ArrayList<Integer> list3 = new ArrayList<>();

        //Добавляем все элементы из первого ArrayList в третий:
        list3.addAll(list1);

        //Добавляем все элементы из второго ArrayList в третий:
        list3.addAll(list2);

        //Сортируем третий ArrayList:
        Collections.sort(list3);

        //Выводим на экран третий ArrayList:
        System.out.println(list3);
    }
}