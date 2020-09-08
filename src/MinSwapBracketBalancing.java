public class MinSwapBracketBalancing {

    static long swapCount(String s)
    {
       char[] c = s.toCharArray();

       int countLeft=0, countRight=0, imbalance=0;
       int swap=0;

       for(int i=0; i<s.length(); i++){

           if(c[i]=='['){
               countLeft++;

               if(imbalance>0){
                   swap = swap+imbalance;
                   imbalance--;
               }

           } else if(c[i]==']'){
               countRight++;
               imbalance=(countRight-countLeft);
           }
       }
        return swap;
    }

    public static void main(String[] args) {

        String s = "[]";
        System.out.println(swapCount(s));

        s = "[]][][";
        System.out.println(swapCount(s));

        s = "[[][]]";
        System.out.println(swapCount(s));

        s = "[]]][[";
        System.out.println(swapCount(s));
    }
}
