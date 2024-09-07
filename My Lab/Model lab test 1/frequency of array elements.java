//Step 1: Define the Interface
//Create an interface ArrayOperations with methods for calculating frequency and removing duplicates:

import java.util.Map;
public interface ArrayOperations {
    Map<Integer, Integer> calculateFrequency(int[] array);
    int[] removeDuplicates(int[] array);
}

//Step 2: Implement the Interface
//Create a class ArrayOperationsImpl that implements the ArrayOperations interface:

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayOperationsImpl implements ArrayOperations {

    @Override
    public Map<Integer, Integer> calculateFrequency(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }

    @Override
    public int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }
        // Convert the set back to an array
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
}

//Step 3: Use the Implementation
//Write a main method to test the implementation:

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayOperationsImpl arrayOps = new ArrayOperationsImpl();

        // Example array
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5};

        // Calculate frequency
        Map<Integer, Integer> frequencyMap = arrayOps.calculateFrequency(array);
        System.out.println("Element frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }

        // Remove duplicates
        int[] uniqueArray = arrayOps.removeDuplicates(array);
        System.out.println("\nArray after removing duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
}
