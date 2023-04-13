package homeWork.hw_31_03_23;
/*todo
    Given an array nums containing n distinct numbers in the range [0, n],
    return the only number in the range that is missing from the array.
 */
public class Task3 {
    public int missingNumber(int[] nums) {
        int n = nums.length; // создаем переменную n и присваиваем ей количество элементов в массиве
        int sum = (n * (n + 1))/ 2; //создаем переменную sum и присваиваем ей сумму арифметической прогрессии
        for (int i = 0; i < n; i++) { // итерация по всем элементам массива
            sum -= nums[i]; // уменьшаем сумму прогрессии на каждый элемент массива
        }
        return sum; // возвращаем результат
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1}; // создаем массив nums и присваиваем ему значения
        Task3 task3 = new Task3(); // создаем экземпляр класса
        System.out.println(task3.missingNumber(nums)); // выводим результат на экран
    }
}