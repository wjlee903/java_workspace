import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FlowLayoutEx extends JFrame {

	public FlowLayoutEx () {
		this.setTitle("Layout simple");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 50));
		c.add(new JLabel(" �̸�"));
		c.add(new JTextField("                                              "));
		c.add(new JLabel(" �й�"));
		c.add(new JTextField("                                               "));
		c.add(new JLabel(" �а�"));
		c.add(new JTextField("                                               "));
		c.add(new JLabel(" ����"));
		c.add(new JTextField("                                               "));
		
		setSize(300, 400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new FlowLayoutEx();

	}

}
