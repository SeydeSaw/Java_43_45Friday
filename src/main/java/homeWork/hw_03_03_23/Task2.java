package homeWork.hw_03_03_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*todo Task2
    Пусть дан ArrayList нечетной длины.
    Используя только Iterator (не прибегая к индексам и длине списка),
    вывести на экран элемент, находящийся ровно посередине списка.
    Example 1:
    Input: list = [1,2,4]
    Output: 2
    Example 2:
    Input: list = [1,2,3,4,5]
    Output: 3
    Example 3:
    Input: list = [1]
    Output: 1
 */
public class Task2 {
    public static void main(String[] args) {
        //создаем лист типа Integer
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //создаем итератор для списка
        Iterator<Integer> iterator = list.iterator();

        // Проходим по списку увеличивая итератор на 1, пока не дойдём до середины списка
        int centerIndex = list.size() / 2;
        for (int i = 0; i < centerIndex; i++) {
            iterator.next();
        }
        // Выводим на экран элемент, находящийся посередине списка
        System.out.println(iterator.next());
    }
}