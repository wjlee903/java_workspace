
public class Ex_Test_03 {
	int a, b;
	
	public void printGugudan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d%n",dan,i,dan*i);
		}
	}
	public String setIntro(String name, String school, String hobby) {
		
		String result = "�̸���: "+name+"�̰�, �б��� : "+school+"�̸�, ��̴� : "+hobby+"�Դϴ�.";
		return result;
		
	}
	public int add() {
		int result = this.a + this.b;
		return result;
	}
	
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

	
	public static void main(String[] args) {
		
		int a =5;
		int b =9;
		
		int result = a&b;
		System.out.println(result);
		result = a|b;
		System.out.println(result);
		result = a^b;
		System.out.println(result);
		result = b << 1;
		System.out.println(result);
	
		
		
		

		Ex_Test_03 test = new Ex_Test_03();
		test.a = 5;
		test.b = 2;
//		System.out.println(test.add());
//		System.out.println(test.add(1, 2));
//		System.out.println(test.setIntro("ȫ�浿", "�����", "����"));
//		test.printGugudan(4);
	}

}
