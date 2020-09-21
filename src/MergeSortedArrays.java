/* Question:

        Merge Two  sorted Arrays,
        Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
        Output: arr3[] = {1, 2, 3, 4, 5, 6, 8}
*/

import java.util.*;

public final class MergeSortedArrays {

    public static void main(String[] args) {

        List<Integer> mergedLists = new ArrayList<>();

        List<Integer> listOne = new ArrayList<>(Arrays.asList(1, 3, 4, 5));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        listOne.addAll(listTwo);

        for(Integer i : listOne){
           if(!mergedLists.contains(i)){
               mergedLists.add(i);
            }
        }
        Collections.sort(mergedLists);
        System.out.println(mergedLists);
    }
}
