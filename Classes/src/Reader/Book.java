package Reader;
public class Book {
    private final String bookName;
    private final String afterName;
    public Book(){
        bookName = "";
        afterName = "";
    }
    public Book(String bookName, String afterName){
        this.bookName = bookName;
        this.afterName = afterName;
    }

    @Override
    public String toString() {
        return afterName + " '" + bookName + "' ";
    }
}
