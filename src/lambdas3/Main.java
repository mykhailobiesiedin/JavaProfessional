package lambdas3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<List<String>> countries = Arrays.asList(
                Arrays.asList("Kharkiv, Odessa, Kiew"),
                Arrays.asList("Berlin, Bayern, Koln"),
                Arrays.asList("Paris, Bord, Strasbourg")
        );

        long amount = countries.stream().mapToLong(Collection::size).sum();
        System.out.println(amount);

        Set<String> cities = countries.stream().flatMap((country)-> country.stream()).collect(Collectors.toSet());
        System.out.println(cities);

        //======================================

        List<String> words = Arrays.asList("dsdfdsd", "dfsdfdsfds", "dfsd", "fgd", "d");
        Map<String, Integer> wordsLength = words.stream().collect(Collectors.toMap(word->word, word->word.length()));
        System.out.println(wordsLength);

        //======================================

        String allWords = words.stream().filter(word->word.length()>3).collect(Collectors.collectingAndThen(Collectors.toList(), list -> list.stream().collect(Collectors.joining("*"))));
        System.out.println(allWords);

        String value = words.toString();
        System.out.println(value);

        //======================================

        String wordsWithSeparator = words.stream().collect(Collectors.joining(";"));
        System.out.println(wordsWithSeparator);

        //======================================

        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Avocado");
        Map<Character, Long> countByLength = fruits.stream().collect(Collectors.groupingBy((fruit)->fruit.charAt(0), Collectors.counting()));
        System.out.println(countByLength);
    }


}



