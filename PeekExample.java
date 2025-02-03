import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Use peek to log each name as it is processed in the stream
        List<String> processedNames = names.stream()
                                           .peek(name -> System.out.println("Processing name: " + name))
                                           .filter(name -> name.length() > 3)
                                           .peek(name -> System.out.println("Name after filter: " + name))
                                           .map(String::toUpperCase) // .map(name -> name.toUpperCase())
                                           .peek(name -> System.out.println("Name after map: " + name))
                                           .collect(Collectors.toList());

        System.out.println("Processed names: " + processedNames);
        // Output: 
        // Processing name: Alice
        // Name after filter: Alice
        // Name after map: ALICE
        // Processing name: Bob
        // Processing name: Charlie
        // Name after filter: Charlie
        // Name after map: CHARLIE
        // Processing name: David
        // Name after filter: David
        // Name after map: DAVID
        // Processing name: Eve
        // Name after filter: Eve
        // Name after map: EVE
        // Processed names: [ALICE, CHARLIE, DAVID, EVE]
    }
}
