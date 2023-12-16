import java.util.List;

public class Main {
    public static void main(String[] args) {
        printTask1();
        printTask2();
    }

    public static void printTask1() {
        Task1.generateAndCountEvenNumbers();
        System.out.println();
        String[] names = {"Johnson", "Smith", "Jackson", "Johnsonson","Adam", "Noah", "William"};
        System.out.println(Task1.filterNamesStartingWithJ(names));
        System.out.println(Task1.sortNamesLexicographically(names));
    }

    public static void printTask2() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        System.out.println(Task2.filterEvenNumbers(numbers));
        List<String> names = List.of("Egor", "Ivan", "Max", "Petr", "Patric", "");
        System.out.println(Task2.filterNamesStartingWith(names, "P"));
    }
}

