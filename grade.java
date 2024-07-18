import java.util.Scanner;
 class Stugra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks in Python: ");
        int pyth = scanner.nextInt();

        System.out.print("Enter the marks in C Programming: ");
        int cPro = scanner.nextInt();

        System.out.print("Enter the marks in Mathematics: ");
        int math = scanner.nextInt();

        System.out.print("Enter the marks in Physics: ");
        int phy = scanner.nextInt();

        int totalMarks = pyth + cPro + math + phy;

        double aggregate = totalMarks / 4.0;
        String grade;
        if (aggregate > 75.0) {
            grade = "DISTINCTION";
        } else if (aggregate >= 60.0 && aggregate < 75.0) {
            grade = "FIRST DIVISION";
        } else if (aggregate >= 50.0 && aggregate < 60.0) {
            grade = "SECOND DIVISION";
        } else if (aggregate >= 40.0 && aggregate < 50.0) {
            grade = "THIRD DIVISION";
        } else {
            grade = "FAIL";
        }

       
        System.out.println("Total= " + totalMarks);
        System.out.println("Aggregate= " + aggregate);
        System.out.println(grade);

    }
}
