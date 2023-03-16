package homeWork.hw_10_03_23;
/* TODO: 14.03.23
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
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        // Инициализируем список nums
        ArrayList<Integer> nums = new ArrayList<>(List.of(0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 4));
        // Создаем пустой список nums2
        ArrayList<Integer> nums2 = new ArrayList<>();
        // Инициализируем переменную k
        int k = 0;

        // Перебираем все элементы списка nums
        for (int i = 0; i < nums.size(); i++) {
            // Перебираем все элементы списка nums, следующие за i-м
            for (int j = i + 1; j < nums.size(); j++) {
                // Если найден повторяющийся элемент, добавляем его в nums2
                if (nums.get(i).equals(nums.get(j))) {
                    nums2.add(nums.get(i));
                }
            }
        }
        k = nums.size();

        // Удаляем повторяющиеся элементы из списка nums
        nums.removeAll(nums2);

        // Выводим списки nums и nums2 на экран
        System.out.println(nums);
        System.out.println(nums2);

        // Создаем новый список result, добавляя в него элементы из списков nums и nums2
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(nums);
        result.addAll(nums2);

        // Выводим список result на экран
        System.out.println("*************");
        System.out.println(result);
    }
}