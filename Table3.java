//19N31A05F4
class Table
{
synchronized void printTable(int n)
{
 for(int i=1;i<=5;i++)
{
System.out.println(n*i);
try
{
Thread.sleep(400);
}
catch(Exception e)
{
 System.out.println(e);
}
}
}
}

class Thread1 extends Thread
{
Table t;
Thread1(Table t)
{
this.t=t;
}
public void run()
{
t.printTable(5);
}
}

class Thread2 extends Thread
{
Table t;
Thread2(Table t)
{
this.t=t;
}
public void run()
{
t.printTable(10);
}
}

class Thread3 extends Thread
{
Table t;
Thread3(Table t)
{
this.t=t;
}
public void run()
{
t.printTable(100);
}
}

class Table3
{
public static void main(String args[])
{
Table a=new Table();
Thread1 t1=new Thread1(a);
Thread2 t2=new Thread2(a);
Thread3 t3=new Thread3(a);
t1.start();
t2.start();
t3.start();
}
}
