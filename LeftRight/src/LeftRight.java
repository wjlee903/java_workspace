
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LeftRight extends JFrame {

	JLabel imageLabel;
	int index = 0;

	ImageIcon[] image = {        //�迭 ���� �� �̹��� ����

			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/pear.jpg"),
			new ImageIcon("images/cherry.jpg"),
	};

	ImageIcon left = new ImageIcon("images/left.jpg");     //�� �� �̹��� ����
	ImageIcon right = new ImageIcon("images/right.jpg");

	public LeftRight() {
		
		this.setTitle("��������");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		imageLabel = new JLabel();
		imageLabel.setIcon(image[index]);       // �̹��� ��� ����
		JPanel jpLR = new JPanel();  //�ǳ� ����
		JButton btnLeft = new JButton("LEFT", left);  // ���� �̹��� ��ư ����
		JButton btnRight = new JButton("RIGHT", right);  // ������ �̹��� ��ư ����

		btnLeft.addActionListener(new ActionListener() {       // ���� ��ư �׼Ǹ�����

			@Override
			public void actionPerformed(ActionEvent e) {
				if(index == 0) {
					index = image.length-1;
			} else {
				index--;
			}
				imageLabel.setIcon(image[index]);
			}
		});

		btnRight.addActionListener(new ActionListener() {     //������ ��ư �׼Ǹ�����

			@Override
			public void actionPerformed(ActionEvent e) {
				if(index == 2) {
					index = image.length-image.length;
				}else {
					index++;
				}
				imageLabel.setIcon(image[index]);
			}});

		jpLR.add(btnLeft,FlowLayout.LEFT);     //�¿� ��ư �ǳڿ� �ø�
		jpLR.add(btnRight);
		c.add(jpLR, BorderLayout.SOUTH);       // ��ư �ǳ� �Ʒ��� ����
		c.add(imageLabel, BorderLayout.CENTER);   // �̹��� �� ���� ����
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);  //�� �� �̹��� ��� ����

		setSize(500, 500);
		setVisible(true);

	}

	public static void main(String[] args) {
		new LeftRight();

	}

}
