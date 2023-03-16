package homeWork.hw_10_03_23;

import java.util.ArrayList;
import java.util.List;

/*todo
    Given a non-empty array of integers nums,
    every element appears twice except for one.
    Find that single one.
    Example 1:
    Input: nums = [2,2,1]
    Output: 1
    Example 2:
    Input: nums = [4,1,2,1,2]
    Output: 4
    Example 3:
    Input: nums = [1]
    Output: 1
    Дан непустой массив целых чисел nums, каждый элемент которого встречается дважды, кроме одного.
    Найдите этот единственный элемент. Пример 1: Вход: nums = [2,2,1] Выход: 1
    Пример 2: Вход: nums = [4,1,2,1,2] Выход: 4
    Пример 3: Вход: nums = [1] Выход: 1
 */
public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> numsList = new ArrayList<>(List.of(1, 1, 2, 2, 3));

        // переменная для хранения результата
        int singleNum = 0;

        // перебираем элементы списка
        for (int i = 0; i < numsList.size(); i++) {
            // берем текущий элемент
            int temp = numsList.get(i);
            // проверяем, сколько раз он встречается в списке
            int count = 0;
            for (int j = 0; j < numsList.size(); j++) {
                if (numsList.get(j) == temp) {//кадый раз проходит по массиву и сравнивается индекс i с каждым индексом j
                    count++;
                }
            }
            // если элемент встречается в списке один раз, то это искомый элемент
            if (count == 1) {
                singleNum = temp;
            }
        }
        System.out.println("Уникальный элемент: " + singleNum);
    }
}