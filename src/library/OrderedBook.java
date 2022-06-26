package library;

import role.LibrarianRole;

public class OrderedBook {
    private String name;
    private LibrarianRole librarian;

    public OrderedBook(String name, LibrarianRole librarian) {
        this.name = name;
        this.librarian = librarian;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{"
            + "name='" + name + "', "
            + "librarian='" + librarian.getName() + "'"
            + "}";
    }

    public LibrarianRole getLibrarian() {
        return librarian;
    }
}
