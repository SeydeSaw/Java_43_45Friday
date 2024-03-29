package homeWork.hw_27_03_23;
/*You are keeping the scores for a baseball game with strange rules.
At the beginning of the game, you start with an empty record.
You are given a list of strings operations, where operations[i] is the
ith operation you must apply to the record and is one of the following:
An integer x - Record a new score of x.
'+' - Record a new score that is the sum of the previous two scores.
'D' - Record a new score that is the double of the previous score.
'C' - Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.
Example 1:
Input: ops = ["5","2","C","D","+"]
Output: 30
Explanation:
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.
Example 2:
Input: ops = ["1","C"]
Output: 0
Explanation:
"1" - Add 1 to the record, record is now [1].
"C" - Invalidate and remove the previous score, record is now [].
Since the record is empty, the total sum is 0.

Задача довольно легко решается, если придумать, какую структуру данных лучше использовать.
Вы уже прошли все коллекции в Java. Какая из них лучше всего подходит для решения этой задачи?
 */
import java.util.Stack;
/*  TODO: 30.03.23
        Я думаю, что для этой задачи лучше использовать коллекцию Stack,
        которая позволяет хранить и извлекать элементы в порядке Last-In-First-Out (LIFO).
        Это означает, что последний элемент, добавленный в стек, будет извлекаться первым,
        что позволит нам применять операции в правильном порядке и правильно суммировать результат.
 */
public class BaseballGame {
    public static int calcScore(String[] operations) {
        Stack<Integer> stack = new Stack<>(); // создаём стек
        int sum = 0;
        for (String op : operations) {
            if (op.equals("+")) { // если операция равна +
                int x = stack.pop(); // забираем последний элемент стека
                int y = stack.pop(); // забираем предпоследний элемент стека
                stack.push(y); // возвращаем предпоследний элемент в стек
                stack.push(x); // возвращаем последний элемент в стек
                stack.push(x + y); // добавляем в стек сумму предпоследнего и последнего элементов
            } else if (op.equals("D")) { // если операция равна D
                int x = stack.pop(); // забираем последний элемент стека
                stack.push(x); // возвращаем последний элемент в стек
                stack.push(2 * x); // добавляем в стек удвоенное значение последнего элемента
            } else if (op.equals("C")) { // если операция равна C
                stack.pop(); // удаляем последний элемент стека
            } else { // если операция является числом
                int x = Integer.parseInt(op); // преобразуем строку в число
                stack.push(x); // добавляем число в стек
            }
        }
        while (!stack.isEmpty()) { // пока стек не пуст
            sum += stack.pop(); // добавляем значение последнего элемента в сумму
        }
        return sum; // возвращаем сумму
    }

    public static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};
        System.out.println(calcScore(operations)); // вывели результат
    }
}