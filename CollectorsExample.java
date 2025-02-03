import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Alice", "Charlie");

        // Collectors.toList()
        List<String> nameList = names.stream()
                                     .collect(Collectors.toList());
        System.out.println("Collected to list: " + nameList);

        // Collectors.toSet()
        Set<String> nameSet = names.stream()
                                   .collect(Collectors.toSet());
        System.out.println("Collected to set: " + nameSet);

        // Collectors.toMap()
        Map<String, Integer> nameLengthMap = names.stream()
                                                  .collect(Collectors.toMap(
                                                      name -> name,
                                                      name -> name.length(),
                                                      (existing, replacement) -> existing)); // Handles duplicates
        System.out.println("Collected to map: " + nameLengthMap);

        // Collectors.groupingBy()
        Map<Integer, List<String>> groupedByLength = names.stream()
                                                          .collect(Collectors.groupingBy(String::length)); // .groupingBy(name -> name.length())
        System.out.println("Grouped by length: " + groupedByLength);

        // Collectors.partitioningBy()
        Map<Boolean, List<String>> partitionedByStartsWithA = names.stream()
                                                                   .collect(Collectors.partitioningBy(name -> name.startsWith("A")));
        System.out.println("Partitioned by names starting with 'A': " + partitionedByStartsWithA);

        // Collectors.joining()
        String joinedNames = names.stream()
                                  .collect(Collectors.joining(", "));
        System.out.println("Joined names: " + joinedNames);
    }
}
