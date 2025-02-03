import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminationExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Alice");

        // forEach: Perform an action for each element
        System.out.println("forEach:");
        names.stream().forEach(System.out::println); // .forEach(name -> System.out.println(name))

        // collect: Collect elements into a List
        List<String> collectedNames = names.stream().collect(Collectors.toList());
        System.out.println("Collected names: " + collectedNames);

        // reduce: Combine elements to produce a single result
        Optional<String> concatenatedNames = names.stream().reduce((name1, name2) -> name1 + ", " + name2);
        concatenatedNames.ifPresent(result -> System.out.println("Concatenated names: " + result));
        // Output: Concatenated names: Alice, Bob, Charlie, David, Eve
        System.out.println("Concatenated names: " + concatenatedNames.get());

        // Reduce to find sum of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        // .reduce(Initial num, (sum, curr) -> sum + curr));
        sum.ifPresent(result -> System.out.println("Sum of numbers: " + result));


        int sum2 = numbers.stream().reduce(0, (acc, curr) -> acc + curr);
        System.out.println("Sum of numbers: " + sum2);


        // toArray: Convert stream to an array
        String[] namesArray = names.stream().toArray(String[]::new); // .toArray(name -> new String[name.length()])
        System.out.println("Names array: " + Arrays.toString(namesArray));

        // min: Find the minimum element
        Optional<String> minName = names.stream().min(Comparator.naturalOrder());
        minName.ifPresent(result -> System.out.println("Min name: " + result));

        // max: Find the maximum element
        Optional<String> maxName = names.stream().max(Comparator.naturalOrder());
        maxName.ifPresent(result -> System.out.println("Max name: " + result));

        // count: Count the number of elements
        long count = names.stream().count();
        System.out.println("Count of names: " + count);

        // anyMatch: Check if any element matches the condition
        boolean anyMatch = names.stream().anyMatch(name -> name.startsWith("A"));
        System.out.println("Any name starts with 'A': " + anyMatch);

        // allMatch: Check if all elements match the condition
        boolean allMatch = names.stream().allMatch(name -> name.length() > 2);
        System.out.println("All names have more than 2 characters: " + allMatch);

        // noneMatch: Check if no elements match the condition
        boolean noneMatch = names.stream().noneMatch(name -> name.length() < 2);
        System.out.println("No name has less than 2 characters: " + noneMatch);

        // findFirst: Find the first element
        Optional<String> firstName = names.stream().findFirst();
        firstName.ifPresent(result -> System.out.println("First name: " + result));

        // findAny: Find any element (useful with parallel streams)
        Optional<String> anyName = names.stream().findAny();
        anyName.ifPresent(result -> System.out.println("Any name: " + result));
    }
}
