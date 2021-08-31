import java.io.*;
public class FileCopy {
    public static void main(String[] args) {
        FileInputStream a = null;
        FileOutputStream b = null;
        try {
            File obj_in = new File("FileDemo.txt");
            File obj_out = new File("FileDemo1.txt");

            a = new FileInputStream(obj_in);
            b = new FileOutputStream(obj_out);

            byte[] buffer = new byte[1024];

            int length;
            while ((length = a.read(buffer)) > 0) {
                b.write(buffer, 0, length);
            }
            a.close();
            b.close();
            System.out.println("File copied successfully!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
