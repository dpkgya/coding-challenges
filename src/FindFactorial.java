public class FindFactorial {

    public static void main(String[] args) {
        int num = 4;
        long factorialResult = 1l;
        for(int i = 1; i <= num; ++i)
        {
            factorialResult = factorialResult * i;
        }
        System.out.println("Factorial: "+factorialResult);
    }
}
