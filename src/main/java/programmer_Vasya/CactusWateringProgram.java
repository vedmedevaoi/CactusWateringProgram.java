package programmer_Vasya;

import java.util.Random;
import java.util.Calendar;

public class CactusWateringProgram {
    public static void main(String[] args) {
        // Переменная для даты последнего полива кактуса, можно ввести вручную или получить от пользователя
        Calendar lastWateringDate = Calendar.getInstance();
        // Предположим, что у нас текущая дата
        Calendar currentDate = Calendar.getInstance();

        // "Запуск" датчика влажности, генерируем случайное значение влажности от 0 до 100
        int humidity = generateRandomHumidity();

        // Логика определения частоты полива в зависимости от времени года и влажности воздуха
        if (isWinter(currentDate)) {
            // Зимой поливаем раз в месяц
            currentDate.add(Calendar.MONTH, 1);
        } else if (isSpringOrAutumn(currentDate)) {
            // Весной и осенью поливаем раз в неделю
            currentDate.add(Calendar.DAY_OF_MONTH, 7);
        } else {
            // Летом, если влажность менее 30%, поливаем не чаще одного раза в два дня
            if (humidity < 30) {
                currentDate.add(Calendar.DAY_OF_MONTH, 2);
            }
        }

        System.out.println("Для кактуса нужен полив " + currentDate.getTime());
    }

    private static int generateRandomHumidity() {
        Random random = new Random();
        return random.nextInt(101); // Генерируем случайное число от 0 до 100
    }

    private static boolean isWinter(Calendar date) {
        int month = date.get(Calendar.MONTH) + 1;
        return month >= 12 || month <= 2;
    }

    private static boolean isSpringOrAutumn(Calendar date) {
        int month = date.get(Calendar.MONTH) + 1;
        return month >= 3 && month <= 5 || month >= 9 && month <= 11;
    }
}