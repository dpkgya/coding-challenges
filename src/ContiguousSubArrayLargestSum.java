/*
Largest Sum Contiguous Subarray
https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

https://www.youtube.com/watch?v=OexQs_cYgAQ&ab_channel=GeeksforGeeks

Kadane's Algorithm

 */

public class ContiguousSubArrayLargestSum {

    public static void main(String[] args) {

        int[] a = {1, -3, 2, 1, -1};
        int size = a.length;

        int maxEndingHere=0, maxSoFar=0;

        for(int i=0; i<size; i++) {
            maxEndingHere = maxEndingHere + a[i];

            if(maxEndingHere<0){
                maxEndingHere = 0;
            }
            if(maxSoFar<maxEndingHere){
                maxSoFar = maxEndingHere;
            }
        }
        System.out.println(maxSoFar);
    }
}
