import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test extends JFrame {
	JButton jb ;
	ImageIcon icon ;
	
	public Test() {
		this.setTitle("good");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		icon = new ImageIcon("images/search.png");
		jb = new JButton(icon);
		jb.setPreferredSize(new Dimension(20, 20));
		
		this.add(jb, BorderLayout.CENTER);
		
		setSize(500, 500);
		setVisible(true);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new Test();
		
		
	}

}
