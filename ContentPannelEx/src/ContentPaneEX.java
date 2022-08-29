import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEX extends JFrame {
	public ContentPaneEX () {
		this.setTitle("CoontentPane °ú JFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("ignore"));
		
		setSize(500, 300);
		setVisible(true);
		
		
	} 

	public static void main(String[] args) {
		new ContentPaneEX();
		

	}

}
