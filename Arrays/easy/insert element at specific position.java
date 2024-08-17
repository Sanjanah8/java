import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int element = 3;
        int position = 2; // Inserting at index 2

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < position) {
                newArr[i] = arr[i];
            } else if (i == position) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[i - 1];
            }
        }

        System.out.println("Array after insertion: " + Arrays.toString(newArr));
    }
}
