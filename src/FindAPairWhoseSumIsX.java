/*

1.  Find the pair of integers in an array whose sum is x.
https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/

Given an array A[] and a number x, check for pair in A[] with sum as x
Last Updated: 19-05-2020
Write a program that, given an array A[] of n numbers and another number x, determines whether or not there exist two elements in S whose sum is exactly x.
Examples:

Input: arr[] = {0, -1, 2, -3, 1}
        sum = -2
Output: -3, 1
If we calculate the sum of the output,
1 + (-3) = -2

Input: arr[] = {1, -2, 1, 0, 5}
       sum = 0
Output: -1
No valid pair exists.

 */


import java.util.HashSet;

public class FindAPairWhoseSumIsX {

    static void printpairs(int arr[], int sum){

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i<arr.length;i++){

            int temp = sum - arr[i];

            // checking for conditions
            if(hashSet.contains(temp)){
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + arr[i]
                                + ", " + temp + ")");
            }
            hashSet.add(arr[i]);
        }
    }

    // Main to test the above function
    public static void main(String[] args)
    {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int n = 16;
        printpairs(A, n);
    }

}
