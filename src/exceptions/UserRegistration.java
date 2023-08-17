package exceptions;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Your age : " + age);
        try {
            registration(age);
            //можно catch(Exception e)
        } catch (TooBigAgeException | TooSmallAgeException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Program finished work successfully");
    }

    public static void registration(int age) throws TooBigAgeException {
        if(age < 12){
            throw new TooSmallAgeException("Too young bro...");
        } else if (age> 120) {
            throw new TooBigAgeException("Too old bro...");
        } else {
            System.out.println("Registration is successful");
        }
    }
}
