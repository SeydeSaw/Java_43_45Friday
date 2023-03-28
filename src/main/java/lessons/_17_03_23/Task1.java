package lessons._17_03_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* TODO: 14.03.23 решение Преподавателя
    Given an integer array nums sorted in non-decreasing order,
    remove the duplicates in-place such that each unique element
    appears only once. The relative order of the elements should be
    kept the same.
    Example 1:
    Input: nums = [1,1,2]
    Output: 2, nums = [1,2,_]
    Explanation: Your function should return k = 2,
    with the first two elements of nums being 1 and 2 respectively.
    It does not matter what you leave beyond the returned k
    (hence they are underscores).
    Example 2:
    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5, nums = [0,1,2,3,4,,,,,_]
    Explanation: Your function should return k = 5,
    with the first five elements of nums being 0, 1, 2, 3, and
    4 respectively.
    It does not matter what you leave beyond the returned k
    (hence they are underscores).
    ********
    Учитывая целочисленный массив nums,
    отсортированный в неубывающем порядке, удалите дубликаты на месте так,
    чтобы каждый уникальный элемент появился только один раз. Относительный порядок элементов
    должен остаться неизменным.
    Пример 1: Вход: nums = [1,1,2] Выход: 2, nums = [1,2,_]
    Пояснение: Ваша функция должна вернуть k = 2,
    при этом первые два элемента nums будут 1 и 2 соответственно.
    Не имеет значения, что вы оставите за пределами возвращаемого k (поэтому это символы подчеркивания).
    Пример 2: Вход: nums = [0,0,1,1,1,1,2,2,3,3,4] Выход: 5, nums = [0,1,2,3,4,,,,,_]
    Пояснение: Ваша функция должна вернуть k = 5, при этом
    первые пять элементов nums будут 0, 1, 2, 3 и 4 соответственно.
    Не имеет значения, что вы оставите за пределами возвращаемого k (следовательно, это знаки подчеркивания).
 */
public class Task1 {

    public static void main(String[] args) {
        //todo
        // Первый способ

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int a : array) {
            if (!list.contains(a)) { //если наш лист не содержит а. ! - логическое НЕ
                list.add(a);//добавить а в лист
                array[count] = a;
                count++;
            }
        }
        System.out.println("k = " + list.size() + ", " + Arrays.toString(array));

        //todo
        // Второй способ

        final int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int n = uniqElements2(arr);
        System.out.println("k = " + n + ", " + Arrays.toString(arr));

        System.out.println();

        int a = 2;
        System.out.println("in main before a = " + a);
        method1(a);
        System.out.println("in main after a = " + a);
    }

    private static int uniqElements(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int a : array) {
            if (!list.contains(a)) {    // ! - логическое НЕ
                list.add(a);
                array[count] = a;
                count++;
            }
        }
        return list.size();
    }

    private static int uniqElements2(int[] array) {
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[count] = array[i + 1];
                count++;
            }
        }
        return count;
    }

    private static int method1(int a) {
        System.out.println("in method1 before a = " + a);
        a = a * 2;
        System.out.println("in method1 after a = " + a);
        return a;
    }
}