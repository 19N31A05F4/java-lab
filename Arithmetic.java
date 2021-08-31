import java.util.Scanner;
class A
{                                                                           
int a,b;
void add()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
a=sc.nextInt();
System.out.println("Enter second number");
b=sc.nextInt();
int c;
c=a+b;
System.out.println("Sum is"+" "+c);
}
}

class B extends A
{                                                     
void mul()
{
int d;
d=a*b;
System.out.println("Multiplication of 2 nos is:"+" "+d);
}
}
class C extends B
{                                                       
void sub()
{
int e;
e=a-b;
System.out.println("Subtraction is"+" "+e);
}
}
class D extends C
{                                                        
void div()
{
int f;
f=a/b;
System.out.println("Division is"+" "+f);
}
}

class Arithmetic
{
public static void main(String args[])
{
D p=new D();
p.add();
p.sub();
p.mul();
p.div();
}
}