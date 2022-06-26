package user;

import library.OrderedBook;
import role.LibrarianRole;
import role.SupplierRole;

public class SupplierReader extends Reader implements SupplierRole {
    private OrderedBook[] orderedBooks = new OrderedBook[10];
    private int lastBookIndex = 0;

    public SupplierReader(String name) {
        super(name);
    }

    @Override
    public void takeOrder(String name, LibrarianRole librarian) {
        orderedBooks[lastBookIndex] = new OrderedBook(name, librarian);

        lastBookIndex++;
    }

    @Override
    public OrderedBook[] getOrderedBooks() {
        return orderedBooks;
    }
}
