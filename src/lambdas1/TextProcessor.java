package lambdas1;

import java.util.function.Function;

public class TextProcessor {
    public static void processString(String text, Function<String, String> lambdaFunction) {
        String[] words = text.split(" ");
        for (String word : words) {
            String result = lambdaFunction.apply(word);
            System.out.println(result);
        }
    }

    public static void testTextProcessor() {
        String text = "Равным образом рамки и место обучения кадров создаёт предпосылки качественно новых шагов для соответствующих условий активизации";
        System.out.println("Исходный текст:");
        System.out.println(text);

        // Лямбда-функция: приведение к верхнему регистру
        System.out.println("Приведение к верхнему регистру:");
        processString(text, String::toUpperCase);
        System.out.println();

        // Лямбда-функция: сокращение длины строки до трех символов
        Function<String, String> truncate = str -> str.substring(0, Math.min(str.length(), 3));
        System.out.println("Сокращение длины строки до трех символов:");
        processString(text, truncate);
        System.out.println();

        // Лямбда-функция: возврат длины строки вместо содержимого
        System.out.println("Возврат длины строки вместо содержимого:");
        processString(text, str -> String.valueOf(str.length()));
    }
}
