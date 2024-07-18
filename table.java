import java.util.Scanner;

class ta {
    public static void main(String[] args)
 {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = t.nextInt(); 
        for (int i = 1; i <= 10; i++) 
{ 
            System.out.println(a + " X " + i + " = " + (a * i));
        }
        
    }
}
