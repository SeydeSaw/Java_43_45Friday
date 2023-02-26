package homeWork.hw_24_02_23;
/*todo Task 2
      Дано целое число, представленное его разрядами, которые записаны в массив.
      Например, число 123 представляется массивом [1, 2, 3].
      Получите массив, который преставляет сумму исходного числа и 1.
      Example 1:
        Input: digits = [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
        Incrementing by one gives 123 + 1 = 124.
        Thus, the result should be [1,2,4].
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int[] digits = {scanner.nextInt()};
        // Выводим результат в консоль
        System.out.println(Arrays.toString(getDigits(digits)));
    }
    public static int[] getDigits(int[] digits){
        // Создаем массив для результата с таким же количеством элементов, как и исходный массив
        int[] result = new int[digits.length];

        // Проходим по каждому элементу исходного массива
        for (int i = digits.length - 1; i >= 0; i--) {
            // Добавляем единицу к последнему элементу исходного массива
            int sum = digits[i] + 1;
            // Устанавливаем результирующий элемент в результирующий массив равным сумме
            result[i] = sum;
            // Проверяем, не переполнилось ли число
            if (sum < 10) {
                break;
            }
        }
        // Возвращаем результат
        return result;
    }
}