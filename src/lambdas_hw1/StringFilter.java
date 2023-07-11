package lambdas_hw1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringFilter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст : ");
        String userPhrase = scanner.nextLine();
        System.out.println(searchDigits(Character::isDigit, userPhrase));

    }

    public static String searchDigits(Predicate<Character> isDigit, String text) {
        StringBuilder digits = new StringBuilder();
        for (char chars : text.toCharArray()) {
            if (isDigit.test(chars)) {
                digits.append(chars);
            }
        }
        return digits.toString();
    }
}




