public class PrintEvenOddIndexes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.print("Elements at even indexes: ");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nElements at odd indexes: ");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
