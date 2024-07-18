import java.util.Scanner;
class pal{
public static void main(String[]args)
{
Scanner e=new Scanner(System.in);
int n=e.nextInt();
int res=0,t;
t=n;
while(n!=0)
{
 int r=n%10;
 res=res*10+r;
 n/=10;
}
if(res==t)
{
System.out.println("palidrom number:"+t);
}
else
{
System.out.println("not paildrome:"+t);

}
}
}
