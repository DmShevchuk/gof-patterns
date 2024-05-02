package iterator;

import java.util.List;

public class LibraryIterator implements Iterator<Book> {
    private final List<Book> books;
    private int position = 0;

    public LibraryIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new RuntimeException("No more elements");
        }
        return books.get(position++);
    }
}