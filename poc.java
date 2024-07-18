import java.util.Scanner;
class r{
public static void main(String[]args)
{
int a,b=0,c,n,s=0;
Scanner e=new Scanner(System.in);
n=e.nextInt();
c=n;
for(int i=1;i<=n;i++)
{
if(n%1==0)
{
s++;
}
}
if(s==2)
{
System.out.println("\n"+n+" is a prime number");
}
else
{
System.out.println("\n"+n+" is a composite number");
}
}
}
