public class NumberPalindrome {

    public static void main(String[] args) {

        int num = 121, reverseNumber = 0, reminder;
        int originalNumber = num;

        while(num>0 & num!=0){
            reminder = num % 10;
            reverseNumber = reverseNumber * 10 + reminder;
            num = num / 10;
        }

        if(originalNumber == reverseNumber ) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }

    }
}
