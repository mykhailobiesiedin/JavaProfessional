package generics;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Hello");
        list.add(12);

        String text = (String) list.get(0);
        System.out.println(text);
    }
}
