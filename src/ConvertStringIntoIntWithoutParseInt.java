public class ConvertStringIntoIntWithoutParseInt {

    public static int myStringToInteger(String str) {

        int answer = 0, factor = 1;

        for (int i = str.length()-1; i >= 0; i--) {
            int j = str.charAt(i) - '0';
            answer = answer +  j * factor;
            factor = factor * 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(myStringToInteger("1234"));
    }
}