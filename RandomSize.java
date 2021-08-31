import java.io.*;
public class RandomSize {
private static final String PATH = "C:\\Users\\dilee\\OneDrive\\5F4\\sample.txt";
    public static void main(String[] args) {
        
      try{
            RandomAccessFile raFile=new RandomAccessFile(PATH,"rw");
            System.out.println("length of the file is "+raFile.length());
            raFile.seek(raFile.length());
            raFile.write("Hello".getBytes());
            raFile.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
