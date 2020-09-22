/*

11. implement Math.pow(x,n) function - backtracking problem ::
https://www.geeksforgeeks.org/write-a-c-program-to-calculate-powxn/

*/

public class ImplementMathPowerFunction {

    public static void main(String[] args) {
        int x = 2;
        int times = 5;
        int result = 1;

        while(times>0){
            result=result * x;
            times=times-1;
        }
        System.out.println(result);
    }
}
