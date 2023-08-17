package generics;

public class BoxTest1 {
    public static void main(String[] args) {
        Box1<String> stringBox = new Box1<>();
        Box1<Integer> integerBox1 = new Box1<>();

        stringBox.putItem("Hello");
        integerBox1.putItem(10);

        System.out.println(stringBox.getItem());
        System.out.println(integerBox1.getItem());
    }



}
