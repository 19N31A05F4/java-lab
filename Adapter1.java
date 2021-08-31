import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Adapter1.class" width="400" height="400">
</applet>
*/
public class Adapter1 extends JApplet
{
	JLabel label;
	public void init()
	{
		setSize(600,300);
		setLayout(new FlowLayout());
		label = new JLabel();
		add(label);
		addMouseListener(new MyAdapter(label));
	}
	
}
class MyAdapter extends MouseAdapter
{
	JLabel label;
	MyAdapter(JLabel label)
	{
		this.label = label;
	}
	public void mouseClicked(MouseEvent me)
	{
		label.setText("Mouse is clicked");
	}
}
