import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindUnionOfElements {

    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(2,3,4,7));
        List<Integer> removingDuplicates = new ArrayList<>();

        //Find intersection of Elements use retainAll method

        listOne.addAll(listTwo);

        // Remove Duplicates from ListOne

        for(Integer i : listOne){
            if(!removingDuplicates.contains(i)){
                removingDuplicates.add(i);
            }
        }
        System.out.println(removingDuplicates);
    }
}
