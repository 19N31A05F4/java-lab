import java.io.*;
public class FileWrite 
{
  public static void main(String[] args) 
{
    try 
	{
		FileWriter obj = new FileWriter("FileDemo.txt");
		obj.write("Welcome to Java Files");
		obj.close();
		System.out.println("File is Updated.");
	}
    catch (IOException e) 
	{
		e.printStackTrace();
	}
  }
}

