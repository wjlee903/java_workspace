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
//		System.out.print("점수를 입력하세요. (0 ~ 100) ");
//		int score = scanner.nextInt();
//		System.out.print("학년을 입력허세요. (1 ~ 4)");
//		int year = scanner.nextInt();
//		
//		if(score > 60) {
//			if(year != 4)
//				System.out.print("당신은 합격입니다.");
//			else if(score >= 70)
//				System.out.print("합격!!");
//			else 
//				System.out.print("불합격!");
//		}
//		else
//			System.out.print("걍 불합격");
//		
//		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);
//				
//		System.out.print("무슨 커피 드릴까요? ");
//		String order = scanner.next();
//		int price = 0;
//		
//		switch (order) {
//		case "에스프레소" :
//		case "카푸치노":
//		case "카페라떼":
//		case "아바라":
//			price = 3500;
//			break;
//		case "아메리카노":
//			price = 2000;
//			break;
//			default:
//				System.out.println("메뉴에 없습니다.");
//		}
//		if (price != 0) {
//			System.out.println("주문하신 " + order + " 는 " + price + "원 입니다.");
//		}
//		scanner.close();
		

		

			
	}

}
