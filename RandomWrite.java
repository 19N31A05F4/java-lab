import java.io.*;
public class RandomWrite {
private static final String PATH = "C:\\Users\\dilee\\OneDrive\\5F4\\sample.txt";
    public static void main(String[] args) {
               try{
        
         RandomAccessFile raFile=new RandomAccessFile(PATH,"rw");
          raFile.seek(4);
         raFile.write("Hello".getBytes());
         raFile.close();
         }
      catch(IOException e){
         e.printStackTrace();
         }
    }
}

