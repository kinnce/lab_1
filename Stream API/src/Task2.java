import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<String> filterNamesStartingWith(List<String> names, String letter) {
        String letterUpperCase = letter.toUpperCase();
        System.out.println(names.stream().filter(name -> name.startsWith(letterUpperCase)).count());
        return names.stream()
                .filter(name -> !name.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}




