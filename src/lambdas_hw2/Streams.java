package lambdas_hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//public class Streams {
//    public static void main(String[] args) {
//
////        ********Task 1*************
//        List<String> list = Arrays.asList("a1", "b5", "a2", "b4");
//        List<String> list1 = list.stream().filter(a -> a.startsWith("a")).limit(1).collect(Collectors.toList());
//        System.out.println(list1);
//
//        //        ********Task 2*************
//        List<Integer> integerList = Arrays.asList(1, 12, 3, 10, 12, 17);
//        List<Integer> list2 = integerList.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());
//        System.out.println(list2);
//
//        //        ********Task 3*************
//        List<Integer> integerList1 = Arrays.asList(1, 12, 3, 10, 12, 17);
//        integerList1.stream().mapToDouble(a -> a * 1.2).forEach(System.out::println);
//
//        //        ********Task 4*************
//        List<String> stringList = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");
//        List<String> list3 = stringList.stream().filter(a -> a.contains("Big")).collect(Collectors.toList());
//        System.out.println(list3);
//
//        //        ********Task 5*************
//        List<String> stringList1 = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
//        List<String> list4 = stringList1.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(list4);
//
//        //        ********Task 6*************
//        List<Integer> integerList2 = Arrays.asList(1, 12, 3, 10, 12, 17);
//        double result = integerList2.stream().reduce(0, Integer::sum);
//        double average = integerList2.stream().reduce(0, Integer::sum).doubleValue() / integerList2.size();
//        System.out.println(average);
//        System.out.println(result);
//
//        //        ********Task 7*************
//
//        List<Person> people = new ArrayList<>();
//        people.add(new Person("Mykhailo"));
//        people.add(new Person("Sergey"));
//        people.add(new Person("Andrey"));
//        people.add(new Person("Vasiliy"));
//
//        List<Person> sortedPeople = people.stream().sorted(Comparator.comparing(Person::getName)).toList();
//        for (Person person : sortedPeople) {
//            System.out.println(person.getName());
//        }
//
////        //        ********Task 8*************
//        List<String> text = Arrays.asList(
//                "This is the first sentence.",
//                "Here comes the second one.",
//                "And finally, t-> word1.length() - word2.length())
//                .orElse("");
//        long uniqueWordsAmount = text.stream()
//                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
//                .distinct()
//                .count();he third sentence."
//        );
//        String longestWord = text.stream()
//                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
//                .max((word1, word2)
//
//        List<String> uniqueWords = text.stream()
//                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
//                .distinct()
//                .collect(Collectors.toList());
//
//        List<String> sentences = text.stream()
//                .sorted(Comparator.comparingInt(sentence -> sentence.split(" ").length))
//                .sorted(Comparator.reverseOrder())
//                .toList();
//
//
//
//        System.out.println(uniqueWords);
//        System.out.println("The longest word is -> " + longestWord);
//        System.out.println(uniqueWordsAmount);
//        System.out.println(sentences);
//
//
//    }
//}
