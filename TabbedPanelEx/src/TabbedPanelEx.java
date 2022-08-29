import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPanelEx extends JFrame {
	public TabbedPanelEx () {
		setTitle("tab tab");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JTabbedPane pane = createTabbedPane();
		c.add(pane, BorderLayout.CENTER);
		setSize(250, 250);
		setVisible(true);
	
	}

	
	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("tab1", new JLabel(new ImageIcon("images/img1.jpg")));
		pane.addTab("tab2", new JLabel(new ImageIcon("images/img2.jpg"
				+ "")));
		
		pane.addTab("tab3", new MyPanel());
		return pane;
		
	}
	
	
	class MyPanel extends JPanel{
		
		public MyPanel() {
			this.setBackground(Color.yellow);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.blue);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.black);
			g.drawString("Tab3 intotheAlone", 30, 50);
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TabbedPanelEx();

	}

}
