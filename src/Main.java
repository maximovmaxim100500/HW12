public class Main {
    public static void task() {
        Author author1 = new Author("Имя1", "Фамилия1");
        Book book1 = new Book("Книга 1", author1, 2023);
        Author author2 = new Author("Имя2", "Фамилия2");
        Book book2 = new Book("Книга 2", author2, 2020);
        /*System.out.println(book1.getBookTitle() + " " + author1.getName() + " " + author1.getSurname() +
        " " + book1.getYearPublication());
        System.out.println(book2.getBookTitle() + " " + author2.getName() + " " + author2.getSurname() +
                " " + book2.getYearPublication()); */
        book1.setYearPublication(2022);
//       System.out.println("book1.getYearPublication() = " + book1.getYearPublication());
    }

    public static void main(String[] args) {
        task();

    }
}