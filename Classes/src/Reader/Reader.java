package Reader;

public class Reader {
    private String FIO;
    private long numberTicket;
    private String faculty;
    private String bithday;
    private String Phone;

    public Reader(){};
    public Reader(String FIO, long numberTicket, String faculty, String bithday, String phone) {
        this.FIO = FIO;
        this.numberTicket = numberTicket;
        this.faculty = faculty;
        this.bithday = bithday;
        Phone = phone;
    }

    public void takeBook(long numbBooks){
        System.out.println(FIO + " взял " + numbBooks);
    }
    public void takeBook(String... books){
        System.out.print(FIO + " взял книги: ");
        for(String book : books) {
            System.out.print(" '" + book + "' " + "; ");
        }
        System.out.println();
    }
    public void takeBook(Book... books){
        System.out.print(FIO + " взял книги: ");
        for(Book book : books) {
            System.out.print(book + "; ");
        }
        System.out.println();
    }
    public void returnBook(long numbBooks){
        System.out.println(FIO + " вернул " + numbBooks);
    }
    public void returnBook(String... books){
        System.out.print(FIO + " вернул книги: ");
        for(String book : books){
            System.out.print(book + "; ");
        }
        System.out.println();
    }
    public void returnBook(Book... books){
        System.out.print(FIO + " вернул книги: ");
        for(Book book : books){
            System.out.print(book + "; ");
        }
        System.out.println();
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public long getNumbeTicket() {
        return numberTicket;
    }

    public void setNumberTicket(long numberReaderTicket) {
        this.numberTicket = numberReaderTicket;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBithday() {
        return bithday;
    }

    public void setBithday(String bithday) {
        this.bithday = bithday;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}