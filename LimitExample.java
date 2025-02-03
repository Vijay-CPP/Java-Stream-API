import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Use limit to get the first 3 names from the stream
        List<String> limitedNames = names.stream()
                                         .limit(3)
                                         .collect(Collectors.toList());
        System.out.println("First 3 names: " + limitedNames);
        // Output: [Alice, Bob, Charlie]

        // Another example with numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use limit to get the first 5 numbers from the stream
        List<Integer> limitedNumbers = numbers.stream()
                                              .limit(5)
                                              .collect(Collectors.toList());
        System.out.println("First 5 numbers: " + limitedNumbers);
        // Output: [1, 2, 3, 4, 5]
    }
}
