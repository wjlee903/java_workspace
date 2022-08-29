import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GrapicsDrawStringEx extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public GrapicsDrawStringEx() {
		this.setTitle("draw");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		
		setSize(600, 600);
		setVisible(true);
		
	}

	
	class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawLine(20, 20, 400, 400);
			
			g.setColor(Color.red);
			g.fillOval(50, 50, 80, 80);
			
			
			g.drawString("자바는", 30, 30);
			g.drawString("얼마나 하늘만큼", 60, 60);
			
			g.setColor(Color.black);
			g.fillRoundRect(100, 20, 120, 40, 10, 10);
			
			g.setColor(Color.green);
			g.fillArc(10, 190, 200, 200, 90, 120);
			g.setColor(Color.red);
			g.fillArc(10, 190, 200, 200, 210, 120);
			g.setColor(Color.blue);
			g.fillArc(10, 190, 200, 200, 330, 120);
			
			g.setColor(Color.orange);
			int [] x = {30,10,30,60};
			int [] y = {250, 275,300, 275};
			g.fillPolygon(x, y, 4);

	}
	}
	

	public static void main(String[] args) {
		new GrapicsDrawStringEx();
	}

}
