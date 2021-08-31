class Test1 extends Thread
{
 public void run()
{
System.out.println("A:"+Thread.interrupted());
//System.out.println(Thread.currentThread().isInterrupted());
 try
{
 for(int i=1;i<=5;i++)
 {
  System.out.println(i);
  Thread.sleep(1000);
  System.out.println("B:"+Thread.interrupted());
 }
}
catch(Exception e)
{
 System.out.println("Thread Interrupted:"+e);
}
}
public static void main(String args[])
{
 Test1 t=new Test1();
 t.start();
 t.interrupt();
}
}