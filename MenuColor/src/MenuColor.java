import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuColor extends JFrame {

	private JPanel color; 

	JMenuItem red = null;
	JMenuItem blue = null;
	JMenuItem green = null;
	JMenuBar mb = null;
	JMenu menu1 = null;

	public MenuColor() {
		this.setTitle("menu color change");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		this.color = new JPanel();



		this.mb = new JMenuBar();
		this.menu1 = new JMenu("Color");
		this.red = new JMenuItem("Red");
		this.red.setBackground(Color.red);
		this.blue = new JMenuItem("Blue");
		this.blue.setBackground(Color.blue);
		this.green = new JMenuItem("Green");
		this.green.setBackground(Color.green);

		menu1.add(red);
		menu1.add(blue);
		menu1.add(green);

		mb.add(menu1);

		c.add(color,BorderLayout.CENTER);
		setJMenuBar(mb);
		color.setBackground(Color.black);


		this.red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				color.setBackground(Color.red);

			}
		});

		this.blue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				color.setBackground(Color.blue);

			}
		});

		this.green.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				color.setBackground(Color.green);


			}
		});


		setSize(250, 250);
		setVisible(true);

	}


	public static void main(String[] args) {

		new MenuColor();
	}

}
