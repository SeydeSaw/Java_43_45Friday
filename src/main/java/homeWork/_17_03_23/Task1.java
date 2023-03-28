package homeWork._17_03_23;
/*todo
    Task 1. Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
    Example 1:
    Input: s = "leetcode"
    Output: 0
    Example 2:
    Input: s = "loveleetcode"
    Output: 2
    Example 3:
    Input: s = "aabb"
    Output: -1
    Подсказка: можно решить, используя HashMap.
 */
import java.util.HashMap;

public class Task1 {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>(); //создаем хэшмап

        for (int i = 0; i < s.length(); i++) { //проходим по длине строки
            char c = s.charAt(i); //получаем значение в позиции i
            if (map.containsKey(c)) { //если такой ключ уже есть в хэшмапе
                map.put(c, map.get(c) + 1); //то добавляем ему +1
            } else { //иначе
                map.put(c, 1); //добавляем ключ со значением 1
            }
        }

        for (int i = 0; i < s.length(); i++) { //для каждого элемента из строки
            char c = s.charAt(i); //получаем значение в позиции i
            if (map.get(c) == 1) { //если значение в хэшмапе равно 1
                return i; //возвращаем индекс этого элемента
            }
        }
        return -1; //возвращаем -1, если первый неповторяющийся элемент не найден
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s)); //выводим результат поиска первого неповторяющегося элемента
    }
}