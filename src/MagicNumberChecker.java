public class MagicNumberChecker {
    public static boolean isMagicNumber(int num) {
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10; // Add the last digit to the sum
                num /= 10;      // Remove the last digit
            }
            num = sum; // Set num to the sum for the next iteration
        }
        return num == 1;
    }

    public static void main(String[] args) {
        int number = 19; // Example number to check
        boolean isMagic = isMagicNumber(number);

        if (isMagic) {
            System.out.println(number + " is a magic number.");
        } else {
            System.out.println(number + " is not a magic number.");
        }
    }
}
