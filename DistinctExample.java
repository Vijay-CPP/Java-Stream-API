import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice", "David", "Bob", "Eve");

        // Use distinct to remove duplicate names
        List<String> distinctNames = names.stream()
                                          .distinct()
                                          .collect(Collectors.toList());

        System.out.println("Distinct names: " + distinctNames);
        // Output: [Alice, Bob, Charlie, David, Eve]

        // Another example with numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);

        // Use distinct to remove duplicate numbers
        List<Integer> distinctNumbers = numbers.stream()
                                               .distinct()
                                               .collect(Collectors.toList());

        System.out.println("Distinct numbers: " + distinctNumbers);
        // Output: [1, 2, 3, 4, 5]
    }
}
