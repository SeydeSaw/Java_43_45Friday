package homeWork.hw_24_02_23;

import java.util.Arrays;

/*todo Task1
    Дан массив nums целых чисел и целое число target,
    найдите индексы двух элементов массива,
    чтобы сумма этих значений была равна target.
    Предполагается, что существует всегда только одно решение
    и нельзя использовать один и тот же элемент массива дважды.
    Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class Task1 {

    public static int[] twoSum(int[] nums, int target) {
        // Объявляем массив результатов, который будет содержать индексы элементов, чья сумма равна target
        int[] result = new int[2];

        // Проходим по всему массиву
        for (int i = 0; i < nums.length; i++) {
            // Ищем элемент, который дает сумму равную target
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // Если такой элемент найден, добавляем индексы в массив результатов
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[]nums = {2,7,11,15};
        int target= 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));

        int[]nums2 = {3,2,4};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(nums2,target2)));

        int[]nums3 = {3,3};
        int target3 = 6;
        System.out.println(Arrays.toString(twoSum(nums3,target3)));
    }
}