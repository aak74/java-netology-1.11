package role;

public interface ReaderRole {
    public void takeBook(String name, AdministratorRole administrator) throws Exception;
    public void returnBook(String name, AdministratorRole administrator);

    String getBook();
}
