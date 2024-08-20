import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String input = "({[]})";
        boolean isBalanced = isBalanced(input);
        System.out.println("Balanced: " + isBalanced);
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char last = stack.pop();
                if ((ch == ')' && last != '(') ||
                    (ch == '}' && last != '{') ||
                    (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
