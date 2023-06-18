package lesson3;

import java.util.*;

public class Lesson3 {
    public static void main(String[] args) {
//        List<Document> docs = new ArrayList<>();
//        docs.add(new Document(1, "Счет 1"));
//        docs.add(new Document(2, "Счет 2"));
//        printResult(docs);
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст : ");
        String text = scanner.next();
        while (scanner.hasNext()){
            words.add(text);
//            System.out.println("Спасибо введите следующее слово или \"Stop\"");
            text = scanner.next();
            if (text.equals("Stop")){
                break;
            }
        }

        List<String> negativeAmountOfLetters = new ArrayList<>();
        for (String word : words) {
            if (word.length() % 2 == 0) {
                negativeAmountOfLetters.add(word);
            }
            for (String w : negativeAmountOfLetters) {
                System.out.println(w);
            }
        }
//    static void printResult(List<Document> documents){
//        for (int i =0; i< documents.size(); i++){
//            Document document = (Document) documents.get(i);
//            System.out.println(document);
//        }
    }
}
