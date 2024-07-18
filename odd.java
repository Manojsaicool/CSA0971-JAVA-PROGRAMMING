import java.util.Scanner;

class ee {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int v = a.nextInt();
        if (v % 2 == 0) {
            System.out.println("even " + v);
        } else {
            System.out.println("odd " + v);
        }
        a.close();     }
}
