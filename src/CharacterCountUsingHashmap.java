import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CharacterCountUsingHashmap {
    public static void main(String[] args) {
        String inputString = "Hello, World";

        Map<Character, Integer> charCount = countCharacters(inputString);

        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
            System.out.println(entry.getKey() + " occurs " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countCharacters(String inputString) {

        Map<Character, Integer> charCountMap = new HashMap<>();
        inputString = inputString.toLowerCase(Locale.ROOT);
        for (int i = 0; i < inputString.length(); i++){
            char charString = inputString.charAt(i);
            if(!Character.isLetter(charString)){
                continue;
            }
            if(charCountMap.containsKey(charString)){
                int count = charCountMap.get(charString);
                charCountMap.put(charString, count + 1);
            } else {
                charCountMap.put(charString, 1);
            }
        }
        return charCountMap;
    }
}
