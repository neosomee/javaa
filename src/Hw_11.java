public class Hw_11 {
    public static void main(String[] args) {
        int[] payments = {15000, 3200, 4500, 8900, 1200};

        int total = 0;

        for (int payment : payments) {
            total += payment;
        }

        System.out.printf("Сумма трат за месяц составила %d рублей.%n", total);

        int[] payments1 = {15000, 3200, 4500, 8900, 1200};

        int min = payments1[0];
        int max = payments1[0];

        for (int payment1 : payments1) {
            if (payment1 < min) {
                min = payment1;
            }
            if (payment1 > max) {
                max = payment1;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %d рублей.%n" + "Максимальная сумма трат за неделю составила %d рублей.%n", min, max);


        int[] payments2 = {15000, 3200, 4500, 8900, 1200};
        int total1 = 0;
        for (int payment2 : payments2) {
            total1 += payment2;

        }

        double avg = (double) total / payments2.length;

        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.%n", avg);


        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}
