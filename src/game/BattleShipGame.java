package game;

import java.util.Scanner;

public class BattleShipGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваше имя : ");
        String player1 = scanner.nextLine();

        System.out.println("Введите имя противника: ");
        String player2 = scanner.nextLine();
    }
}
