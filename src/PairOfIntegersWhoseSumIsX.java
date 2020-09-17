/*
Find the pair of integers in an array whose sum is x. https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
 */

import java.util.ArrayList;
import java.util.List;

public class PairOfIntegersWhoseSumIsX {

    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int sum = 16;

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length-1;i++){
            int summation = arr[i] + arr[i+1];
           if(summation==sum){
               list.add(arr[i]);
               list.add(arr[i+1]);
           }
        }
        System.out.println(list);
    }
}
