package role;

public interface AdministratorRole {
    public void lendBook(String name, ReaderRole readerRole) throws Exception;
    public void pickupBook(String name, ReaderRole readerRole);
}
