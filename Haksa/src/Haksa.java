import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Haksa extends JFrame{
	JTextField tfId=null;  
	JTextField tfName=null;
	JTextField tfDepartment=null;
	JTextField tfAddress=null;
	JTextArea taList=null;
	JButton btnSave=null;  // insert -> Create
	JButton btnList=null;  // select -> Read 
	JButton btnModify=null;// update -> Update
	JButton btnRemove=null;// delete -> Delete
	
	JMenuItem menuItem1=null; //�л�����
	public Haksa() {
		this.setTitle("�л����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		JMenuBar mb=new JMenuBar();
		JMenu menu1=new JMenu("�л�����");
		this.menuItem1=new JMenuItem("�л�����");
		menu1.add(this.menuItem1);
		mb.add(menu1);
		this.setJMenuBar(mb);
		
		this.menuItem1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//ȭ����ȯ. �л�����ȭ���� �׸���.
				System.out.println("�л�����ȭ�� �ε�....");
			}});
		
		
		this.add(new JLabel("�й�"));
		this.tfId=new JTextField(25);
		this.add(this.tfId);
		
		this.add(new JLabel("�̸�"));		
		this.tfName=new JTextField(25);
		this.add(this.tfName);
		
		this.add(new JLabel("�а�"));
		this.tfDepartment=new JTextField(25);
		this.add(this.tfDepartment);
		
		this.add(new JLabel("�ּ�"));
		this.tfAddress=new JTextField(25);
		this.add(this.tfAddress);
		
		this.taList=new JTextArea(15,25);
		this.add(new JScrollPane(this.taList));
		
		this.btnSave=new JButton("���");
		this.add(this.btnSave);
		this.btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���");//������ �޽���
				
			}});
		

		this.btnList = new JButton("���");
		this.add(this.btnList);
		this.btnModify = new JButton("����");
		this.add(this.btnModify);
		this.btnRemove = new JButton("����");
		this.add(this.btnRemove);
		
		this.setSize(300, 550);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Haksa();
	}

}
