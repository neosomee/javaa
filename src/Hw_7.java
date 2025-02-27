public class Hw_7 {
    public static void main(String[] args) {
        int clientOs = 1;
        int clientDeviceYear = 2015;
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");


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
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                deliveryDays = 2;
            } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                deliveryDays = 3;
                System.out.println("Потребуется дней: " + deliveryDays);
            } else {
                System.out.println("Свыше 100 км доставки нет.");
            }


            int monthNumber = 12;
            switch (monthNumber) {
                case 12, 1, 2 -> System.out.println("Зима");
                case 3, 4, 5 -> System.out.println("Весна");
                case 6, 7, 8 -> System.out.println("Лето");
                case 9, 10, 11 -> System.out.println("Осень");

            }
        }
    }
}