public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 7};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        System.out.println("Second smallest element: " + secondSmallest);
    }
}
