package homeWork.hw_17_03_23.lesson_27_03_23;

import java.util.HashMap;
import java.util.Map;

/*todo
    Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
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
public class Task1 {
    public static void main(String[] args) {
        String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. It was popularised in the 1960s with the release of " +
                "Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software " +
                "like Aldus PageMaker including versions of Lorem Ipsum." ;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);//c- текущий символ
                //содержится ли (с)
            if(map.containsKey(c)){//если С уже встречался ранее
                map.put(c, map.get(c) + 1);//получаем значение по ключу, увеличиваем кол-во +1 и кладём в мапу
            }else {//если С не встречался
                map.put(c,1);
            }
        }
        //перебираем мапу
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                return;
            }
            System.out.println("-1");
        }
    }
}