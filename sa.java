import java.util.Scanner;
class r {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp =a;
         a=b;
        b=temp;
        System.out.println("swapp:"+a);
        System.out.println("b"+b);
    }
}