//import java.util.Scanner;
//
//public class Student {
//	
//	String name;
//	String korean;
//	String english;
//	String math;
//
//	public double getAve() {
//		return (Double.parseDouble(korean)+Double.parseDouble(english)+Double.parseDouble(math)) / 3;
//	}
//	
//	public static void main(String[] args) {
//		
//		while(true) {
//			
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("exit�� �Է��ϸ� ����˴ϴ�.");
//			System.out.print(">>");
//			String text = scanner.nextLine(); // ��ġ�� ����
//			if(text.equals("exit")) // ��ġ�� ����
//				break; // ��ġ�� ����
//			
//			System.out.println("�̸�, ����, ����, ���� ������ �Է��ϼ���.(exit�� �Է��ϸ� ����˴ϴ�.)");
//			
//			Student aRoom = new Student();
//			aRoom.name = scanner.next();
//			aRoom.korean = scanner.next();
//			aRoom.english = scanner.next();
//			aRoom.math = scanner.next();
//			
//			double ave = aRoom.getAve();
//			
////			System.out.println("�̸��� "+aRoom.name+"�̸� ���������� "+aRoom.korean+"�� ���������� "
////			+aRoom.english+"�� ���������� "+aRoom.math+"�� �Դϴ�.");
//			System.out.println("�̸��� "+aRoom.name+"�̸� �����"+ave+"�� �Դϴ�.");
//			
//		}
//		System.out.println("����Ǿ����ϴ�.");
//
//	}
//
//


import java.util.Scanner;

public class Student {
	
	String name;
	String korean;
	String english;
	String math;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Student[] aRoom = new Student[5];
		
		for(int i=0; i<aRoom.length; i++) {
			aRoom[i] = new Student();
		}
		
		for(int i=0; i<aRoom.length; i++) {
		System.out.println("�̸�, ����, ����, ���� ������ �Է��ϼ���.");
		
		aRoom[i].name = scanner.next();
		aRoom[i].korean = scanner.next();
		aRoom[i].english = scanner.next();
		aRoom[i].math = scanner.next();
		
		}
		System.out.println("�̸��� "+aRoom[0].name+"�̸� ���� "+aRoom[0].korean+"�� ���� "+aRoom[0].english+"�� ���� "+aRoom[0].math+"�� �Դϴ�.");
		System.out.println("�̸��� "+aRoom[1].name+"�̸� ���� "+aRoom[1].korean+"�� ���� "+aRoom[1].english+"�� ���� "+aRoom[1].math+"�� �Դϴ�.");
		System.out.println("�̸��� "+aRoom[2].name+"�̸� ���� "+aRoom[2].korean+"�� ���� "+aRoom[2].english+"�� ���� "+aRoom[2].math+"�� �Դϴ�.");
		System.out.println("�̸��� "+aRoom[3].name+"�̸� ���� "+aRoom[3].korean+"�� ���� "+aRoom[3].english+"�� ���� "+aRoom[3].math+"�� �Դϴ�.");
		System.out.println("�̸��� "+aRoom[4].name+"�̸� ���� "+aRoom[4].korean+"�� ���� "+aRoom[4].english+"�� ���� "+aRoom[4].math+"�� �Դϴ�.");

		System.out.println("�����մϴ�.");
		scanner.close();
	}
	
}

