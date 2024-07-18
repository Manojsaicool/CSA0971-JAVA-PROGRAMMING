import java.util.Scanner;

 class pon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countPositive = 0;
        int sumPositive = 0;
        int countNegative = 0;
        int sumNegative = 0;
        
        System.out.println("Enter numbers (Enter -1 to exit):");
        int num = scanner.nextInt();
        
        while (num != -1) {
            if (num > 0) {
                countPositive++;
                sumPositive += num;
            } else if (num < 0) {
                countNegative++;
                sumNegative += num;
            }
            num = scanner.nextInt();
        }

        if (countPositive > 0) {
            double avgPositive = (double) sumPositive / countPositive;
            System.out.println("The average of positive numbers is: " + avgPositive);
        } else {
            System.out.println("No positive numbers entered.");
        }
        
        if (countNegative > 0) {
            double avgNegative = (double) sumNegative / countNegative;
            System.out.println("The average of negative numbers is: " + avgNegative);
        } else {
            System.out.println("No negative numbers entered.");
        }
    }
}
