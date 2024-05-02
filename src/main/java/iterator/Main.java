package iterator;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "Джордж Оруэл"));
        library.addBook(new Book("Онегин", "А. С. Пушкин"));
        library.addBook(new Book("Я такой как все", "Олег Тиньков"));

        Iterator<Book> bookIterator = library.createIterator();
        while (bookIterator.hasNext()) {
            Book book = bookIterator.next();
            System.out.println(book);
        }
    }
}
