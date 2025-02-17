public class Hw_6 {
    public static void main(String[] args) {
        int age = 42;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний.");
        } else {
            System.out.println("Ты не достиг совершеннолетия, нужно немного подождать.");
        }


        int temperature = -69;
        if (temperature <= -5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }


        int speedKchau = 95;
        if (speedKchau >= 60) {
            System.out.println("Ты скорость превысил, придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }


        int years = 52;
        if (years >= 2 && years <= 6) {
            System.out.println("Тебе нужно ходить в детский садик");
        }
        if (years >= 7 && years <= 17) {
            System.out.println("Тебе теперь нужно ходить в школу");
        }
        if (years >= 18 && years <= 24) {
            System.out.println("Тебе теперь нужно ходить в университет");
        }
        if (years > 24) {
            System.out.println("Тебе теперь нужно ходить на работу");
        }


        int year = 14;
        if (year < 5) {
            System.out.println("Ты не можешь кататься на аттракционе, ну плаке плаке чо детсадовец");
        }
        if (year > 5 && year <= 14) {
            System.out.println("Ты можешь кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (year > 14) {
            System.out.println("Ну ладно школьник ты можешь кататься в аттракционе");
        }


        int totalCapacity = 102;
        int seatedCapacity = 60;
        int availableSeats = 5;
        int availableStanding = 30;

        int occupiedPlaces = (seatedCapacity + (totalCapacity - seatedCapacity)) - (availableSeats + availableStanding);

        if (availableSeats > 0) {
            System.out.println("Есть сидячие места.");
        }
        if (availableSeats <= 0 && availableStanding > 0) {
            System.out.println("Есть стоячие места.");
        }

        if (availableSeats <= 0 && availableStanding <= 0 && occupiedPlaces == totalCapacity) {
            System.out.println("Вагон полный.");
        }


        int one = 10;
        int two = 5;
        int three = 15;
        int maxNumber;

        if (one >= two && one >= three) {
            maxNumber = one;
        } else if (two >= one && two >= three) {
            maxNumber = two;
        } else {
            maxNumber = three;
        }
        System.out.println("Наибольшее число: " + maxNumber);
    }
}

