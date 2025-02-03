import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Example 1: Sort names in natural order (alphabetical)
        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        System.out.println("Names sorted in natural order: " + sortedNames);
        // Output: [Alice, Bob, Charlie, David, Eve]

        // Example 2: Sort names in reverse order
        List<String> reverseSortedNames = names.stream()
                                               .sorted((name1, name2) -> name2.compareTo(name1))
                                               .collect(Collectors.toList());
        System.out.println("Names sorted in reverse order: " + reverseSortedNames);
        // Output: [Eve, David, Charlie, Bob, Alice]

        // Another example with numbers
        List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);

        // Example 3: Sort numbers in natural order (ascending)
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println("Numbers sorted in natural order: " + sortedNumbers);
        // Output: [1, 2, 3, 4, 5]

        // Example 4: Sort numbers in reverse order (descending)
        List<Integer> reverseSortedNumbers = numbers.stream()
                                                    .sorted((num1, num2) -> num2.compareTo(num1))
                                                    .collect(Collectors.toList());
        System.out.println("Numbers sorted in reverse order: " + reverseSortedNumbers);
        // Output: [5, 4, 3, 2, 1]
    }
}
