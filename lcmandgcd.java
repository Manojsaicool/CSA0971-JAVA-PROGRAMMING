import java.util.Scanner;
class lg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        scanner.close();
        int s = a;
        int r = b;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        int gcd = a; 
        int lcm = (s * r) / gcd;

        System.out.println("LCM of " + s + " and " + r+ " is " + lcm);

        System.out.println("GCD of " + s + " and " + r+ " is " + gcd);
    }
}
