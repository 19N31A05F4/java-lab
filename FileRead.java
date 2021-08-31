import java.util.Scanner;
import java.io.*;
public class FileRead
{
 	 public static void main(String[] args) 
        {
 	       try 
 	       {
                File Obj = new File("FileDemo.txt");
                Scanner obj1 = new Scanner(Obj);
                while (obj1.hasNextLine()) 
                {
        		  String obj2 = obj1.nextLine();
       		  System.out.println(obj2);
                }
                obj1.close();
        	}catch (FileNotFoundException e) 
            {
                e.printStackTrace();
}
}
}
