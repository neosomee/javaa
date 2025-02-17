public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        var friend = 19;
        System.out.println(friend);

        friend = friend * 2;
        System.out.println(friend);

        friend = friend - 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        var Fighter1 = 78.2;
        var Fighter2 = 82.7;
        var FighterWeight = Fighter1 + Fighter2;
        System.out.println("Масса бойцов" + FighterWeight);

        var WeightDifference = Fighter2 - Fighter1;
        System.out.println("Разность масс бойцов" + WeightDifference);

        var FighterRemainder = Fighter2 % Fighter1;
        System.out.println("Остаток между двумя весами" + FighterRemainder);


        var totalHours = 640;
        var hoursPerEmployee = 8;
        var numberOfEmployees = totalHours / hoursPerEmployee;
        System.out.println("Всего работников в компании — " + numberOfEmployees + " человек.");

        var newNumberOfEmployees = numberOfEmployees + 94;
        var newTotalHours = newNumberOfEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + newNumberOfEmployees + " человек, то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками.");

        int myInt = 42;
        byte myByte = 111;
        short myShort = 32572;
        long myLong = 922445203685215807L;
        float myFloat = 3.14f;
        double myDouble = 2.718281828459045;

        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);


        float wFloat = 27.12f;
        long wLong = 987678965549L;
        float wwFloat = 2.786f;
        short wShort = 569;
        int wInt = -159;
        short wwShort = 27897;
        byte wByte = 67;


        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int myPaper = 480;

        int result = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int lotSchoolboys = myPaper / result;
        System.out.println("На каждого ученика рассчитано" + lotSchoolboys + "листов бумаги");


        byte bottle = 16;
        int bottlesPerMinute = bottle / 2;

        int productionMin20 = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + productionMin20 + " штук бутылок.");

        int productionDay = bottlesPerMinute * 1440;
        System.out.println("За сутки машина произвела " + productionDay + " штук бутылок.");

        int productionDays3 = productionDay * 3;
        System.out.println("За 3 дня машина произвела " + productionDays3 + " штук бутылок.");

        int productionInAMonth = productionDay * 30;
        System.out.println("За 1 месяц машина произвела " + productionInAMonth + " штук бутылок.");


        byte totalColour = 120;
        byte whiteColour = 2;
        byte brownColour = 4;

        int twoColour = brownColour + whiteColour;
        int resultClass = totalColour / twoColour;

        int totalBrownColour = brownColour * resultClass;
        int totalWhiteColour = whiteColour * resultClass;

        System.out.println("В школе, где " + resultClass + " классов, нужно " + totalWhiteColour + " банок белой краски и " + totalBrownColour + " банок коричневой краски»");


        byte bananaGram = 80;
        byte milk = 105;
        byte iceCreamGram = 100;
        byte eggGram = 70;

        int totalGramBanana = bananaGram * 5;
        int totalGramMilk = milk * 2;
        int totalGramIceCream = iceCreamGram * 2;
        int totalGramEgg = eggGram * 4;

        int TotalBreakfastGram = totalGramBanana + totalGramMilk + totalGramIceCream + totalGramEgg;
        double TotalBreakfastKg = TotalBreakfastGram / 1000.0;
        System.out.println("Итого кг за завтрак " + TotalBreakfastKg);


        short weight7 = 7000;
        short gramDay = 250;
        short gramDay2 = 500;

        int totalDay1 = weight7 / gramDay;
        int totalDay2 = weight7 / gramDay2;

        int totalGramsDays = totalDay1 + totalDay2;
        int totalDays = totalGramsDays / 2;

        System.out.println("В среднем дней на похудение " + totalDays);


        double salaryMasha = 67760.0;
        int salaryDenchik = 83690;
        int salaryKristina = 76230;

        double increaseRate = 0.10;

        double salaryIncreaseMasha = salaryMasha * increaseRate;
        double newSalaryMasha = salaryMasha + salaryIncreaseMasha;
        double differenceMasha = newSalaryMasha - salaryMasha;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");

        double salaryIncreaseDenchik = salaryDenchik * increaseRate;
        double newSalaryDenchik = salaryDenchik + salaryIncreaseDenchik;
        double differenceDenchik = newSalaryDenchik - salaryDenchik;

        System.out.println("Денчик теперь получает " + newSalaryDenchik + " рублей. Годовой доход вырос на " + differenceDenchik + " рублей.");

        double salaryIncreaseKristina = salaryKristina * increaseRate;
        double newSalaryKristina = salaryKristina + salaryIncreaseKristina;
        double differenceKristina = newSalaryKristina - salaryKristina;

        System.out.println("Денчик теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей.");



    }
}