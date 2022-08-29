import java.util.Scanner;

public class Ex_Test_01 {

	public static void main(String[] args) {

		String[][] str = { { "chair", "의자" }, 
							{ "table", "식탁" }, 
							{ "computer", "컴퓨터" } 
							};

		Scanner scanner = new Scanner(System.in);
		
	for (int i = 0; i < str.length; i++) {
		System.out.printf("Q%d." +str[i][0]+"는?%n",i+1 );
		
		String ans1 = scanner.nextLine();
		
		if (ans1.equals(str[i][1])) {
			System.out.println("정답입니다. 답은 " +str[i][1]+ "입니다.");
		} else {
			System.out.println("틀렸습니다. 답은 " + str[i][1]+"입니다.");
		}
	}	
		
		
		
		
		
		
		
		
	}

}
