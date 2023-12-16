import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static List<String> filterNamesStartingWithJ(String[] names) {
        return Arrays.stream(names)
                .filter(name -> name.charAt(0) == 'J')
                .collect(Collectors.toList());
    }

    public static void generateAndCountEvenNumbers() {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        int n = rand.nextInt(50);
        int i = 0;
        while (i < n) {
            numbers.add(rand.nextInt(20));
            i++;
        }
        System.out.println(numbers);
        Stream<Integer> stream = numbers.stream();
        long count = stream.filter(number -> number % 2 == 0).count();
        System.out.println(count);
    }

    public static List<String> sortNamesLexicographically(String[] names) {
        return Arrays.stream(names)
                .sorted()
                .collect(Collectors.toList());
    }
}


