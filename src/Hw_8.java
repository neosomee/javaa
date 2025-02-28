public class Hw_8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 14; i++) {
            int num = 7 * i;
            System.out.println(num);
        }

        for (int i = 1; i <= 2; i++) {
            int num = i * 2;
            System.out.println(num);
        }

        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

        for (int i = 1; i <= 10; i++) {
            int result = 2 * i;
            System.out.println("2 * " + i + " = " + result);
        }
    }
}


