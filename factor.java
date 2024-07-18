import java.util.Scanner;
class fa{
public static void main(String[]args)
{
Scanner e=new Scanner(System.in);
int a,b=0,c,n,s=0;
n=e.nextInt();
c=n;
for(int i=1;i<=n;i++)
{
if(n%10==0)
{
System.out.println("factor:"+i);
}
}
}
}