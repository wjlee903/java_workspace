import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChartEx extends JFrame  {
	
	private MyPanel Panel = new MyPanel();
	private JPanel fruitPanel;
	JTextField appleJf = new JTextField(5);
	JTextField bananaJf = new JTextField(5);
	JTextField mangoJf = new JTextField(5);
	JTextField cherryJf = new JTextField(5);
	JButton startJb = new JButton("START");
	
	JLabel appleJl = new JLabel("Apple"+"%");
	JLabel bananaJl = new JLabel("Banana"+"%");
	JLabel mangoJl = new JLabel("Mango"+"%");
	JLabel cherryJl = new JLabel("Cherry"+"%");
	
	int numApple;
	int numBanana;
	int numMango;
	int numCherry;
	
	public ChartEx() {
		
	this.setTitle("PieChart");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c = getContentPane();
		
	fruitPanel = new JPanel();
	fruitPanel.add(new JLabel("apple"));
	fruitPanel.add(appleJf);
	fruitPanel.add(new JLabel("banana"));
	fruitPanel.add(bananaJf);
	fruitPanel.add(new JLabel("mango"));
	fruitPanel.add(mangoJf);
	fruitPanel.add(new JLabel("cherry"));
	fruitPanel.add(cherryJf);
	fruitPanel.add(startJb);
	
	Panel.add(appleJl, FlowLayout.LEFT);
	Panel.add(bananaJl);
	Panel.add(mangoJl);
	Panel.add(cherryJl);
	Panel.setBackground(Color.cyan);
	
	c.add(Panel,BorderLayout.CENTER);
	c.add(fruitPanel,BorderLayout.NORTH);
	
	startJb.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String strApple = appleJf.getText();
			numApple = Integer.parseInt(strApple);
			
			
			String strBanana = bananaJf.getText();
			numBanana = Integer.parseInt(strBanana);
			
			String strMango = mangoJf.getText();
			numMango = Integer.parseInt(strMango);
			
			String strCherry = cherryJf.getText();
			numCherry = Integer.parseInt(strCherry);
		       System.out.println(numCherry);	
//			public getAppleAver() {
//			
//			getaver(numApple+numBanana+numMango+numCherry);
//		}
		}
	});
	
	this.setSize(600, 600);
	this.setVisible(true);
	
	}
	
	class MyPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			//g.setColor(Color.red);
			//g.fillArc(100, 100, 380, 380, 0, 240);
			
		}}

	
	
	
	public static void main(String[] args) {
		
		new ChartEx();

		
	}

}
