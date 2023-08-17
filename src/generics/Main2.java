package generics;

public class Main2 {
    public static void main(String[] args) {
        print("Hello World");
        print(256);

    }

    public static <T> void print(T item){
        System.out.println(item);
    }
}
