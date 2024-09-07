package week7;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Integers {
 public static void main(String[] args) {
 List<Integer> numbers = Arrays.asList(30, 29, 30, 45, 50);
 List<Integer> squares = numbers.stream()
 .map(n -> n * n)
 .collect(Collectors.toList());
 System.out.println("List before: " + numbers);
 System.out.println("Squared list: " + squares);
 }
}
