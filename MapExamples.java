import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExamples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Example 1: Convert each name to uppercase
        List<String> uppercaseNames = names.stream()
                                           .map(String::toUpperCase) // .map(name -> name.toUpperCase())
                                           .collect(Collectors.toList());
        System.out.println("Uppercase names: " + uppercaseNames);

        // Example 2: Get the length of each name
        List<Integer> nameLengths = names.stream()
                                         .map(String::length) // .map(name -> name.length())
                                         .collect(Collectors.toList());
        System.out.println("Name lengths: " + nameLengths);

        // Example 3: Append a suffix to each name
        List<String> suffixedNames = names.stream()
                                          .map(name -> name + " Jr.")
                                          .collect(Collectors.toList());
        System.out.println("Suffixed names: " + suffixedNames);

        // Example 4: Replace 'a' with 'A' in each name
        List<String> replacedNames = names.stream()
                                          .map(name -> name.replace('a', 'A'))
                                          .collect(Collectors.toList());
        System.out.println("Names with 'a' replaced: " + replacedNames);

        // Example 5: Create an object representing the length and name
        List<NameLength> nameLengthObjects = names.stream()
                                                  .map(name -> new NameLength(name, name.length()))
                                                  .collect(Collectors.toList());
        nameLengthObjects.forEach(System.out::println);
    }
}

class NameLength {
    private String name;
    private int length;

    public NameLength(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "NameLength{" +
               "name='" + name + '\'' +
               ", length=" + length +
               '}';
    }
}