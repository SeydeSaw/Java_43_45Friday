package homeWork.hw_17_03_23.lesson_27_03_23;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*todo
    Дана строка. Вывести количество появлений каждого символа в этой строке. Например:
    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu feugiat tellus. Nam molestie diam sed libero egestas pellentesque. Nulla.
    Символ e встречается 20 раз.
    Символ пробел/space встречается 19 раз.
    Символ l встречается 11 раз.
    Символ i встречается 11 раз.
    Символ t встречается 11 раз.
    Символ s встречается 10 раз.
    Символ u встречается 7 раз.
    Символ a встречается 7 раз.
    Символ n встречается 6 раз.
    Символ m встречается 6 раз.
    Символ o встречается 6 раз.
    Символ r встречается 5 раз.
    Символ . встречается 4 раз.
    Символ g встречается 4 раз.
    Символ d встречается 4 раз.
    Символ c встречается 3 раз.
    Символ p встречается 3 раз.
    Символ , встречается 1 раз.
    Символ f встречается 1 раз.
    Символ b встречается 1 раз.
    Символ q встречается 1 раз.
 */
public class Task3 {
    public static void main(String[] args) {
        String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. It was popularised in the 1960s with the release of " +
                "Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software " +
                "like Aldus PageMaker including versions of Lorem Ipsum." ;
        Map<Character, Integer> map = new TreeMap<>();//HashMap не сортирует по ключу,поэтому лучше использовать TreeMap
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
            System.out.println("Символ '" + entry.getKey() + "' содержится " + entry.getValue() + " раз");
        }
    }
}