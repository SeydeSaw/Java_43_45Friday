package lessons._17_03_23.comparable;

import lessons._17_03_23.comparable.Message;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Collections.sort(integerArrayList);
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Hello, world!"));
        messages.add(new Message("Hello, Java!"));
        Collections.sort(messages);


        messages.sort(new Comparator<Message>() {
            @Override
            public int compare(Message o1, Message o2) {
                return o1.getText().compareTo(o2.getText());
            }
        });


    }

}
