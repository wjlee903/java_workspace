import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyLabel extends JLabel{
	private int barSize =0;
	private int maxBarSize;
	
	public MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.magenta);
		int width = (int)(((double)(this.getWidth())) / maxBarSize);
		if(width==0) return;
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized public void fill() {
		if(barSize == maxBarSize) {
			try {
				wait();
			} catch (Exception e) {	return;	}
		}
		barSize++;
		repaint();
		notify();
	}
		synchronized public void consume() {
			if(barSize==0) {
				try {
					wait();
				} catch (Exception e) {	return; }
				barSize--;
				repaint();
				notify();
			}
		}
	
}


class ConsumerThread extends Thread{
	private MyLabel bar;
	public ConsumerThread(MyLabel bar) {
		this.bar = bar;
	}

	@Override
	public void run() {
		super.run();
		while (true) {
			try {
				sleep(10000);
				bar.consume();
			} catch (Exception e) {
				return;
			}
		}
		
	}
	
	
}


public class TabAndthreadEx extends JFrame{
	private MyLabel bar = new MyLabel(100);
	
	public TabAndthreadEx (String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.orange);
		bar.setOpaque(true);
		bar.setLocation(20, 50);
		bar.setSize(300, 20);
		c.add(bar);
		
		c.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				bar.fill();
				
			}
		});
		setSize(350, 200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		ConsumerThread th = new ConsumerThread(bar);
		th.start();
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TabAndthreadEx("danf");

	}

}
