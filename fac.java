import java.util.Scanner;

class fact {
    public static void main(String[] args) {
        int a;
        long fac = 1;  
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            fac *= i;  
        }
        System.out.println("The factorial of " + a + " is " + fac);
        sc.close();  
    }
}
