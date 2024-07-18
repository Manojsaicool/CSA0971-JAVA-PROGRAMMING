import java.util.Scanner;

class py {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = e.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
