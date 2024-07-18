import java.util.Scanner;

class py {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = r.nextInt();
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
