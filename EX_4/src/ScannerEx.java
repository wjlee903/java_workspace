import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// 컨트롤 + 시프트 + O(영어) -> import 생성
		System.out.println("이름, 도시, 이름, 체중, 독신여부를 빈칸으로 분리하여 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("이름은 " + name + ", ");
		
		String city = scanner.next();
		System.out.print("도시는 " + city + ", ");
		
		int age = scanner.nextInt();
		System.out.print("나이는 " + age + "살, ");
		
		double weight = scanner.nextDouble();
		System.out.print("체중은 " + weight + "Kg, ");
		
		boolean isSingle = scanner.nextBoolean();
		System.out.println("독신여부는 " + isSingle + "입니다.");
		
		scanner.close();


	}

}
