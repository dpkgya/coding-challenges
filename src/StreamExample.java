import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // Using Streams to perform operations on the list

        // 1. Filtering: Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // 2. Mapping: Square each number
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squared numbers: " + squaredNumbers);

        // 3. Reduction: Calculate the sum of all numbers
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of all numbers: " + sum);

        // 4. Find the maximum number
        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("Maximum number: " + max);

        // 5. Count the elements
        long count = numbers.stream()
                .count();
        System.out.println("Total number of elements: " + count);

    }
}
