import java.io.*;  
import java.util.Scanner;
public class FileOperations
{
  static FileInputStream a=null;
  static FileOutputStream b=null;
        public static void main(String[] args) 
        {
           try
	   {
        	
        		File Obj = new File("dileep.txt");
        		if (Obj.createNewFile())	{
			        System.out.println("******File created******");
               		  System.out.println("Name of the file = " + Obj.getName());
                  } 
                else{
			       System.out.println("File already exists.");
                }

		FileWriter obj1=new FileWriter("dileep.txt");
		obj1.write("Welcome to java Files");
		obj1.close();
		System.out.println("file is updated");

		File obj2=new File("dileep.txt");
		Scanner obj3=new Scanner(obj2);
		while(obj3.hasNextLine())
		{
			String obj4=obj3.nextLine();
			System.out.println(obj4);
		}
		 obj3.close();

		File obj_in=new File("dileep.txt");
		File obj_out=new File("dileep1.txt");
		a=new FileInputStream(obj_in);
		b=new FileOutputStream(obj_out);
		byte[] buffer=new byte[1024];
		int length;
		while((length=a.read(buffer))>0)
		{
		 b.write(buffer,0,length);
		}
		 a.close();
		 b.close();
		 System.out.println("File copied successfully!!");

		File a=new File("dileep1.txt");
		boolean b=a.exists();
		if(b==true)
		{
		 System.out.println("Executable:"+a.canExecute());
		 System.out.println("Readable:"+a.canRead());
		 System.out.println("Writable:"+a.canWrite());
 		}
		else
		{
		 System.out.println("File not found");
		}

		File o= new File("dileep1.txt");
		if (o.exists()) 
		{
			System.out.println("File name= " + o.getName());
			System.out.println("***********************************");
			System.out.println("Absolute path= " + o.getAbsolutePath());
			System.out.println("***********************************");
			System.out.println("Writable= " + o.canWrite());
			System.out.println("***********************************");
			System.out.println("Readable= " + o.canRead());
			System.out.println("***********************************");
			System.out.println("File size in bytes= " + o.length());
		} 
		else 
		{
			System.out.println("file does not exist.");
		}
		
		File obj5=new File("dileep1.txt");
		if(obj5.delete())
		{
		 System.out.println(obj5.getName()+"has been deleted");
		}
		else
		{
		 System.out.println("Failed");
		}  
	}
		catch(IOException e)
		{
			e.printStackTrace();
		}         
   }
}


