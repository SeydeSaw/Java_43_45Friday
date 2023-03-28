package homeWork._17_03_23;
/*todo
    Дана строка. Вывести количество появлений каждого символа в этой строке.
    Например:
    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu feugiat tellus.
    Nam molestie diam sed libero egestas pellentesque. Nulla.
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
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu feugiat tellus. " +
                "Nam molestie diam sed libero egestas pellentesque. Nulla.";

        //создаем HashMap, где каждому символу будет соответствовать количество его появлений в строке
        HashMap<Character, Integer> letters = new HashMap<>();

        //проходим по всем символам строки
        for (int i = 0; i < str.length(); i++) {
            //получаем текущий символ
            char ch = str.charAt(i);
            //если такой символ уже присутствует в HashMap, то увеличиваем количество появлений на единицу
            if (letters.containsKey(ch)) {
                letters.put(ch, letters.get(ch) + 1);
            }
            //иначе добавляем этот символ в HashMap, а количество появлений устанавливаем в единицу
            else {
                letters.put(ch, 1);
            }
        }
        //выводим результат на экран
        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            System.out.println("Символ '" + entry.getKey() + "' встречается в тексте " + entry.getValue() + " раз");
        }
    }
}