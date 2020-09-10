public class RearrangePositiveAndNegativeNumbers {

    static void printArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    // Function to Rearrange positive and negative
    // numbers in a array
    static void RearrangePosNeg(int arr[], int n){

        int key, j;
        for (int i = 0; i < n; i++) {
            key = arr[i];

            // if current element is positive
            // do nothing
            if (key > 0)
                continue;

            /* if current element is negative,
            shift positive elements of arr[0..i-1],
            to one position to their right */
            j = i - 1;
            while (j >= 0 && arr[j] > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Put negative element at its right position
            arr[j + 1] = key;
        }
    }

       /* int temp;
       boolean finished = false;

       do{
          finished = true;
          for(int i=0; i<n-1;i++){
              if(arr[i]>arr[i+1]){
                  finished = false;
                  temp = arr[i];
                  arr[i]=arr[i+1];
                  arr[i+1]=temp;
              }
          }
       } while(!finished); */


    public static void main(String[] args) {
        int arr[] = {12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n = arr.length;
        RearrangePosNeg(arr, n);
        printArray(arr, n);
    }

}
