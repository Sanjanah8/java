public class StringOperations {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println("Is Palindrome: " + isPalindrome(str));
        System.out.println("Substring (1, 4): " + str.substring(1, 4));
        System.out.println("Is Equal to 'madam': " + str.equals("madam"));
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
