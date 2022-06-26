package role;

import library.OrderedBook;

public interface SupplierRole {
    void takeOrder(String name, LibrarianRole librarian);

    OrderedBook[] getOrderedBooks();
}
