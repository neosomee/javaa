public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Aleksander", "Pushkin");
        Author author2 = new Author("Lev", "Tolstoy");

        Book book1 = new Book("Eugeniy Onegin", author1, 1823);
        Book book2 = new Book("War and World", author2, 1863);

        System.out.println("Книга: " + book1.getTitle() + ", Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Год: " + book1.getPublicationYear());
        System.out.println("Книга: " + book2.getTitle() + ", Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Год: " + book2.getPublicationYear());

        book1.setPublicationYear(1831);
        System.out.println("Конец написания книги:");
        System.out.println("Книга: " + book1.getTitle() + ", Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Год: " + book1.getPublicationYear());
    }
}
