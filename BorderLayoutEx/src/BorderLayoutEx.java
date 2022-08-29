import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		
		this.setTitle("BorderLayoutEx sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(null);
		
		JLabel la = new JLabel("Hell");
		la.locate(130, 50);
		la.setSize(200, 20);
		c.add(la);
		
		for (int i = 0; i < 9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*20, i*20);
			b.setSize(50, 20);
			c.add(b);
		}
		setSize(300, 200);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
