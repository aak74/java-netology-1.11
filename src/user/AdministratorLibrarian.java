package user;

import library.Library;
import role.LibrarianRole;
import role.SupplierRole;

public class AdministratorLibrarian extends Administrator implements LibrarianRole {
    private String name;

    public AdministratorLibrarian(String name, Library library) {
        super(library);
        this.name = name;
    }

    @Override
    public void orderBook(String name, SupplierRole supplier) {
        supplier.takeOrder(name, this);
    }

    @Override
    public String getName() {
        return name;
    }
}
