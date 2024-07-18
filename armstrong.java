import java.util.Scanner;

class arm {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int o, re, rs = 0;
        o = n;
        
        while (n != 0) {
            re = n % 10;
            rs = rs + (re * re * re);
            n /= 10;
        }
        
        if (o == rs) {
            System.out.println(o + " is an Armstrong number");
        } else {
            System.out.println(o + " is not an Armstrong number");
        }
       
    }
}
