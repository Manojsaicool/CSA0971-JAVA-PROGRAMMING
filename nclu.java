import java.util.Scanner;

 class charCoun{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperCou = 0;
        int lowerCou = 0;
        int numCou = 0;

        System.out.println("Enter * to exit...");
        while (true) {
            System.out.print("Enter any character: ");
            char ch = scanner.next().charAt(0);

            if (ch == '*') {
                break;
            } else if (Character.isUpperCase(ch)) {
                upperCou++;
            } else if (Character.isLowerCase(ch)) {
                lowerCou++;
            } else if (Character.isDigit(ch)) {
                numCou++;
            }
        }

        System.out.println("Total count of lower case: " + lowerCou);
        System.out.println("Total count of upper case: " + upperCou);
        System.out.println("Total count of numbers: " + numCou);
    }
}
