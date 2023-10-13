public class FindMissingNumber {

    public static int findMissingNumber(int[] nums){
        int n = nums.length + 1;

        int totalSum = 0;
        int givenSum = 0;

        for(int i = 1; i<=n; i++){
            totalSum = totalSum + i;
        }

        for(int j=0; j<nums.length; j++){
            givenSum = givenSum + nums[j];
        }

       return totalSum - givenSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,7};
        System.out.println(findMissingNumber(nums));
    }
}
