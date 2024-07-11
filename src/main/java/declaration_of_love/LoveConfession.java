package declaration_of_love;

import java.util.Scanner;

public class LoveConfession {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину забора (в см): ");
        int length = scanner.nextInt();

        int letterLength = 3 * 62; // Длина для каждых трех букв
        int spaceLength = 12; // Длина для каждого пробела
        int totalLength = letterLength + 2 * spaceLength; // Общая длина для фразы "признание в любви"

        if (length >= totalLength) {
            System.out.println("Надпись 'признание в любви' поместится на забор длиной " + length + " см.");
        } else {
            System.out.println("Надпись 'признание в любви' не поместится на забор длиной " + length + " см.");
        }
    }
}