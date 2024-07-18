import java.util.Scanner;

class py {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = e.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = e.nextInt();
        for(int i=1;i<=r;i++){
        for(int j=1;j<=c;j++){
        if(i==1||i==r||j==1||j==c)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}


