import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicDrawImageEx extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public GraphicDrawImageEx() {
		this.setTitle("draw");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		
		this.setSize(300, 420);
		this.setVisible(true);
		
		
		
	}
	
	class MyPanel extends JPanel{
		
		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();
		
		public MyPanel() {
			addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					Point endP = e.getPoint();
					vEnd.add(endP);
					repaint();
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					Point startP = e.getPoint();
					vStart.add(startP);
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			for (int i = 0; i < vStart.size(); i++) {
				
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
			
			
			//g.drawImage(img, 20, 20, this);
			//g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			//g.drawImage(img, 20, 20, 250, 100, 100, 50, 200, 200, this);
			
		}}
	

	public static void main(String[] args) {

		new GraphicDrawImageEx();
		
		
	}

}
