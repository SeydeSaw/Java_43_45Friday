package homeWork.hw_03_03_23.hw_03_03_23dop;

import java.util.ArrayList;
import java.util.List;

/* todo Task1
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
public class Task1P {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 7));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(2, 4, 5));
        ArrayList<Integer> list3 = new ArrayList<>();

        int i = 0, j = 0;
        int size1 = list1.size();
        int size2 = list2.size();
        while (i < size1 && j < size2) {
            int first = list1.get(i);
            int second = list2.get(j);
            if (first < second) {
                list3.add(first);
                i++;
            } else {
                list3.add(second);
                j++;
            }
        }
        //дописываем возможные оставшиеся элементы из списков
        while (i < size1) {
            list3.add(list1.get(i));
            i++;
        }
        while (j < size2) {
            list3.add(list2.get(i));
            j++;
        }
        System.out.println(list3);
    }
}