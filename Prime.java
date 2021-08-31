import java.lang.*; 
class Prime
{
public static void main(String arg[])
{
int n,c,i,j; 
n=Integer.parseInt(arg[0]);
System.out.println("prime numbers are"); 
for(i=1;i<=n;i++)
{ 
c=0;
for(j=1;j<=i;j++)
{
if(i%j==0) 
c++;
}
if(c==2) 
System.out.println(" "+i);
}
}
}