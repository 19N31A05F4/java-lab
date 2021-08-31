class fib
{
int i,a,b,c;
void nonrecursive(int n)
{ 
a=0; 
b=1;
c=a+b; 
System.out.print(a);
System.out.print(b);
while(i<n-2)
{
System.out.print(c); 
a=b;
b=c; 
c=a+b;
i++;
}
} 
int recursive(int n)
{
if(n==0)
return (0); 
if(n==1)
return (1);
else
return(recursive(n-1)+recursive(n-2));
}
}

 class fib1
{
public static void main(String args[])
{
int n;
n=Integer.parseInt(args[0]);
System.out.println("the recursion using non recursive is");  
fib f=new fib();
f.nonrecursive(n);
System.out.println("\n the recursion using recursive is");
 for(int i=0;i<n;i++)
{
int f1=f.recursive(i); 
System.out.print(f1);
}
}
}