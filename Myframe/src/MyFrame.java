import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("300X300 스윙 프레임 만들기");
		this.setSize(300, 300);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();

	}

}
