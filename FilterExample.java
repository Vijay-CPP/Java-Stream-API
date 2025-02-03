import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Example 1: Filter names that start with 'A'
        List<String> startsWithA = names.stream()
                                        .filter(name -> name.startsWith("A"))
                                        .collect(Collectors.toList());
        System.out.println("Names starting with 'A': " + startsWithA);

        // Example 2: Filter names with length greater than 3
        List<String> lengthGreaterThan3 = names.stream()
                                               .filter(name -> name.length() > 3)
                                               .collect(Collectors.toList());
        System.out.println("Names with length greater than 3: " + lengthGreaterThan3);

        // Example 3: Filter names that contain the letter 'e'
        List<String> containsE = names.stream()
                                      .filter(name -> name.contains("e"))
                                      .collect(Collectors.toList());
        System.out.println("Names containing 'e': " + containsE);

        // Example 4: Filter names that are not equal to 'David'
        List<String> notDavid = names.stream()
                                     .filter(name -> !name.equals("David"))
                                     .collect(Collectors.toList());
        System.out.println("Names not equal to 'David': " + notDavid);

        // Example 5: Filter names that match a specific condition (length is 5 or starts with 'C')
        List<String> customCondition = names.stream()
                                            .filter(name -> name.length() == 5 || name.startsWith("C"))
                                            .collect(Collectors.toList());
        System.out.println("Names with length 5 or starting with 'C': " + customCondition);

        // Example 6: Filter then use for each
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);
    }
}
