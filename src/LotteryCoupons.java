public class LotteryCoupons {
    public static int countMaxWinners(int n) {
        int maxCount = 0;  // Initialize the maximum count of winners
        int[] countArray = new int[9 * n + 1];  // An array to store the count of winners for each "s"

        // Iterate through possible values of "s" from 1 to 9 * n (maximum possible sum of digits)
        for (int s = 1; s <= 9 * n; s++) {
            int winners = 0;

            // Count the number of winners for the current "s"
            for (int i = 1; i <= n; i++) {
                int sumOfDigits = 0;
                int num = i;

                // Calculate the sum of digits in the coupon number
                while (num > 0) {
                    sumOfDigits += num % 10;
                    num /= 10;
                }

                if (sumOfDigits == s) {
                    winners++;
                }
            }

            // Update the count of winners in the array
            countArray[s] = winners;

            // Update the maximum count if necessary
            maxCount = Math.max(maxCount, winners);
        }

        // Count how many different "s" values achieve the maximum count
        int maxCountValues = 0;
        for (int i = 1; i < countArray.length; i++) {
            if (countArray[i] == maxCount) {
                maxCountValues++;
            }
        }

        return maxCountValues;
    }

    public static void main(String[] args) {
        System.out.println(countMaxWinners(3));  // Output: 3
        System.out.println(countMaxWinners(11));  // Output: 2
        System.out.println(countMaxWinners(22));  // Output: 3
    }
}
