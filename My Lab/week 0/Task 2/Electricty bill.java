import java.util.Scanner;
public class Bill2 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter consumer number: ");
 int consumerNumber = scanner.nextInt();
 scanner.nextLine(); 
 System.out.print("Enter consumer name: ");
 String consumerName = scanner.nextLine();
 System.out.print("Enter units consumed: ");
 int units = scanner.nextInt();
 double billAmount = 0;
 if (units <= 100) {
 billAmount = units * 1.50;
 } else if (units <= 300) {
 billAmount = 100 * 1.50 + (units - 100) * 2.00;
 } else {
 billAmount = 100 * 1.50 + 200 * 2.00 + (units- 300) * 3.00;
 }
 billAmount += 50;
 double surcharge = 0;
 if (billAmount > 5000) {
 surcharge = 0.02 * billAmount;
 }
 double totalAmount = billAmount + surcharge;
 System.out.println("\nElectricity Bill Details:");
 System.out.println("===========================");
 System.out.println("Consumer Number: " + consumerNumber);
 System.out.println("Consumer Name: " + consumerName);
 System.out.println("Units Consumed: " + units);
 System.out.println("Bill Amount (before surcharge): Rs. " + billAmount);
 System.out.println("Surcharge Amount: Rs. " + surcharge);
 System.out.println("Total Amount Payable: Rs. " + totalAmount);
 scanner.close();
 }
}
}
