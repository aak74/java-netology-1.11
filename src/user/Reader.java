package user;

import role.AdministratorRole;
import role.ReaderRole;

public class Reader implements ReaderRole {

    private final String name;
    private String bookName;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void takeBook(String name, AdministratorRole administrator) throws Exception {
        administrator.lendBook(name, this);
        bookName = name;
    }

    @Override
    public void returnBook(String name, AdministratorRole administrator) {
        administrator.pickupBook(name, this);
        bookName = "";
    }

    @Override
    public String getBook() {
        return bookName;
    }

    @Override
    public String toString() {
        return name;
    }
}
