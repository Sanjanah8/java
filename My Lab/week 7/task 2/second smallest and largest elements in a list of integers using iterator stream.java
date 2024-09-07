package week7;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
public class SecondSmallestLargest {
 public static void main(String[] args) {
 List<Integer> numbers = Arrays.asList(13, 100, 1, 30, 45, 2);

 Optional<Integer> secondSmallest = numbers.stream()
 .distinct()
 .sorted()
 .skip(1)
 .findFirst();
 Optional<Integer> secondLargest = numbers.stream()
 .distinct()
 .sorted((a, b) -> b - a)
 .skip(1)
 .findFirst(); 
if (secondSmallest.isPresent()) {
 System.out.println("Second smallest: " + secondSmallest.get());
 } else {
 System.out.println("Second smallest element not found.");
 }
 if (secondLargest.isPresent()) {
 System.out.println("Second largest: " + secondLargest.get());
 } else {
 System.out.println("Second largest element not found.");
 }
 }
}
