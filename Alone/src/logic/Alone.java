import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Alone extends JFrame {

	JPanel p = new JPanel();
	public Alone() {
	
		p.setLayout(new BorderLayout());
		this.setTitle("layout test");
		this.setSize(500, 698);
		flowTest();
		merge();
		gridTest();

		//	nullTest();
	//this.pack(); // �ʿ���� �κ��� �����ش�. ������� �߶� �������� ��������
	this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�̰� ������ ���� ���μ����� �����ִ�.
		this.setVisible(true);
		//��ġ �����ڸ� ������ ����ؼ� ����ϼ��� �г� 2���̻� ������ ���� ��ġ�����ڵ� �־���Ѵ�.
	}
	
	void merge() {
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		JPanel box1 = new JPanel();
		box1.setLayout(new BoxLayout(box1, BoxLayout.X_AXIS));//����� �����̳ʸ� �������ְ�, ���������� ����������Ѵ�.
		JButton btn1 = new JButton("MC");
		box1.add(btn1);
		JButton btn2 = new JButton("MR");
		box1.add(btn2);
		JButton btn3 = new JButton("M+");
		box1.add(btn3);
		JButton btn4 = new JButton("M-");
		box1.add(btn4);
		JButton btn5 = new JButton("MS");
		box1.add(btn5);
		JButton btn6 = new JButton("M��");
		box1.add(btn6);
		p.add(box1);
		this.add(p);
	
		
	}
	
	void flowTest() {
		


		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		JPanel gridt = new JPanel();
		JTextField t1 = new JTextField("0");
		t1.setText("0");
		t1.setHorizontalAlignment(JTextField.RIGHT); // 0�� ����������
		gridt.setLayout(new GridLayout(1,0)); // �÷ο췹�̾ƿ��� ����ؼ� ��������� ������
		gridt.add(t1);
		t1.setPreferredSize(new Dimension(312,50)); // x,y ������ ��ư�� ũ�� ���������ϴ�. 
		p.add(gridt);

		this.add(p);
	}
	
	void borderTest() {
		JPanel border1 = new JPanel();
		border1.setLayout(new BorderLayout());
		JButton btn1 = new JButton("btn1");
		border1.add(btn1,BorderLayout.NORTH);
		JButton btn2 = new JButton("btn2");
		border1.add(btn2,BorderLayout.SOUTH);
		this.add(border1);
	}
	
	void gridTest() {
		
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		JPanel grid1 = new JPanel();
		grid1.setLayout(new GridLayout(5,4));
		JButton btn1 = new JButton("CE");
		grid1.add(btn1);
		JButton btn2 = new JButton("C");
		grid1.add(btn2);
		JButton btn3 = new JButton("X");
		grid1.add(btn3);
		JButton btn4 = new JButton("��");
		grid1.add(btn4);
		JButton btn5 = new JButton("7");
		grid1.add(btn5);
		JButton btn6 = new JButton("8");
		grid1.add(btn6);
		JButton btn7 = new JButton("9");
		grid1.add(btn7);
		JButton btn8 = new JButton("*");
		grid1.add(btn8);
		JButton btn9 = new JButton("4");
		grid1.add(btn9);
		JButton btn10 = new JButton("5");
		grid1.add(btn10);
		JButton btn11 = new JButton("6");
		grid1.add(btn11);
		JButton btn12 = new JButton("-");
		grid1.add(btn12);
		JButton btn13 = new JButton("1");
		grid1.add(btn13);
		JButton btn14 = new JButton("2");
		grid1.add(btn14);
		JButton btn15 = new JButton("3");
		grid1.add(btn15);
		JButton btn16 = new JButton("+");
		grid1.add(btn16);
		JButton btn17 = new JButton("��");
		grid1.add(btn17);
		JButton btn18 = new JButton("0");
		grid1.add(btn18);
		JButton btn19 = new JButton(".");
		grid1.add(btn19);
		JButton btn20 = new JButton("=");
		grid1.add(btn20);
		grid1.setPreferredSize(new Dimension(250,270));
		p.add(grid1);
		this.add(p);
	}
	
	
	public static void main(String[] args) {
		Alone a = new Alone();
		
	}
	
}