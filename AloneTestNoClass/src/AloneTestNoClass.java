
public class AloneTestNoClass {

	public static void main(String[] args) {
		
//		for(int i = 1; i <= 100; i++) {
//			int score = i % 2;
//			if(score == 0)
//				continue;
//			System.out.println(i);
//		} 
		// 홀수만 출력
		
//		for(int i = 1; i <= 100; i++) {
//			int score = i % 3;
//			if(score != 0)
//				continue;
//			System.out.println(i);
//		} 
		// 3의 배수만 출력
		
		int[] intArray = new int[5];
		intArray[0] = 0;
		try {
			for(int i=0; i<5; i++) {
				intArray[i+1] = i+1 + intArray[i];
				System.out.println("intArray[" +i+ "]" + "=" + intArray[i]);
			}
		}
		catch (Exception e) {
			System.out.println("배열의 범위를 넘었습니다.");
		}
		
		
		
		
		

	}

}
