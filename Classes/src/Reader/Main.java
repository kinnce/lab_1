package Reader;

public class Main {
    public static void main(String[] args){
        Reader[] readers = {new Reader("Киреева И.А.", 3452, "ФМиИТ", "16.05.2004", "89602935671"),
                new Reader("Муствйкин М.С.", 2243, "ФМиИТ", "29.09.2004", "89602939291"),
                new Reader("Орехова В.Н.", 2261, "ФМиИТ", "6.02.2005", "89602939291"),
                new Reader("Митрюхин И.В.", 3562, "ФМиИТ", "31.08.2004", "89602939291")};
        Book[] books = {new Book("451° по Фаренгейту", "Рэй Брэдбери"),
                new Book("Предметно-ориентировнное проектирование", "Эрик Эванс"),
                new Book("Кладбище домашних животных", "Стивен Кинг")};
        for(Reader reader: readers){
            reader.takeBook(books);
        }
        System.out.println();
        for(Reader reader: readers){
            reader.returnBook(books);
        }
    }
}
