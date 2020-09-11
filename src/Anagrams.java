import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        char[] k = s.toCharArray();
        char[] l = t.toCharArray();

        Arrays.sort(k);
        Arrays.sort(l);

        if(Arrays.equals(k,l) && (k.length==l.length)){
            System.out.println("Two given strings are anagrams");
        } else {
            System.out.println("Two given strings are not anagrams");
        }
    }
}
