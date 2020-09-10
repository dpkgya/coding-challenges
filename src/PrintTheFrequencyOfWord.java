/*. given a string, for example "Hello world Hello Sam", use java 8 stream return the frequency of each word.*/

import java.util.*;
import java.util.stream.Collectors;

public class PrintTheFrequencyOfWord {

    public static void main(String[] args) {
        String s = "Hello This is is is Deepak Hello ";
        List<String> list = Arrays.asList(s.split(" ")).stream().collect(Collectors.toList());
        Set<String> set = new HashSet<>(list);

        for(String str : set){
            System.out.println(str + " " + Collections.frequency(list,str));
        }
    }

}
