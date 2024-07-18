import java.util.Scanner;

class vote {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt(); 
        if (a <0 ) {
            System.out.println("negative " + a);
        } else if (a>0) {
            System.out.println("postive " + a); 
        }
else {
System.out.println("zero " + a);   
    }
}
}
