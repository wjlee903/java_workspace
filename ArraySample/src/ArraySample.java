import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 int intarray[] = new int[5];
		 int max = 0;
		 System.out.println("����� �Է��ϼ���. ");
		 for(int i =0; i<5; i++) {
			 intarray[i] = scanner.nextInt();
			 if(intarray[i] > max)
				 max = intarray[i];
		 }
		 System.out.println("���� ū����" + max + "�Դϴ�.");
		 
		 scanner.close();
	}

}
