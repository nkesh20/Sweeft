import java.util.Stack;

public class Parentheses {

    public static boolean isLeftParen(char ch) {
        return ch == '(';
    }

    public static boolean isRightParen(char ch) {
        return ch == ')';
    }

    public static boolean isProperly(String text) {
        Stack<Character> st = new Stack<Character>();

        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(isLeftParen(ch)) {
                st.push(ch);
            } else if(st.isEmpty()) {
                return false;
            } else {
                st.pop();
            }

        }

        return st.isEmpty();

    }



    public static void main(String[] args) {
        System.out.println(isProperly("()()()(())()"));
    }


}
