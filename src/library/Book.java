package library;

import role.ReaderRole;

public class Book {
    private String name;
    private ReaderRole reader;

    Book(String name) {
        this.name = name;
    }

    public void setReader(ReaderRole reader) {
        this.reader = reader;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{"
            + "name='" + name + "', "
            + "reader='" + reader + "'"
            + "}";
    }

    public ReaderRole getReader() {
        return reader;
    }
}
