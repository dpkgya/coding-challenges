/*

Given a string with only letters, print out the duplicate characters in the string (ignore cases)


*/


import java.util.HashMap;
import java.util.Map;

public class CheckForDuplicateCharacters {


    public static void characterCount(String str){

        Map<Character, Integer> hashMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for(Character c : chars){
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)+1);
            } else {
                hashMap.put(c,1);
            }
        }

        for(Map.Entry<Character, Integer> entry : hashMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str = "Deeppak";
        characterCount(str);
    }
}
