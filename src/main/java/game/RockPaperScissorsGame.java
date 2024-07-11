package game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userScore = 0;
        int computerScore = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Раунд " + (i + 1) + ". Введите ваш выбор (К - камень, Н - ножницы, Б - бумага): ");
            String userChoice = scanner.next().toUpperCase();
            String computerChoice;

            int randomNumber = random.nextInt(3);
            switch (randomNumber) {
                case 0:
                    computerChoice = "К";
                    break;
                case 1:
                    computerChoice = "Н";
                    break;
                case 2:
                    computerChoice = "Б";
                    break;
                default:
                    computerChoice = "";
            }

            System.out.println("Компьютер выбрал: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("Ничья!");
            } else if ((userChoice.equals("К") && computerChoice.equals("Н")) ||
                    (userChoice.equals("Н") && computerChoice.equals("Б")) ||
                    (userChoice.equals("Б") && computerChoice.equals("К"))) {
                userScore += 1;
                System.out.println("Вы выиграли этот раунд!");
            } else {
                computerScore += 1;
                System.out.println("Компьютер выиграл этот раунд!");
            }
        }

        System.out.println("Итог игры:");
        System.out.println("Ваши очки: " + userScore);
        System.out.println("Очки компьютера: " + computerScore);
        if (userScore > computerScore) {
            System.out.println("Вы выиграли! Поздравляем!");
        } else if (userScore < computerScore) {
            System.out.println("Вы проиграли. Попробуйте еще раз!");
        } else {
            System.out.println("Ничья! Повторите игру.");
        }

        scanner.close();
    }
}