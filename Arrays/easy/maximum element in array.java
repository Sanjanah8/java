public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 9, 5};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum element: " + max);
    }
}
