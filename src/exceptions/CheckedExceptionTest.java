package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExceptionTest {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(reader);
            System.out.println(br.readLine());

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number : ");
            int x = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter the second number : ");
            int y = Integer.parseInt(scanner.nextLine());

            System.out.println("Result : " + (x/y));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Not possible to divide 0");
        } catch (NumberFormatException e){
            System.out.println("You entered not a number");
        }







    }
}
