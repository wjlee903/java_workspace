import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class MyDialog extends JDialog {

	private JTextField textfield = new JTextField(10);
	private JButton okButton = new JButton("OK");

	public MyDialog(JFrame frame, String title) {
		super(frame, title, true);
		setLayout(new FlowLayout());
		add(textfield);
		add(okButton);
		setSize(250, 200);

		okButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

			}
		});

	}

}

	public class DialogEx extends JFrame {

		private MyDialog dialog;

		public DialogEx() {
			super("dialog");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JButton btn = new JButton("show dialog");
			
			dialog = new MyDialog(this, "test");
			
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					dialog.setVisible(true);
					
					
				}
			});
			
			getContentPane().add(btn);
			setSize(400, 400);
			setVisible(true);
			
			
			}

		public static void main(String[] args) {
			new DialogEx();
			
		}

	}
