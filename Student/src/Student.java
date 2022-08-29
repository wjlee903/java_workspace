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
//			System.out.println("exit를 입력하면 종료됩니다.");
//			System.out.print(">>");
//			String text = scanner.nextLine(); // 위치가 어디냐
//			if(text.equals("exit")) // 위치가 어디냐
//				break; // 위치가 어디냐
//			
//			System.out.println("이름, 국어, 영어, 수학 점수를 입력하세요.(exit를 입력하면 종료됩니다.)");
//			
//			Student aRoom = new Student();
//			aRoom.name = scanner.next();
//			aRoom.korean = scanner.next();
//			aRoom.english = scanner.next();
//			aRoom.math = scanner.next();
//			
//			double ave = aRoom.getAve();
//			
////			System.out.println("이름은 "+aRoom.name+"이며 국어점수는 "+aRoom.korean+"점 영어점수는 "
////			+aRoom.english+"점 수학점수는 "+aRoom.math+"점 입니다.");
//			System.out.println("이름은 "+aRoom.name+"이며 평균은"+ave+"점 입니다.");
//			
//		}
//		System.out.println("종료되었습니다.");
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
		System.out.println("이름, 국어, 영어, 수학 점수를 입력하세요.");
		
		aRoom[i].name = scanner.next();
		aRoom[i].korean = scanner.next();
		aRoom[i].english = scanner.next();
		aRoom[i].math = scanner.next();
		
		}
		System.out.println("이름은 "+aRoom[0].name+"이며 국어 "+aRoom[0].korean+"점 영어 "+aRoom[0].english+"점 수학 "+aRoom[0].math+"점 입니다.");
		System.out.println("이름은 "+aRoom[1].name+"이며 국어 "+aRoom[1].korean+"점 영어 "+aRoom[1].english+"점 수학 "+aRoom[1].math+"점 입니다.");
		System.out.println("이름은 "+aRoom[2].name+"이며 국어 "+aRoom[2].korean+"점 영어 "+aRoom[2].english+"점 수학 "+aRoom[2].math+"점 입니다.");
		System.out.println("이름은 "+aRoom[3].name+"이며 국어 "+aRoom[3].korean+"점 영어 "+aRoom[3].english+"점 수학 "+aRoom[3].math+"점 입니다.");
		System.out.println("이름은 "+aRoom[4].name+"이며 국어 "+aRoom[4].korean+"점 영어 "+aRoom[4].english+"점 수학 "+aRoom[4].math+"점 입니다.");

		System.out.println("종료합니다.");
		scanner.close();
	}
	
}

