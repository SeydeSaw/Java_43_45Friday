package homeWork.hw_03_03_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
public class Task_1 {
    public static void main(String[] args) {
        //создаем лист типа Integer
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 4));
        //создаем лист типа Integer
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 4));

        //Создаем новый ArrayList для объединения двух других:
        ArrayList<Integer> list3 = new ArrayList<>();

        //Добавляем все элементы из первого ArrayList в третий:
        list3.addAll(list1);

        //Добавляем все элементы из второго ArrayList в третий:
        list3.addAll(list2);

        //Сортируем третий ArrayList:
        list3.sort(null); // Параметр null указывает на то, что при сортировке не будет
                            // использоваться компаратор (сравнение объектов по какому-либо принципу).
                            // Таким образом, метод sort() будет работать по умолчанию и
                            // выполнять простую сортировку элементов по возрастанию.

        //Выводим на экран третий ArrayList:
        System.out.println(list3);
    }
}