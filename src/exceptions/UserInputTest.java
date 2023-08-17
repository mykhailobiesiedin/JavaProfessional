package exceptions;

import java.util.Scanner;

public class UserInputTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Enter your age : ");
//        int age = scanner.nextInt();
        int age;

        try {
            age = Integer.parseInt(scanner.nextLine());

        } catch (NumberFormatException e) {
            //Здесь мы можем произвести логирование
            System.out.println("Error! Not number entered. Default number accepted");
            System.out.println(e.getMessage());
            e.printStackTrace();
            age = -1;
        }

        System.out.printf("User: %s, age: %d", name, age);
    }
}
