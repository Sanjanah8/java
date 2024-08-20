import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
