package generics;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Size", 43);

        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

    }
}
