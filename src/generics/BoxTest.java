package generics;

import i.o_lesson_1.task1.Cat;

public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box();

        box.putItem("Hello");
        box.putItem(42);
        box.putItem(new Cat());

        Object item = box.getItem();
        System.out.println(item);

        int length = ((String) item).length();
        System.out.println("String length - " + length);
    }
}
