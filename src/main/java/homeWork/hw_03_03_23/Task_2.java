package homeWork.hw_03_03_23;
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
import java.util.ArrayList;
import java.util.Iterator;

public class Task_2 {
    public static void main(String[] args) {
        //создаем лист типа Integer
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //создаем итератор для списка
        Iterator<Integer> iterator = list.iterator();
        int i = 0;
        //находим индекс элемента, находящегося ровно посередине списка
        int centerIndex = list.size() / 2;

        while (iterator.hasNext()) {
            if (i == centerIndex) {
                //выводим элемент, находящийся по этому индексу, на экран
                System.out.println(iterator.next());
                break;
            }
            //используя итератор, проходим по списку, пока не дойдем до индекса, находящегося ровно посередине списка
            iterator.next();
            i++;
        }
    }
}