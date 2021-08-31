import java.io.*;
public class RandomLen {
private static final String PATH = "C:\\Users\\dilee\\OneDrive\\5F4\\sample.txt";
    public static void main(String[] args) {
              try{
            RandomAccessFile raFile=new RandomAccessFile(PATH,"rw");
            System.out.println("File length "+raFile.length());
            raFile.setLength(47);
            System.out.println("File length after setting : "+raFile.length());
            raFile.close();
        }
      catch(IOException e){
            e.printStackTrace();
        }
    }
}
