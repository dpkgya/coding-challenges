public class IntegerPalindrome {

    public static void main(String[] args) {
        int num = 121, reverseInteger = 0, reminder, originalInteger;
        originalInteger = num;

        while (num != 0 && num > 0) {
            reminder = num % 10;
            reverseInteger = reverseInteger * 10 + reminder; // to place reminder one step ahead.
            num = num / 10;
        }
        if (originalInteger == reverseInteger) {
            System.out.println("Given Number is Palindrome");
        } else {
            System.out.println("Given Number is Not Palindrome");
        }
    }
}
