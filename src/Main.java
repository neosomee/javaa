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

        friend = friend -7;
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
    }
}
