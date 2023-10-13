import java.util.Scanner;

public class PalindromeIndex {

    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int palindromeIndex(String s) {
        int length = s.length();

        for (int i = 0; i < length / 2; i++) {

            if (s.charAt(i) != s.charAt(length - i - 1)) {

                int leftRemoveIndex = i;
                int rightRemoveIndex = length - i - 1;

                // Try removing the character at the left index
                if (isPalindrome(s, leftRemoveIndex + 1, rightRemoveIndex)) {
                    return leftRemoveIndex;
                }
                // Try removing the character at the right index
                if (isPalindrome(s, leftRemoveIndex, rightRemoveIndex - 1)) {
                    return rightRemoveIndex;
                }
                // If neither removal results in a palindrome, return -1
                return -1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < q; i++) {
            String s = scanner.nextLine();
            int result = palindromeIndex(s);
            System.out.println(result);
        }

        scanner.close();
    }
}