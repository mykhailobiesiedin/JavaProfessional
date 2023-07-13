package homework4;

import java.util.*;

public class DuplicatedNumbers {

    public static void main(String[] args) {
        // *********** Task1 ***********
        List<Integer> firstList = new ArrayList<>();
        firstList.add(3);
        firstList.add(5);
        firstList.add(6);


        List<Integer> secondList = new ArrayList<>();
        secondList.add(5);
        secondList.add(6);
        secondList.add(8);
        System.out.println(commonNumbers(firstList, secondList));

        // *********** Task2 ***********
        List<Integer> numbers = new ArrayList<>();
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(6);
            numbers.add(7);

        System.out.println(sortedNumbers(numbers));
    }

    public static HashSet<Integer> commonNumbers(List<Integer> firstList, List<Integer> secondList) {
        HashSet<Integer> commonNumbers = new HashSet<>();
        for (Integer findingNumber : firstList) {
            for (Integer matchNumber : secondList) {
                if (Objects.equals(findingNumber, matchNumber)) {
                    commonNumbers.add(matchNumber);
                }
            }
        }
        return commonNumbers;
    }
    public static TreeSet<Integer> sortedNumbers(List<Integer> numbers) {
        TreeSet<Integer> sortedNumbers = new TreeSet<>(numbers);
        TreeSet<Integer> firstAndLast = new TreeSet<>();
        firstAndLast.add(sortedNumbers.first());
        firstAndLast.add(sortedNumbers.last());

        return firstAndLast;
    }
}
