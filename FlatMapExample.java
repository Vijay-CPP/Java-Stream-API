import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        // Example 1: Flattening a List of Lists of Strings
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("Alice", "Bob"),
            Arrays.asList("Charlie", "David"),
            Arrays.asList("Eve", "Frank")
        );
        List<String> allNames = listOfLists.stream()
                                           .flatMap(List::stream) // .flatMap(list -> list.stream())
                                           .collect(Collectors.toList());
        System.out.println("Flattened list: " + allNames);

        // Example 2: Splitting Strings into Words
        List<String> sentences = Arrays.asList(
            "The quick brown fox",
            "jumps over the lazy dog",
            "Java Streams are awesome"
        );
        List<String> words = sentences.stream()
                                      .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                                      .collect(Collectors.toList());
        System.out.println("Flattened words: " + words);

        // Example 3: Flattening a List of Arrays
        List<String[]> listOfArrays = Arrays.asList(
            new String[] {"Alice", "Bob"},
            new String[] {"Charlie", "David"},
            new String[] {"Eve", "Frank"}
        );
        List<String> allNamesFromArray = listOfArrays.stream()
                                                     .flatMap(Arrays::stream) // .flatMap(array -> Arrays.stream(array))
                                                     .collect(Collectors.toList());
        System.out.println("Flattened list from arrays: " + allNamesFromArray);

        // Example 4: Mapping and Flattening Nested Collections
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", Arrays.asList("Project1", "Project2")),
            new Employee("Bob", Arrays.asList("Project3", "Project4")),
            new Employee("Charlie", Arrays.asList("Project5"))
        );
        List<String> allProjects = employees.stream()
                                            .flatMap(employee -> employee.getProjects().stream())
                                            .collect(Collectors.toList());
        System.out.println("Flattened list of projects: " + allProjects);

        // Example 5: Generating and Flattening Streams
        List<Integer> numbers = Stream.of(1, 2, 3)
                                      .flatMap(num -> Stream.of(num * 10, num * 100))
                                      .collect(Collectors.toList());
        System.out.println("Flattened list of generated numbers: " + numbers);
    }
}

class Employee {
    @SuppressWarnings("unused")
    private String name;
    private List<String> projects;

    public Employee(String name, List<String> projects) {
        this.name = name;
        this.projects = projects;
    }

    public List<String> getProjects() {
        return projects;
    }
}
