public class SumOfTwoStrings {

    public static void main(String[] args) {
        String num1 = "129";
        String num2 = "234";

        int carry = 0;

        StringBuilder sb = new StringBuilder();;

        for(int i = num1.length()-1, j=num2.length()-1; i>=0 || j>=0; i--, j--){
            // string.charAt(i) - '0' converts string to integer
            int digit1 = (i < 0 ? 0 : num1.charAt(i) - '0');
            int digit2 = (j < 0 ? 0 : num2.charAt(j) - '0');
            carry = carry + digit1 + digit2;
            sb.append(carry % 10);
            carry = carry / 10; // takes 1 if sum of two numbers is greater than or equal to 10
        }
        if (carry == 1) {
            sb.append(carry); // appends carry is carry is equal to 1
        }
            System.out.println(sb.reverse().toString());
        }
}
