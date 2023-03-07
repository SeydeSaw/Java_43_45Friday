package homeWork.hw_03_03_23;

import java.util.Iterator;
import java.util.List;

public class Task2_ {
    public static void printMiddleElement(List<Integer> list){
        Iterator<Integer> iter = list.iterator();
        int middle = list.size() / 2;
        int i = 0;

        while (iter.hasNext()) {
            if (i == middle) {
                System.out.println(iter.next());
                break;
            }
            iter.next();
            i++;
        }
    }
}
