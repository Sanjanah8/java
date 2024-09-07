class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }
}

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        try {
            int pos = search(arr, 20);
            System.out.println("Element found at position: " + pos);
        } catch (ElementNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int search(int[] arr, int target) throws ElementNotFoundException {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        throw new ElementNotFoundException("Element not found");
    }
}
