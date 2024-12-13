public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println();

        System.out.println("Задача 1");
        // Ввод OS (0 — iOS, 1 — Android)
        int clientOs = 1;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Вы ввели не корректные данные");
        }
        System.out.println();

        System.out.println("Задача 2");
        // Ввод OS (0 — iOS, 1 — Android)
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Вы ввели не корректные данные");
        }
        System.out.println();

        System.out.println("Задача 3");
        int year = 2024;
        if (year > 1584) {
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else if (year < 1584) {
            System.out.println("Год должен быть больше, чем 1584");
        }
        System.out.println();

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDay = 0;
        if (deliveryDistance <= 20) {
            deliveryDay = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDay = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDay = 3;
        } else {
            System.out.println("Доставка не доступна");
            return;
        }
        System.out.println("Потребуется дней: " + deliveryDay);
        System.out.println();

        System.out.println("Задача 5");
        int monthNumber = 1;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


    }
}