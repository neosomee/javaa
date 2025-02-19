public class Hw_7 {
    public static void main(String[] args) {
        int clientOs = 1;
        int clientDeviceYear = 2015;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }


        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }


        int deliveryDistance = 95;
        int deliveryDays;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }


        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Зима");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Весна");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Лето");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }
}