import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {
	//1~9 난수 생성해주는 Fun
	private static int[] GetNumber() {
		int[] num = new int[3];
		Random rd = new Random();
		
		for(int i = 0; i < num.length;i++) {
			num[i] = rd.nextInt(10);
			
			if(num[i]==0) {
				i--;
			}else 
			{
				for(int j = i-1; j>-1; j--) {
					if(num[i]==num[j]) {
						i--;
						j=0;
					}
				}				
			}
		}
		
//		for (int j = 0; j < 3; j++) {
//			num[j] = (int)(rd.nextInt(9));
//			if(num[0] == 0) {
//				while(true) {
//					num[0] = rd.nextInt(9);
//					if(num[0] != 0) 
//						break;
//				}
//			}
//			if(num[1] == num[0]  || num[1] == 0) {
//				while(true) {
//					num[1] = rd.nextInt(9);
//					if(num[1] != num[0] && num[1] != 0) 
//						break;
//				}
//			}
//			if(num[2] == num[0] || num[2] == num[1] || num[2] == 0) {
//				while(true) {
//					num[2] = rd.nextInt(9);
//					if(num[2] != num[0] && num[2] != num[1] && num[2] != 0) 
//						break;
//				}
//
//			}
//		}
		
		return num;
	}

	
	public static void main(String[] args) {
		int[] randomNum = new int[3]; 
		
		int one;
		int two;
		int three;
		int sum = 0;
		//계속반복
		while(true) {	
			Scanner scanner = new Scanner(System.in);
			
			//1~9 까지의 난수 생성
			randomNum = GetNumber();
			System.out.println(randomNum[0]+ " " + randomNum[1] + " " + randomNum[2]);

			while(true) {

				int str = 0;
				int ball = 0;
				int out = 0;

				System.out.println(" Enter 3 numbers from 1 to 9 in a space. >>");
				one = scanner.nextInt();
				//			System.out.println("첫번째 숫자를 입력하세요. >>");
				two = scanner.nextInt();
				//			System.out.println("첫번째 숫자를 입력하세요. >>");
				three = scanner.nextInt();

				if (one == randomNum[0]) {
					str++;
					//				System.out.print("스트라이크");
				}
				else if(one == randomNum[1] || one == randomNum[2]) {
					ball++;
					//				System.out.print("볼");
				}
				else if(one != randomNum[0] && one !=  randomNum[1] && one != randomNum[2]) { 
					out++;
					//				System.out.print("아웃");
				}
				if (two == randomNum[1]) {
					str++;
					//				System.out.print("  스트라이크");
				}
				else if(two == randomNum[0] ||two ==  randomNum[2]) {
					ball++;
					//				System.out.print("  볼");
				}
				else if(two != randomNum[0] && two !=  randomNum[1] && two != randomNum[2]) { 
					out++;
					//				System.out.print("  아웃");
				}
				if (three == randomNum[2]) { 
					str++;
					//				System.out.println("  스트라이크");
				}
				else if(three == randomNum[0] || three == randomNum[1]) {
					ball++;
					//				System.out.println("  볼");
				}
				else if(three != randomNum[0] && three !=  randomNum[1] && three != randomNum[2]) { 
					out++;
					//				System.out.println("  아웃");
				}
				System.out.println(str+" Strike  "+ball+" Ball  "+out+" Out");
				sum++;
				if (randomNum[0] == one && randomNum[1] == two && randomNum[2] == three) {
					break;
				}

			}
			System.out.println("The number of successes. : " + sum);
			System.out.println("Congratulations!.");

			System.out.println("Do you want to do more? Enter it(Continue : go, Finish : exit)");
			String exit = scanner.next();
			if (exit.equals("exit")) {
				break;
			}
			else if(exit.equals("go")) {
				continue;
			}
			scanner.close();
		}
		System.out.println("To Finish");

	}

}




