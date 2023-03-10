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
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        //создаем лист типа Integer
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 3, 4, 5));
        printMiddleElement(list);
    }
    public static void printMiddleElement(List<Integer> list){
        //создаем итератор для списка
        Iterator<Integer> iter = list.iterator();
        int middle = list.size() / 2;
        int i = 0;

        while (iter.hasNext()) {
            if (i == middle) {
                System.out.println(iter.next());
                break;
            }
            iter.next();
            i++;
        }
    }
}
