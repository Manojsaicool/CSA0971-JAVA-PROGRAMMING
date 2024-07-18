import java.util.Scanner;

class ar {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the n*n size: ");
        int n = r.nextInt(); // Declare and initialize n

        Integer[][] m1 = new Integer[n][n];
        System.out.println("Enter the elements of matrix1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m1[i][j] = r.nextInt();
            }
        }

        Integer[][] m2 = new Integer[n][n];
        System.out.println("Enter the elements of matrix2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m2[i][j] = r.nextInt();
            }
        }

        Integer[][] m3 = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];             }
        }

        System.out.println("The Added matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m3[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
