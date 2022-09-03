public class Main {
    public static void main(String[] args) {
        // Задача 1 и 2.
        System.out.println("    Задача 1 и 2.");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }

        // Задача 3.
        System.out.println("    Задача 3.");
        int year = 2020;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год - является високосным");
        } else {
            System.out.println(year + " год - не является високосным");
        }

        // Задача 4.
        System.out.println("    Задача 4.");
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance > 20) {
            System.out.println("Потребуется дней: " + (deliveryDistance / 40 + days));
        } else {
            System.out.println("Потребуется дней: " + days);
        }

        // Задача 5.
        System.out.println("    Задача 5.");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}