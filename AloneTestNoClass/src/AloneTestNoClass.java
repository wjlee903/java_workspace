
public class AloneTestNoClass {

	public static void main(String[] args) {
		
//		for(int i = 1; i <= 100; i++) {
//			int score = i % 2;
//			if(score == 0)
//				continue;
//			System.out.println(i);
//		} 
		// Ȧ���� ���
		
//		for(int i = 1; i <= 100; i++) {
//			int score = i % 3;
//			if(score != 0)
//				continue;
//			System.out.println(i);
//		} 
		// 3�� ����� ���
		
		int[] intArray = new int[5];
		intArray[0] = 0;
		try {
			for(int i=0; i<5; i++) {
				intArray[i+1] = i+1 + intArray[i];
				System.out.println("intArray[" +i+ "]" + "=" + intArray[i]);
			}
		}
		catch (Exception e) {
			System.out.println("�迭�� ������ �Ѿ����ϴ�.");
		}
		
		
		
		
		

	}

}
