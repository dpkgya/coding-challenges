import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFilter {

    public static void main(String[] args) {
        List<String> myString = new ArrayList<>(Arrays.asList("spring", "node", "mkyong"));
        myString.stream().filter(x -> !x.equalsIgnoreCase("mkyong")).forEach(System.out::println);
    }
}
