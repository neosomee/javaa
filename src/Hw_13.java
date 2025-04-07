public class Hw_13 {
    public static void printSeparator() {
        System.out.println("---------------");
    }

    public static String leapYearsFunc(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return("Год високосный");
        } else {
            return("Год не високосный");
        }
    }

    public static void leapYear() {
        int year = 2022;
        String message = leapYearsFunc(year);
        System.out.println(message);
    }



    public static String searchClientOs(int clientOs, int clientDeviceYear) {
        if (clientOs == 0 && clientDeviceYear < 2015) {
            return ("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            return ("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            return("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            return("Установите версию приложения для Android по ссылке");
        } else {
            return "Неподдерживаемая операционная система";
        }
    }

    public static void clientOs() {
        int clientOsSystem = 1;
        int clientDeviceYear = 2010;
        String message = searchClientOs(clientOsSystem, clientDeviceYear);
        System.out.println(message);
    }


    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void sendCards() {
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    public static void main(String[] args) {
        leapYear();
        clientOs();
        sendCards();
    }

}