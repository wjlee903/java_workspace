
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

	ImageIcon[] image = {        //배열 생성 후 이미지 삽입

			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/pear.jpg"),
			new ImageIcon("images/cherry.jpg"),
	};

	ImageIcon left = new ImageIcon("images/left.jpg");     //좌 우 이미지 삽입
	ImageIcon right = new ImageIcon("images/right.jpg");

	public LeftRight() {
		
		this.setTitle("사진변경");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		imageLabel = new JLabel();
		imageLabel.setIcon(image[index]);       // 이미지 배로 시작
		JPanel jpLR = new JPanel();  //판넬 생성
		JButton btnLeft = new JButton("LEFT", left);  // 왼쪽 이미지 버튼 생성
		JButton btnRight = new JButton("RIGHT", right);  // 오른쪽 이미지 버튼 생성

		btnLeft.addActionListener(new ActionListener() {       // 왼쪽 버튼 액션리스너

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

		btnRight.addActionListener(new ActionListener() {     //오른쪽 버튼 액션리스너

			@Override
			public void actionPerformed(ActionEvent e) {
				if(index == 2) {
					index = image.length-image.length;
				}else {
					index++;
				}
				imageLabel.setIcon(image[index]);
			}});

		jpLR.add(btnLeft,FlowLayout.LEFT);     //좌우 버튼 판넬에 올림
		jpLR.add(btnRight);
		c.add(jpLR, BorderLayout.SOUTH);       // 버튼 판넬 아래쪽 정렬
		c.add(imageLabel, BorderLayout.CENTER);   // 이미지 라벨 센터 정렬
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);  //라벨 내 이미지 가운데 정렬

		setSize(500, 500);
		setVisible(true);

	}

	public static void main(String[] args) {
		new LeftRight();

	}

}
