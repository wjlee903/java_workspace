import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("점수를 입력하세요. ");
		
		int score = scanner.nextInt();
		char grade;
		
		switch (score/10) {
			case 10:
			case 9:
			case 8:
			case 7:
				System.out.println("당신은 합격입니다.");
			break;
			default:
				System.out.println("당신은 불합격입니다.");
		}
		scanner.close();

	}

}
