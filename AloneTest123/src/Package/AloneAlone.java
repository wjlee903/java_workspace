package Package;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AloneAlone extends JFrame {
	private Student dialog;

	public AloneAlone() {
		super("Make");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("gogogo");
		
		dialog = new Student(this, "so");
		
		this.add(button);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dialog.setVisible(true);
				

			}
		});
		
		//getContentPane().add(button);
		setSize(400, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new AloneAlone();

	}

}
