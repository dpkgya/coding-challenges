import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringReverse {
    public static void main(String[] args) {
        String s = "Deepak";
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char c : chars) {
            list.add(c);
        }
        Collections.reverse(list);
        String reversed = "";

        for(Character rs : list){
            reversed = reversed + rs;
        }
        System.out.println(reversed);
    }
}
