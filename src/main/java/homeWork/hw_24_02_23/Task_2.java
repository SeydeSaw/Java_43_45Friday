package homeWork.hw_24_02_23;

import java.util.Arrays;

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
        // 1, 2, 3 -> 1, 2, 4
        // 1, 2, 9 -> 1, 3, 0
        // 9, 9 -> 1, 0, 0
 */
public class Task_2 {
    public static void main(String[] args) {
        int[] number = {9,9,9};
        for (int i = number.length-1; i >=0 ; i--) {//двигаемся с конца к началу
            if (number[i] != 9){//если не равно 9
                number[i] = number[i]+1;//то увеличиваем число на 1
                break;
            }else {//если равно 9
                number[i] = 0;// то это число заменяем нулём
            }
        }
        if (number[0] == 0){//если первое число равно 0
            int[] array = new int[number.length+1];//создаём новый массив и увеличиваем его длину на 1
            array[0]=1;// меняем первое число, т.е. 0 на 1
            number = array;
        }
        System.out.println(Arrays.toString(number));
    }
}