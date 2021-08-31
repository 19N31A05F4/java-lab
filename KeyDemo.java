import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;
class MyKeyListener implements KeyListener {
  public void keyTyped(KeyEvent e) {
    char c = e.getKeyChar();
    System.out.println("Key Typed: " + c);
  }

  public void keyPressed(KeyEvent e) {
    char c = e.getKeyChar();
    System.out.println("Key Pressed: " + c);
  }

  public void keyReleased(KeyEvent e) {
    char c = e.getKeyChar();
    System.out.println("Key Released: " + c);
  }
}

public class KeyDemo {

  public static void main(String[] a) {
    JFrame frame = new JFrame("Popup JComboBox");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField textField = new JTextField();
    textField.addKeyListener(new MyKeyListener());

    frame.add(textField);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }

}
