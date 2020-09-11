import java.util.*;

public class RemoveDuplicatesInList {

    public static void main(String[] args) {
        List<Integer> integersList = new ArrayList<>(Arrays.asList(1,2,2,3,4,5));
        List<Integer> removeDuplicates = new ArrayList<>();

        for (Integer i : integersList){
            if(!removeDuplicates.contains(i)){
                removeDuplicates.add(i);
            }
        }
        System.out.println(removeDuplicates);

        /*
        // Using Set
        Set<Integer> integerSet = new HashSet<>(integersList);
        for(int j : integerSet){
            System.out.println(j);
        }
         */
    }
}
