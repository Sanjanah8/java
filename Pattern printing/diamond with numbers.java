public class DiamondWithNumbers {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            int num = i;
            for (int k = 1; k <= i; k++) {
                System.out.print(num++);
            }
            num -= 2;
            for (int l = 1; l < i; l++) {
                System.out.print(num--);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            int num = i;
            for (int k = 1; k <= i; k++) {
                System.out.print(num++);
            }
            num -= 2;
            for (int l = 1; l < i; l++) {
                System.out.print(num--);
            }
            System.out.println();
        }
    }
}

//output:
    1
   232
  34543
 4567654
567898765
 4567654
  34543
   232
    1
