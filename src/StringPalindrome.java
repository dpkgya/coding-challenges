import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringPalindrome {

    public static void main(String[] args) {
        String str = "Madam";
        char[] characters = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char d : characters) list.add(d);
        Collections.reverse(list);
        String reversed = "";
        for(char d : list){
            reversed+=d;
        }
        if(str.equalsIgnoreCase(reversed)){
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }

}
