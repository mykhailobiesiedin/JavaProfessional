package homework3;

import java.util.*;

public class CountingTime {
    private static final int COLLECTION_SIZE = 10000;
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        List<String> arrayList = new ArrayList<>();
        //Первое задание
        long startTime = System.currentTimeMillis();
        addRandomValuesToTail(linkedList);
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("Operation of adding %s random symbols in %s took %s ms",
                COLLECTION_SIZE, "LinkedList", endTime - startTime));

        startTime = System.currentTimeMillis();
        addRandomValuesToTail(arrayList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Operation of adding %s random symbols in %s took %s ms",
                COLLECTION_SIZE, "ArrayList", endTime - startTime));
        //Второе задание
        startTime = System.currentTimeMillis();
        addRandomValuesToCenter(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Operation of pasting %s random symbols int the middle of %s took %s ms",
                COLLECTION_SIZE, "LinkedList", endTime - startTime));

        startTime = System.currentTimeMillis();
        addRandomValuesToCenter(arrayList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Operation of pasting %s random symbols in the middle of %s took %s ms",
                COLLECTION_SIZE, "ArrayList", endTime - startTime));
//        System.out.println(arrayList);
        //Третье задание
        startTime = System.currentTimeMillis();
        getValuesWithRandomIndex(arrayList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Operation of getting %s random symbols from the middle of %s took %s ms",
                COLLECTION_SIZE, "ArrayList", endTime - startTime));

        startTime = System.currentTimeMillis();
        getValuesWithRandomIndex(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Operation of getting %s random symbols from the middle of %s took %s ms",
                COLLECTION_SIZE, "LinkedList", endTime - startTime));
        //Четвертое задание
        startTime = System.currentTimeMillis();
        deleteValuesFromTheTail(arrayList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Operation of deleting %s  symbols from the tail of %s took %s ms",
                COLLECTION_SIZE, "ArrayList", endTime - startTime));

        startTime = System.currentTimeMillis();
        deleteValuesFromTheTail(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Operation of deleting %s  symbols from the tail of %s took %s ms",
                COLLECTION_SIZE, "LinkedList", endTime - startTime));
        //Пятое задание
        startTime = System.currentTimeMillis();
        deleteValuesFromCenter(arrayList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Operation of deleting %s  symbols from the center of %s took %s ms",
                COLLECTION_SIZE, "ArrayList", endTime - startTime));

        startTime = System.currentTimeMillis();
        deleteValuesFromCenter(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println(String.format("Operation of deleting %s  symbols from the center of %s took %s ms",
                COLLECTION_SIZE, "LinkedList", endTime - startTime));
    }

    public static int generateRandomIndex() {
        return random.nextInt(COLLECTION_SIZE);
    }

    public static void addRandomValuesToTail(List<String> list) {
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.add(generateRandomValue());
        }
    }

    public static void addRandomValuesToCenter(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        for (int i = 0; i < COLLECTION_SIZE / 2; i++) {
            iterator.next();
        }

        for (int i = 0; i < COLLECTION_SIZE; i++) {
            iterator.add(generateRandomValue());
        }
    }

    public static void getValuesWithRandomIndex(List<String> list) {
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            String value = list.get(generateRandomIndex());
        }
    }

    public static void deleteValuesFromTheTail(List<String> list) {
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.remove(list.size() - 1);
        }
    }

    public static void deleteValuesFromCenter(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            iterator.next();
        }
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    private static String generateRandomValue() {
        return UUID.randomUUID().toString();
    }
}
