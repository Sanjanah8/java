public class ContainsElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int searchElement = 3;
        boolean contains = false;

        for (int num : arr) {
            if (num == searchElement) {
                contains = true;
                break;
            }
        }
        System.out.println("Array contains " + searchElement + ": " + contains);
    }
}
