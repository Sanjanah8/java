import java.util.Arrays;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] sumArray = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            sumArray[i] = arr1[i] + arr2[i];
        }

        System.out.println("Sum of two arrays: " + Arrays.toString(sumArray));
    }
}
