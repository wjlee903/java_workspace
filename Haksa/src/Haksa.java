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
	
	JMenuItem menuItem1=null; //학생정보
	public Haksa() {
		this.setTitle("학사관리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		JMenuBar mb=new JMenuBar();
		JMenu menu1=new JMenu("학생관리");
		this.menuItem1=new JMenuItem("학생정보");
		menu1.add(this.menuItem1);
		mb.add(menu1);
		this.setJMenuBar(mb);
		
		this.menuItem1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//화면전환. 학생정보화면을 그린다.
				System.out.println("학생정보화면 로딩....");
			}});
		
		
		this.add(new JLabel("학번"));
		this.tfId=new JTextField(25);
		this.add(this.tfId);
		
		this.add(new JLabel("이름"));		
		this.tfName=new JTextField(25);
		this.add(this.tfName);
		
		this.add(new JLabel("학과"));
		this.tfDepartment=new JTextField(25);
		this.add(this.tfDepartment);
		
		this.add(new JLabel("주소"));
		this.tfAddress=new JTextField(25);
		this.add(this.tfAddress);
		
		this.taList=new JTextArea(15,25);
		this.add(new JScrollPane(this.taList));
		
		this.btnSave=new JButton("등록");
		this.add(this.btnSave);
		this.btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("등록");//디버깅용 메시지
				
			}});
		

		this.btnList = new JButton("목록");
		this.add(this.btnList);
		this.btnModify = new JButton("수정");
		this.add(this.btnModify);
		this.btnRemove = new JButton("삭제");
		this.add(this.btnRemove);
		
		this.setSize(300, 550);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Haksa();
	}

}
