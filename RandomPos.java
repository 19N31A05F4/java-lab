import java.io.*;
public class RandomPos {
private static final String PATH = "C:\\Users\\dilee\\OneDrive\\5F4\\sample.txt";
    public static void main(String[] args) {
        
     try{
            RandomAccessFile raFile=new RandomAccessFile(PATH,"r");

            System.out.println("Current file pointer position 1 : "+raFile.getFilePointer());
            raFile.seek(3);
            System.out.println("Current file pointer position 2 : "+raFile.getFilePointer());
            raFile.close();
}
catch(IOException e){
            e.printStackTrace();
        }
    }
}
