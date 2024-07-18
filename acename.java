import java.util.Arrays;
import java.util.Scanner;

 class so {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int non = e.nextInt();
        e.nextLine();  
        String[] names = new String[non];
        System.out.println("Enter the names:");
        for (int i = 0; i < non; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = e.nextLine();
        }
        Arrays.sort(names);
        System.out.println("Names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
