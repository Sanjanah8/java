import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String postfix = "231*+9-";
        int result = evaluatePostfix(postfix);
        System.out.println("Result: " + result);
    }

    public static int evaluatePostfix(String expr) {
        Stack<Integer> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (ch) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
