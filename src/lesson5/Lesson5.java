package lesson5;

import java.util.LinkedList;

public class Lesson5 {
    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(5);
//        linkedList.add(2);
//        linkedList.add(1, 4);
//        System.out.println(linkedList);
//
//        linkedList.addFirst(3);
//        linkedList.set(2, 1);
//        System.out.println(linkedList);

        LinkedList<Document> list = new LinkedList<>();
        list.add(new Document("This"));
        list.add(new Document("is"));
        list.add(new Document("some"));
        list.add(new Document("text"));

//        System.out.println(list);

//
        while (!list.isEmpty()){
            Document document = list.removeFirst();
            System.out.println(document.getText());
        }
    }
}
