/*

12. Reverse the string by words. Like : Hello World,  output: World, Hello
:: https://www.geeksforgeeks.org/reverse-words-in-a-given-string/

 */

public class ReverseStringWordByWord {

    public static void main(String[] args) {
        String s = "Hello World,";
        String reversedString = "";

        String[] c = s.split(" ");

        for(int i=c.length-1; i>=0; i--){
            reversedString = reversedString + c[i] + " ";
        }
        System.out.println(reversedString);
    }
}
