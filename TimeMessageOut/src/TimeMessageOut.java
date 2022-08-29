import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Label{
	
	static JLabel la = new JLabel();
	
	public void getDate() {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		la.setText("현재"+year+"년 "+month+"월 "+day+"일 "+hour+"시 "+minute+"분 "+second+"초입니다");
	}
	
}


public class TimeMessageOut extends JFrame {

	public TimeMessageOut() {
		Label label = new Label();
		
		this.setTitle("시간");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		JPanel jp = new JPanel();
		JButton jb1 = new JButton("버튼");
		jb1.addActionListener(new MyMouseListenerOut());
		c.setLayout(new BorderLayout(50,20));
		jp.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		jp.add(jb1);
		c.add((jp),BorderLayout.CENTER);
		
		label.getDate();
		c.add((label.la),BorderLayout.NORTH);

		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TimeMessageOut();

	}

}

class MyMouseListenerOut implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Label lal = new Label();
		lal.getDate();
		
	}
	
}

