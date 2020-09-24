/*
https://www.youtube.com/watch?v=3HYq0Cbq01Q&ab_channel=ProgrammingTutorials
17. Find the second largest number is an array. ::
https://www.geeksforgeeks.org/find-second-largest-element-array/
 */


public class FindSecondLargestNumberInAnArray {

    public static int print2largest(int arr[], int n){

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        if(n < 2){
            System.out.println("Invalid Input");
        } else {
            for (int i=0; i<n; i++){
                if(arr[i] > highest){
                    // ...shift the current highest number to second highest
                    secondHighest=highest;

                    // ...and set the new highest.
                    highest = arr[i];

                } else if(arr[i] > secondHighest && arr[i] < highest){
                    // Just replace the second highest
                    secondHighest = arr[i];
                }
            }
        }
        return secondHighest;
    }

    public static void main(String[] args)
    {
        int arr[] = {0,12,74,26,82,3,89,8,94,3};
        int n = arr.length;
        int secondHighest = print2largest(arr, n);
        System.out.println(secondHighest);
    }
}
