import java.util.Stack;

public class CheckSortedStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(isSorted(stack)); // true
    }

    public static boolean isSorted(Stack<Integer> stack) {
        if (stack.isEmpty()) return true;

        int prev = stack.pop();
        boolean sorted = isSorted(stack) && (stack.isEmpty() || prev >= stack.peek());
        stack.push(prev);
        return sorted;
    }
}
