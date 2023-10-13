import java.util.Scanner;

public class MinSwapAnagram {
    public static int minChangesToAnagram(String s) {
        // Check if the length of the string is odd; if so, it's not possible to split it into two equal-length substrings.
        if (s.length() % 2 != 0) {
            return -1;
        }
        // Split the string into two equal-length substrings.
        int mid = s.length() / 2;
        String s1 = s.substring(0, mid);
        String s2 = s.substring(mid);
        // Create an array to represent the character frequencies in each substring.
        int[] charCount = new int[26]; // Assuming lowercase English letters
        // Update the character frequencies for the first substring.
        for (char c : s1.toCharArray()) {
            charCount[c - 'a']++;
        }
        // Update the character frequencies for the second substring and track the differences.
        int changesNeeded = 0;
        for (char c : s2.toCharArray()) {
            int index = c - 'a';
            if (charCount[index] > 0) {
                charCount[index]--;
            } else {
                changesNeeded++;
            }
        }
        return changesNeeded;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        // Process each test case
        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            int result = minChangesToAnagram(s);
            System.out.println(result);
        }
        scanner.close();
    }
}
