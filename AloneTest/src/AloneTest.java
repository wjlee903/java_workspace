import java.util.Scanner;

public class AloneTest {

	static void replaceSpace(char a[]) {
		for(int i =0; i <a.length; i++)
			if(a[i] ==' ')
				a[i] = ',';
	}
	static void printCharArray(char a[]) {
		for(int i =0; i<a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}
	
	public static void main(String[] args) {
		char[] c = {'t','h','i','s',' ','i','s',' ','a',' ', 'p','e','n','c','i','l','.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("������ �Է��ϼ���. (0 ~ 100) ");
//		int score = scanner.nextInt();
//		System.out.print("�г��� �Է��㼼��. (1 ~ 4)");
//		int year = scanner.nextInt();
//		
//		if(score > 60) {
//			if(year != 4)
//				System.out.print("����� �հ��Դϴ�.");
//			else if(score >= 70)
//				System.out.print("�հ�!!");
//			else 
//				System.out.print("���հ�!");
//		}
//		else
//			System.out.print("�� ���հ�");
//		
//		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);
//				
//		System.out.print("���� Ŀ�� �帱���? ");
//		String order = scanner.next();
//		int price = 0;
//		
//		switch (order) {
//		case "����������" :
//		case "īǪġ��":
//		case "ī���":
//		case "�ƹٶ�":
//			price = 3500;
//			break;
//		case "�Ƹ޸�ī��":
//			price = 2000;
//			break;
//			default:
//				System.out.println("�޴��� �����ϴ�.");
//		}
//		if (price != 0) {
//			System.out.println("�ֹ��Ͻ� " + order + " �� " + price + "�� �Դϴ�.");
//		}
//		scanner.close();
		

		

			
	}

}
