public class Hw_12 {
    public static void main(String[] args) {
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName;
        fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О сотрудника - " + fullName);

        String fullName1 = "Ivanov Ivan Ivanovich";
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName1.toUpperCase());

        String fullName2= "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName2);
    }
}
