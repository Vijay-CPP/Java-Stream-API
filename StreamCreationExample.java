import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreationExample {
      public static void main(String[] args) {
            // From Collections: stream()
            List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
            List<String> filteredNames = names.stream()
                        .filter(name -> name.startsWith("A"))
                        .collect(Collectors.toList());
            System.out.println("Filtered names (stream): " + filteredNames);

            // From Collections: parallelStream()
            List<String> parallelFilteredNames = names.parallelStream()
                        .filter(name -> name.startsWith("C"))
                        .collect(Collectors.toList());
            System.out.println("Filtered names (parallelStream): " + parallelFilteredNames);

            // From Arrays: Arrays.stream(array)
            String[] nameArray = { "Alice", "Bob", "Charlie", "David" };
            List<String> arrayFilteredNames = Arrays.stream(nameArray)
                        .filter(name -> name.startsWith("B"))
                        .collect(Collectors.toList());
            System.out.println("Filtered names (Arrays.stream): " + arrayFilteredNames);

            // From Other Sources: Stream.of()
            Stream.of("Alice", "Bob", "Charlie", "David")
                        .filter(name -> name.length() > 3)
                        .forEach(name -> System.out.println("Filtered name (Stream.of): " + name));

            // From Other Sources: Stream.generate()
            Stream.generate(() -> "generated")
                        .limit(3) // Limit the stream to 3 elements
                        .forEach(item -> System.out.println("Generated item (Stream.generate): " + item));

            // From Other Sources: Stream.iterate()
            Stream.iterate(0, n -> n + 1)
                        .limit(5) // Limit the stream to 5 elements
                        .forEach(number -> System.out.println("Iterated number (Stream.iterate): " + number));
      }
}
