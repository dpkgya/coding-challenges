import java.util.*;

public class FindSumInAnArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(7,2,-2,3,-3,4));
        Set<Integer> integerSet = new HashSet<>();
        for(int i=0; i<list.size();i++){
            for(int j=1; j<list.size();j++){
                if(list.get(i)+list.get(j)==0){
                    integerSet.add(list.get(j));
                }
            }
        }
        System.out.println(integerSet);
    }
}
