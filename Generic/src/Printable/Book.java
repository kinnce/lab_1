package Printable;

public class Book implements Printable{
    private final String nameBook;

    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

    @Override
    public void print() {
        System.out.println(nameBook);
    }
}
