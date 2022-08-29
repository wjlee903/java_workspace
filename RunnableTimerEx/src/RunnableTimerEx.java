import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;


class TimerRunnable implements Runnable {
	
	public String getNowDate() {
	Calendar now = Calendar.getInstance();
	int year = now.get(Calendar.YEAR);
	int month = now.get(Calendar.MONTH)+1;
	int day = now.get(Calendar.DAY_OF_MONTH);
	int hour = now.get(Calendar.HOUR_OF_DAY);
	int minute = now.get(Calendar.MINUTE);
	int second = now.get(Calendar.SECOND);
	String date = "현재"+year+"년 "+month+"월 "+day+"일 "+hour+"시 "+minute+"분 "+second+"초입니다";
	
		return date;
	}
	
	private JLabel timerLabel;

	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		while (true) {
			timerLabel.setText(getNowDate());
			
			try {
				Thread.sleep(1000);
			} 
			catch (Exception e) {
				return;

			}
		}

	}}

public class RunnableTimerEx extends JFrame{

	public RunnableTimerEx() {
		this.setTitle("timer");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 20));
		c.add(timerLabel);

		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);

		setSize(470, 150);
		setVisible(true);

		th.start();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RunnableTimerEx();
		
		
	}

}
