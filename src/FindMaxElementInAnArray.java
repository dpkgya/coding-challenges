public class FindMaxElementInAnArray {


    public static int printLargest(int arr[], int n){

        int maxNumber = Integer.MIN_VALUE;

        for(int i =0; i<=n-1; i++){

            if(arr[i]>maxNumber){
                maxNumber = arr[i];
            } else {
                arr[i] = maxNumber;
            }
        }
        return maxNumber;
    }

    public static void main(String[] args)
    {
        int arr[] = {0,12,74,26,82,3,89,8,94,3};
        int n = arr.length;
        int highestNumber = printLargest(arr, n);
        System.out.println(highestNumber);
    }

}
