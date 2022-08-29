import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 int intarray[] = new int[5];
		 int max = 0;
		 System.out.println("양수를 입력하세요. ");
		 for(int i =0; i<5; i++) {
			 intarray[i] = scanner.nextInt();
			 if(intarray[i] > max)
				 max = intarray[i];
		 }
		 System.out.println("가장 큰수는" + max + "입니다.");
		 
		 scanner.close();
	}

}
