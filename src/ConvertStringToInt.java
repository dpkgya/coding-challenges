public class ConvertStringToInt {
    public static void main(String[] args) {
        String s = "12345";
        int integer = Integer.parseInt(s); // Integer.parseInt is used to convert from string to integer.
        System.out.println(integer);


        int i = 10;
        String string = String.valueOf(i); // String.valueOf is used to convert from integer to String
        System.out.println(string);
    }
}
