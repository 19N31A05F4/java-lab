import java.awt.*;
import javax.swing.*;
public class panel1 {
    panel1 () {
        JFrame frame = new JFrame("JPanel Example ");
        JPanel panel = new JPanel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.gray);
        JButton btn = new JButton("JPanel Button");
        btn.setBounds(50, 100, 80, 30);
        btn.setBackground(Color.ORANGE);
               panel.add(btn);
                frame.add(panel);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        // TODO code application logic here
        new panel1();
    }
}
