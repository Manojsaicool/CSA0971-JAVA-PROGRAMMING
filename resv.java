import java.util.Scanner;
class rev{
public static void main(String[]args)
{
Scanner e=new Scanner(System.in);
int n=e.nextInt();
int res=0;
while(n!=0)
{
 int r=n%10;
 res=res*10+r;
 n/=10;
}
System.out.println("reversed number:"+res);
}
}jav