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
public class Task_1 {
    public static void main(String[] args) {
        int[]array = {2,3,7,15};
        int target = 9;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] + array[j] == target){
                    System.out.println(Arrays.toString(new int[]{i,j}));
                    return;//необязательно, это просто чтоб сразу выйти из метода если нашли совпадение
                }
            }
        }
    }
}