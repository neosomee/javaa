import java.util.Arrays;

public class Hw_10 {
    public static void main(String[] args) {
        System.out.println("1 Задача");

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }

        System.out.println();



        System.out.println("2 Задача");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i < weights.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] chisla = {1.57, 7.654, 9.986};
        for (int i = 0; i < chisla.length; i++) {
            System.out.print(chisla[i]);
            if (i < chisla.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        String[] strings = {"Phasma", "CS2", "Detroit"};
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]);
            if (i < strings.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("3 Задача");
        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(chisla[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(strings[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("4 Задача");
        for (int i = 0; i <  weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] += 1;
            }
        }
        System.out.println(Arrays.toString(weight));
    }
}
