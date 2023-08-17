package i.o_lesson_1.task1;

import java.util.Date;

public class Task2 {
    public static void main(String[] args) {
        System.out.printf("One%nTwo%nThree%n");
        System.out.println("One\nTwo\nThree\n");

        System.out.printf("Student : %s, average mark - %f, year of studying: %d", "Ivanov Ivan",  4.88 ,3);
        System.out.println();

        boolean b = true;
        boolean b1= false;
        boolean res = b && b1;
        System.out.printf("Значение переменной b - %b, Значение переменной b1 - %b, Значение переменной b && b1 - %b", b, b1, res);
        System.out.println();
        Cat cat = new Cat();

        System.out.printf("Cуществует ли кот? - %b%n",cat);

        cat = null;
        System.out.printf("Cуществует ли кот? - %b%n",cat);

        String hello = "Hello World!";

        System.out.printf("String - %.6s%n", hello);

        char ch = 'a';
        System.out.printf("Symbol - %c.%n", ch);

        double P = Math.PI;
        System.out.println(P);
        System.out.printf("Округленное чисо ПИ : %.3f.%n", P);


        Date date = new Date();
        System.out.println(date);

        System.out.printf("%tT%n", date);
        System.out.printf("Hours - %tH, minutes - %tM, seconds - %tS.%n", date, date, date);

        System.out.printf("%1$tA,%1$td %1$tB, %1$tY.%n", date);

    }
}
