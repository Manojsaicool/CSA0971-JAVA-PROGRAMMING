import java.util.Scanner;

class Spec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String statement = scanner.nextLine();
        int specialCharCount = 0;
        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);

            // Check if the character is not a letter or digit
            if (!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9')) {
                specialCharCount++;
            }
        }
        System.out.println("Number of special Characters: " + specialCharCount);

          }
}
