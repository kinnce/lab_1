package Printable;

public class Magazine implements Printable{
    private final String nameMagazine;

    public Magazine(String nameMagazine) {
        this.nameMagazine = nameMagazine;
    }

    @Override
    public void print() {
        System.out.println(nameMagazine);
    }
}
