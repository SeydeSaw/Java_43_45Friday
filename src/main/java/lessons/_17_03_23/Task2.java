package lessons._17_03_23;
/*todo Решение преподавателя
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
        // [1,1,2,3,3,4,4]
        // [1, 2, 3, 4, 1, 4, 3]
        int[] array = {1, 3, 2, 4, 1, 4, 3};
        for (int i = 0; i < array.length; i++) {
            boolean havePair = false;
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                }
                if (array[i] == array[j]) {
                    // у i-го элемента есть пара - j-ый элемент
                    havePair = true;
                    break;
                }
            }
            //
            if (!havePair) {        // if (havePair == false) {
                // i-уникальный элемент?
                System.out.println(array[i]);
                return;
            }
        }
        System.out.println("Нет уникальных элементов");

    }
}
