import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �ΰ��� �Է����ּ���.");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("������ ����");
		}
		

		
	}

}

