import java.util.Scanner;

public class Sorry {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸� ���� ���� ���� ������ �Է��ϼ���. ");
		
		int[] intArray = new int[3];
		
		String name = scanner.next();
		double sum =0;
		int k;
		double ave;
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			k = intArray[i];
			sum += k;
		}
		ave = (double)sum / intArray.length;
		System.out.println(name + " ���� �����" + ave + "�Դϴ�.");
		

		

		System.out.println("����Ǿ����ϴ�.");
		scanner.close();

	}

}
