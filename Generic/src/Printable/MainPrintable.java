package Printable;

import Printable.Printable;

public class MainPrintable {
    public static void main(String[] args) {
        Book book1 = new Book("Book1");
        Book book2= new Book("Book2");
        Book book3 = new Book("Book3");
        Magazine magazine1 = new Magazine("Magazine1");
        Magazine magazine2 = new Magazine("Magazine2");
        Magazine magazine3 = new Magazine("Magazine3");
        Printable newSpaper = new Printable() {
            @Override
            public void print() {
                System.out.println("new Spaper");
            }
        };
        Printable[] mas = {book1,book2,book3,magazine1,magazine2,magazine3, newSpaper};

        for(Printable i : mas){
            i.print();
        }

    }
}
