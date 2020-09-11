import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionElements {

    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(2,3,4));

        //Find intersection of Elements use retainAll method
        listOne.retainAll(listTwo);

        System.out.println(listOne);
    }
}
