import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame implements ActionListener {
	public IndepClassListener() {
		this.setTitle("action");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if (b.getText().equals("Action")) {
					b.setText("액션");
				}
				else {
					b.setText("Action");
				}
				
			}});
		
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new IndepClassListener();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

class MyActionListener implements ActionListener {

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		JButton b = (JButton)e.getSource();
//		if (b.getText().equals("Action")) {
//			b.setText("액션");
//		}
//		else {
//			b.setText("Action");
//		}
//		
//	}
	
}




