import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Use skip to skip the first 2 names in the stream
        List<String> skippedNames = names.stream()
                                         .skip(2)
                                         .collect(Collectors.toList());
        System.out.println("Names after skipping the first 2: " + skippedNames);
        // Output: [Charlie, David, Eve]

        // Another example with numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use skip to skip the first 5 numbers in the stream
        List<Integer> skippedNumbers = numbers.stream()
                                              .skip(5)
                                              .collect(Collectors.toList());
        System.out.println("Numbers after skipping the first 5: " + skippedNumbers);
        // Output: [6, 7, 8, 9, 10]
    }
}
