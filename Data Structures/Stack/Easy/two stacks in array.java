public class TwoStacks {
    int[] arr;
    int size;
    int top1, top2;

    public TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    public void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        }
    }

    public void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        }
    }

    public int pop1() {
        if (top1 >= 0) return arr[top1--];
        return -1;
    }

    public int pop2() {
        if (top2 < size) return arr[top2++];
        return -1;
    }

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        System.out.println(ts.pop1()); // 11
        System.out.println(ts.pop2()); // 15
    }
}
