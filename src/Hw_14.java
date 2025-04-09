public class Hw_14 {


    public static void main(String[] args) {

        Author pushkin = new Author("Aleksandr", "Pushkin");
        Author tolstoy = new Author("Lev", "Tolstoy");

        Book onegin = new Book("Evgeni Onegin", "Aleksandr Pushkin", 1831);
        System.out.println(pushkin.getFirstName() + " " + pushkin.getSurname() + " " + onegin.getName() + " " + onegin.getYear());

        Book warAndWorld = new Book("War and World", "Lev Tolstoy", 1863);
        System.out.println(tolstoy.getFirstName() + " " + tolstoy.getSurname() + " " + warAndWorld.getName() + " " + warAndWorld.getYear());

        onegin.setYear(1832);
        System.out.println(pushkin.getFirstName() + " " + pushkin.getSurname() + " " + onegin.getName() + " " + onegin.getYear());

    }
}
