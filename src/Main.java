import library.Library;
import user.AdministratorLibrarian;
import user.Reader;
import user.SupplierReader;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        library.addBook("Страна багровых туч");
        library.addBook("Трудно быть богом");

        SupplierReader ivan = new SupplierReader("Иван");
        Reader petr = new Reader("Петр");
        AdministratorLibrarian elena = new AdministratorLibrarian("Елена", library);

        petr.takeBook("Трудно быть богом", elena);
        elena.orderBook("Понедельник начинается в субботу", ivan);

        System.out.println("Читатели:");
        System.out.println("Петр читает: " + petr.getBook());
        System.out.println("Иван читает: " + ivan.getBook());
        System.out.println();
        System.out.println("Заказы:");
        System.out.println("Иван получил заказ: " + Arrays.toString(ivan.getOrderedBooks()));
        System.out.println();
        System.out.println("Книги в библиотеке:");
        System.out.println(Arrays.toString(library.getBooks()));
    }
}