import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("������ �Է��ϼ���. 0 ~ 100 ");
		
		int score = scanner.nextInt();
		char grade;
		
		if (score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println("����� ������ " + grade + " �Դϴ�.");
		scanner.close();
		
//		if((score >= 90) || (score <= 80)) {
//			grade = 'a';
//		}else {
//			grade = 'b';
//		}
//		System.out.println("����� ������ " + grade + " �Դϴ�.");
//		scanner.close();

	}

}
