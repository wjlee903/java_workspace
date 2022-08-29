package Package;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Student extends JDialog {
	private JLabel label = new JLabel("what");
	private JTextField textfield = new JTextField(10);
	private JButton button = new JButton("OK");
	
	public Student (JFrame jframe, String title) {
		super(jframe, title);
		this.setLayout(new FlowLayout());
		this.add(label);
		this.add(textfield);
		this.add(button);
		
		//setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		setSize(200, 200);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				
			}
		});
		
		
	}

}
