import java.util.Scanner;

public class Ex_Test_01 {

	public static void main(String[] args) {

		String[][] str = { { "chair", "����" }, 
							{ "table", "��Ź" }, 
							{ "computer", "��ǻ��" } 
							};

		Scanner scanner = new Scanner(System.in);
		
	for (int i = 0; i < str.length; i++) {
		System.out.printf("Q%d." +str[i][0]+"��?%n",i+1 );
		
		String ans1 = scanner.nextLine();
		
		if (ans1.equals(str[i][1])) {
			System.out.println("�����Դϴ�. ���� " +str[i][1]+ "�Դϴ�.");
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�. ���� " + str[i][1]+"�Դϴ�.");
		}
	}	
		
		
		
		
		
		
		
		
	}

}
