package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    static List<Double> expression = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            double number = getNumber();
            expression.add(number);
            char operator = getOperationSign();
            if (operator == '=') {
                break;
            }
            expression.add((double) operator);
        }
        final double result = countResult(expression);
        System.out.println(result);
    }

    public static double getNumber() {
        System.out.println("Enter the number : ");
        double number;

        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            System.out.println("You have entered not the number, please try again.");
            scanner.next();
            number = getNumber();
        }
        return number;
    }

    public static char getOperationSign() {
        System.out.println("Enter the operation sign '*' , '+', '-' or '/'. To finish program enter '='");
        char sign = scanner.next().charAt(0);
        if (sign == '*') {
            return sign;
        } else if (sign == '+') {
            return sign;
        } else if (sign == '-') {
            return sign;
        } else if (sign == '/') {
            return sign;
        } else if (sign == '=') {
            return sign;
        } else {
            System.out.println("You've entered the wrong sign, please enter the valid one.");
            scanner.nextLine();
            sign = getOperationSign();
        }
        return sign;
    }

    public static double countResult(List<Double> expression) {
        double result = expression.get(0);

        for (int i = 1; i < expression.size(); i += 2) {
            char operator = (char) Math.round(expression.get(i));
            double number = expression.get(i + 1);

            switch (operator) {
                case '+':
                    result += number;
                    break;
                case '-':
                    result -= number;
                    break;
                case '*':
                    result *= number;
                    break;
                case '/':
                    result /= number;
                    break;
            }
        }
        return result;
    }
}
