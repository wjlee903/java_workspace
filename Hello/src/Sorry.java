import java.util.Scanner;

public class Sorry {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 국어 영어 수학 점수를 입력하세요. ");
		
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
		System.out.println(name + " 님의 평균은" + ave + "입니다.");
		

		

		System.out.println("종료되었습니다.");
		scanner.close();

	}

}
