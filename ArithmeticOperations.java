import java.util.*;
 class A 
{
    int a,b;
    void add()
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value");
    a=Integer.parseInt(sc.nextLine());
    System.out.println("enter b value");
    b=Integer.parseInt(sc.nextLine());
    System.out.println("sum="+(a+b));
   }
}

 class B extends A
{
     int c,d;
   void subtract()
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter c value");
    c=Integer.parseInt(sc.nextLine());
    System.out.println("enter d value");
    d=Integer.parseInt(sc.nextLine());
    System.out.println("Subtraction result="+(c-d));
   }
}

 class C extends B
{
    int e,f;
    void multiply()
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter e value");
    e=Integer.parseInt(sc.nextLine());
    System.out.println("enter f value");
    f=Integer.parseInt(sc.nextLine());
    System.out.println("multiplication result is="+(e*f));
   }
}

 class D extends C
{
   float g,h;
   void divide()
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter g value");
    g=Integer.parseInt(sc.nextLine());
    System.out.println("enter h value");
    h=Integer.parseInt(sc.nextLine());
    System.out.println("quotient is="+(g/h));
   }
}

 class ArithmeticOpearations
{
 public static void main(String args[])
 {
   D o= new D();
   o.add();
   o.subtract();
   o.multiply();
   o.divide();
 }
}

   


