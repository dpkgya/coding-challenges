public class FibonacciSeries {

    public static void fibonacciSeries(int x, int y, int num){
        if(num == 0) {
            return;
        }
        int temp = x + y;
        System.out.print(" " + temp);
            x = y;
            y = temp;
            --num;
            fibonacciSeries( x, y, num);
    }
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int num = 10;
        System.out.print(x + " " + y);
        fibonacciSeries(x, y,10);
    }
}
