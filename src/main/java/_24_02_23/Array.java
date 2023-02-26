package _24_02_23;

import java.util.Random;
import java.util.Scanner;

public class Array {

    public static final int ROW_COUNT = 5;// создалась константа , в которой значение можем менять

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;//кажый элемент массива умножаем на 10
        }

//        //вызываем сканнер для ввода с консоли
//        Scanner scanner = new Scanner(System.in);
//        //объявляем переменную и передаём ей ввод с консоли
//        int length = scanner.nextInt();
//        //таким образом мы с консоли задаём длину массива
//        int[] arr = new int[length];

        //-----------------------------------

        //Прямоугольный массив

        //(b - a) * Math.random() + a
        //случайны числа в диапазоне от a до b
        //Если нужны целые числа: (int)((b - a) * Math.random() + a)
//        int a = 0, b = 100;
//        int[][] table = new int[5][3];
//        for (int i = 0; i < table.length; i++) {
//            for (int j = 0; j < table[i].length; j++) {//от определенного элемента массива
//                table[i][j] = (int)((b - a) * Math.random() + a);
//                System.out.print(table[i][j] + " ");
//            }
//            System.out.println();
//        }
        //------------------------------------

        //Треугольный массив

        Random random = new Random();
        int[][] table2 = new int[ROW_COUNT][];//command+option+c Вызвать константу
        for (int i = 0; i < ROW_COUNT; i++) {
            table2[i] = new int[i + 1];
            for (int j = 0; j < table2[i].length; j++) {//создаём в каждой строке массив
                table2[i][j] = random.nextInt(10);
                System.out.print(table2[i][j] + " ");
            }
            System.out.println();
        }
    }
}