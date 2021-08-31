//N.DILEEP KUMAR REDDY
//19N31A05F4
//II-II-CSE-C
public class MultiCatch
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			System.out.println(a[4]/0);
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
	        catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception occurs");
		}
		System.out.println("Rest of the code");
	}
}