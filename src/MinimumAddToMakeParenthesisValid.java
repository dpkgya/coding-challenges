import java.util.Stack;

public class MinimumAddToMakeParenthesisValid {

    public static int minAddToMakeValid(String s) {
        char[] c = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char parenthesis = c[i];

            if (parenthesis == '(') {
                stack.push(c[i]);
            } else {
                if (stack.empty()) {
                    count++;
                    continue;
                } else if (parenthesis == ')' && stack.peek() == ')') {
                    count++;
                }
                stack.pop();
            }
        }
        count += stack.size();
        return count;
    }
    public static void main(String[] args) {
        String s = "))((";
        System.out.println(minAddToMakeValid(s));
    }
}
