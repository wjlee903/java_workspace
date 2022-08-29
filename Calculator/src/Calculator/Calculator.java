package Calculator;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	public Calculator() {
		this.setTitle("Calculator");
		this.setLocation(230, 400);
		this.setSize(800, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();

		this.add(jp1);
		jp1.setLayout(new FlowLayout());
		
		jp2.setLayout(new GridLayout(4, 4));
		jp2.setPreferredSize(new Dimension(220, 220));
		
		JButton b1 = new JButton("1");
		jp2.add(b1);
		
		JButton b2 = new JButton("2");
		jp2.add(b2);
		
		JButton b3 = new JButton("3");
		jp2.add(b3);
		
		JButton bMinus = new JButton("-");
		jp2.add(bMinus);
		
		JButton b4 = new JButton("4");
		jp2.add(b4);
		
		JButton b5 = new JButton("5");
		jp2.add(b5);
		
		JButton b6 = new JButton("6");
		jp2.add(b6);
		
		JButton bPlus = new JButton("+");
		jp2.add(bPlus);
		
		JButton b7 = new JButton("7");
		jp2.add(b7);
		
		JButton b8 = new JButton("8");
		jp2.add(b8);
		
		JButton b9 = new JButton("9");
		jp2.add(b9);
		
		JButton bGob = new JButton("*");
		jp2.add(bGob);
		
		JButton b0 = new JButton("0");
		jp2.add(b0);
		
		JButton bDot = new JButton(".");
		jp2.add(bDot);
		
		JButton bEqual = new JButton("=");
		jp2.add(bEqual);
		
		JButton bDivide = new JButton("/");
		jp2.add(bDivide);
		
		jp3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jp3.setPreferredSize(new Dimension(220, 100));
		
		JLabel text1 = new JLabel("Make");
		JLabel text2 = new JLabel("yoyoyoyo");
		
		jp3.add(text1);
		jp3.add(text2);
		
		JButton clear = new JButton();
		clear.setPreferredSize(new Dimension(220, 30));
		
		JLabel idlbl = new JLabel("°è»ê±â");
		jp1.add(idlbl);
		
		JTextField idtf = new JTextField(24);
		jp1.add(idtf);
		jp1.add(jp2);
		jp1.add(clear);
		jp1.add(jp3);
		
		this.setVisible(true);
		
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		new Calculator();
	}

}
