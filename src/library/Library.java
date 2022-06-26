package library;

import role.ReaderRole;

import java.util.Objects;

public class Library {
    private final Book[] books;
    private int lastBookIndex = 0;

    public Library() {
        books = new Book[10];
    }

    public void addBook(String name) {
        books[lastBookIndex] = new Book(name);
        lastBookIndex++;
    }

    public Book[] getBooks() {
        return books;
    }

    public Book getBook(String name) {
        for (Book book : books) {
            if (null == book) {
                return null;
            }

            if (Objects.equals(name, book.getName())) {
                return book;
            }
        }

        return null;
    }

    public void lendBook(String name, ReaderRole reader) throws Exception {
        Book book = getBook(name);
        if (null == book) {
            throw new Exception("Книга не найдена");
        }
        if (null != book.getReader()) {
            throw new Exception("Книга на руках");
        }
        book.setReader(reader);
    }
}
