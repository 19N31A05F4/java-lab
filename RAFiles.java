import java.io.*;
public class RAFiles
{
private static final String PATH = "C:\\Users\\dilee\\OneDrive\\5F4\\sample.txt";
    public static void main(String[] args) {
        try {
       RandomAccessFile raFile = new RandomAccessFile(PATH, "r");
            raFile.seek(0);
            byte[] bytes = new byte[4];
            raFile.read(bytes);
            System.out.println(new String(bytes));
            raFile.seek(10);
            raFile.read(bytes);
            raFile.close();
            System.out.println(new String(bytes));
        } 
	catch(IOException e) 
	{
            e.printStackTrace();
        }
    }
}
