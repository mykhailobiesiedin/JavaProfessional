package homework5;

import java.util.Arrays;
import java.util.Stack;

public class BracketIdentifier {
    public static void main(String[] args) {
        String expression1 = "(2 + 3) * (5 - 2)";
        String expression2 = "(2 + 3 * (5 - 2)";
        String expression3 = "2 + 3) * (5 - 2";

        checkBrackets(expression1);
        checkBrackets(expression2);
        checkBrackets(expression3);
    }

    public static void checkBrackets(String expression) {
        Stack<Character> symbols = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if (symbol == '(') {
                symbols.push(symbol);
            } else if (symbol == ')') {
                if (symbols.isEmpty()) {
                    System.out.println("Ошибка: не открыта скобка");
                }
                symbols.pop();
            }
        }

        if (symbols.isEmpty()) {
            System.out.println("Скобки расставлены правильно");
        } else {
            System.out.println("Ошибка: не закрыта скобка");
        }
    }
}
