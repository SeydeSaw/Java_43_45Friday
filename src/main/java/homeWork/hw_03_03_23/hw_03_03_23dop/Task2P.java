package homeWork.hw_03_03_23.hw_03_03_23dop;

import java.util.ArrayList;
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
public class Task2P {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(5, 2, 3, 4, 5));

        //todo  Способ 1 :

//        int size = 0;
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            size++;
//            iterator.next();
//        }
//        System.out.println(size);
//
//        Iterator<Integer> iterator2 = list.iterator();
//        int i = 0;
//        while (iterator2.hasNext()){
//            int number = iterator2.next();
//            if (i == size/2){
//                System.out.println(number);
//                break;
//            }
//            i++;
//        }

        //todo  Способ 2:

        Iterator<Integer> iter1 = list.iterator();
        iter1.next();
        Iterator<Integer> iter2 = list.iterator();
        iter2.next();
        int number = 0;
        while (iter2.hasNext()){
            number = iter1.next();
            iter2.next();
            iter2.next();
        }
        System.out.println(number);
    }
}