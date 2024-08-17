public class MinElement {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 9, 5};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum element: " + min);
    }
}
