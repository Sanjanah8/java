import java.util.Arrays;

public class FillArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.fill(arr, 7);
        System.out.println("Array filled with value 7: " + Arrays.toString(arr));
    }
}
