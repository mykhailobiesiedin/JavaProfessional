package lesson8;

import java.util.Scanner;
import java.util.Stack;

public class Lesson8 {
    public static void main(String[] args) {
        Task task = new Task(new StringBuffer("Описание"));

//        Stack<Task> tasks = new Stack<>();
//        tasks.push(task);
//        tasks.push(new Task(new StringBuffer("Описание 222")));
//        tasks.push(new Task(new StringBuffer("Описание 222")));
//        tasks.push(new Task(new StringBuffer("Описание 333")));
//        tasks.push(new Task(new StringBuffer("Описание 444")));
//        tasks.push(new Task(new StringBuffer("Описание 333")));
//        tasks.push(new Task(new StringBuffer("Описание 555")));
//        System.out.println(tasks);

        /*Task upperTask = tasks.pop();
        System.out.println(upperTask);
        System.out.println(tasks);*/

//        int index = tasks.search(new Task(new StringBuffer("Описание 333")));
//        System.out.println(index);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите первое слово: ");
//        String word1 = scanner.nextLine();
//        System.out.print("Введите второе слово: ");
//        String word2 = scanner.nextLine();
//
//        boolean isReverse = checkReverse(word1, word2);
//
//        if (isReverse) {
//            System.out.println("Одно слово является обратным написанием другого.");
//        } else {
//            System.out.println("Слова не являются обратными друг другу.");
//        }
//    }
//
//    public static boolean checkReverse(String word1, String word2) {
//        if (word1.length() != word2.length()) {
//            return false;
//        }
//
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < word1.length(); i++) {
//            stack.push(word1.charAt(i));
//        }
//
//        for (int i = 0; i < word2.length(); i++) {
//            if (stack.isEmpty() || stack.pop() != word2.charAt(i)) {
//                return false;
//            }
//        }
//
//        return true;
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}
