package lambdas_hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст : ");
        String userPhrase = scanner.nextLine();

        Function<List<Integer>, Integer> function = nums -> {
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            return sum;
        };
        sumCalculator(userPhrase, function);
    }

    public static void sumCalculator(String input, Function<List<Integer>, Integer> function) {
        List<Integer> integerList = new ArrayList<>();

        String[] numbers = input.split(",");
        for (String num : numbers) {
            integerList.add(Integer.parseInt(num));
        }
        int result = 0;
        for (Integer nums : integerList) {
            result = function.apply(integerList);

        }
        System.out.println(result);
    }

}
