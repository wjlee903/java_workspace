import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// ��Ʈ�� + ����Ʈ + O(����) -> import ����
		System.out.println("�̸�, ����, �̸�, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("�̸��� " + name + ", ");
		
		String city = scanner.next();
		System.out.print("���ô� " + city + ", ");
		
		int age = scanner.nextInt();
		System.out.print("���̴� " + age + "��, ");
		
		double weight = scanner.nextDouble();
		System.out.print("ü���� " + weight + "Kg, ");
		
		boolean isSingle = scanner.nextBoolean();
		System.out.println("���ſ��δ� " + isSingle + "�Դϴ�.");
		
		scanner.close();


	}

}
