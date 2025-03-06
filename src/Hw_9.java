public class Hw_9 {
    public static void main(String[] args) {
        int deposit = 15000;
        int months = 0;
        while (deposit < 2_460_000) {
            deposit += 15000;
            months++;
            if (deposit <= 2_460_000) {
                System.out.println("Месяц " + months + ": Сумма накоплений равна " + deposit + " рублей.");

            }
        }

        System.out.println();

        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        int ii = 10;
        while (ii >= 0) {
            System.out.print(ii + " ");
            ii--;
        }

        System.out.println();

        int country = 12_000_000;
        double countryRate = 17.0 / 1000;
        double countryDeath = 8.0 / 1000;
        int yearNow = 10;
        double currentPopulation = country;
        for (int year = 0; year <= yearNow; year++) {
            double populationChange = (countryRate - countryDeath) * currentPopulation;

            currentPopulation += populationChange;
            System.out.println("Год " + year + " численность населения составляет " + currentPopulation);

        }

        System.out.println();


        double depositVklad = 15000;
        int monthsVklad = 0;
        double monthlyInterestRate = 0.17 / 12;

        while (depositVklad <= 12_000_000) {
            depositVklad += 15000;
            depositVklad += depositVklad * monthlyInterestRate;
            monthsVklad++;
            if (monthsVklad % 6 == 0) {
                System.out.println("Месяц " + monthsVklad + ": Сумма накоплений равна " + depositVklad + " рублей.");
            }
        }

        System.out.println();

        double depositVklad2 = 15000;
        int monthsVklad2 = 0;
        double monthlyInterestRate2 = 0.17 / 12;

        while (monthsVklad2 <= 108) {
            depositVklad2 += 15000;
            depositVklad2 += depositVklad2 * monthlyInterestRate2;
            monthsVklad2++;

            if (monthsVklad2 % 6 == 0) {
                System.out.println("Месяц " + monthsVklad2 + ": Сумма накоплений равна " + depositVklad2 + " рублей.");
            }
        }

        System.out.println();

        int firstDayOfWeek = 0;

        for (int day = 1; day <= 31; day++) {
            if ((day + firstDayOfWeek - 1) % 7 == 4) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }

        System.out.println();

        int yearBefore = 2024 - 200;
        int yearAfter = 2024 + 100;
        int year;
        for (year = yearBefore; year < yearAfter; year ++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }



    }
}
