package week7;
import java.util.stream.Stream;
public class EvenOdd {
 public static void main(String[] args) {
 Stream<Integer> numberStream = Stream.<Integer>builder()
 .add(10)
 .add(20)
 .add(30)
 .add(40)
 .add(50)
 .add(60)
 .add(70)
 .add(80)
 .add(90)
 .add(100)
 .build();
 int sumEven = numberStream
 .filter(n -> n % 2 == 0)
 .mapToInt(Integer::intValue)
 .sum();
 numberStream = Stream.<Integer>builder()
 .add(1)
 .add(3)
   .add(5)
 .add(7)
 .add(9)
 .add(11)
 .add(13)
 .add(15)
 .add(17)
 .add(19)
 .build();
 int sumOdd = numberStream
 .filter(n -> n % 2 != 0)
 .mapToInt(Integer::intValue)
 .sum();
 System.out.println("Sum of even numbers: " + sumEven);
   System.out.println("Sum of odd numbers: " + sumOdd);
 }
}
