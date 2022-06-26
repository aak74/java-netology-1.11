package user;

import library.Library;
import role.AdministratorRole;
import role.ReaderRole;

public class Administrator implements AdministratorRole {
    private Library library;

    public Administrator(Library library) {
        this.library = library;
    }

    @Override
    public void lendBook(String name, ReaderRole reader) throws Exception {
        library.lendBook(name, reader);
    }

    @Override
    public void pickupBook(String name, ReaderRole readerRole) {

    }

    public void overdueNotification(Reader reader) {

    }
}
