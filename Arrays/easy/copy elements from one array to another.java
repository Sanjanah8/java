import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = new int[originalArray.length];

        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        System.out.println("Copied array: " + Arrays.toString(copiedArray));
    }
}
