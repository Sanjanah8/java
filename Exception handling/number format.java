public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String input = "abc";
        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }
}
