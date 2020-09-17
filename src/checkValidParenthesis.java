import java.util.Stack;

public class checkValidParenthesis {
    public static void main(String[] args) {
        //String s = "(())";
        String s = "({[(}";

        Stack<Character> stack = new Stack<>();

        for(int i=0; i< s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ){
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()){
                    System.out.println("NO");;
                } else {
                    char pop_value = stack.pop();
                    if(s.charAt(i) == ')' && pop_value != '(') {
                        System.out.println("NO");;
                    } else if(s.charAt(i) == '}' && pop_value != '{'){
                        System.out.println("NO");;
                    } else if(s.charAt(i) == ']' && pop_value != '['){
                        System.out.println("NO");;
                    }
                }
            }
        }
            if(stack.empty() == true){
                System.out.println("YES");

            }  else {
                System.out.println("NO");
            }
    }
}
