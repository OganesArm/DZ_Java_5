package DZ_java.Java_DZ_5;

public class task1 {
    public static void main(String[] args) {
        Book book = new Book();
        book.showAll(); // Телефонный справочник пуст.
        book.add("Василий", 9324425);
        book.add("Василий", 9324426);
        book.add("Николай", 9955332);
        book.showAll();
        //book.showByName("Игорь"); // По "Игорь" не найдено ни одной записи.
        book.showByName("Василий");

    }
}
