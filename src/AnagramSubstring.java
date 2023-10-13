import java.util.Arrays;

public class AnagramSubstring {

    // Function to count the number of characters to change to make two strings anagrams
    public static int anagram(String s) {
        int len = s.length();

        // If the length of the string is odd, it cannot be split into two equal-length substrings
        if (len % 2 != 0) {
            return -1;
        }

        // Split the string into two equal-length substrings
        String s1 = s.substring(0, len / 2);
        String s2 = s.substring(len / 2);

        // Convert the substrings to character arrays and sort them
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        Arrays.sort(s1Chars);
        Arrays.sort(s2Chars);

        // Compare the sorted substrings character by character to find the differences
        int changesNeeded = 0;
        for (int i = 0; i < s1Chars.length; i++) {
            if (s1Chars[i] != s2Chars[i]) {
                changesNeeded++;
            }
        }

        return changesNeeded;
    }

    public static void main(String[] args) {
        String[] testCases = {"aaabbb", "ab", "abc", "mnop", "xyyx", "xaxbbbxx"};

        for (String testCase : testCases) {
            int result = anagram(testCase);
            System.out.println(result);
        }
    }
}
