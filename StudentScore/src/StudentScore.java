import java.util.Scanner;

class Student {
	String name;
	String kor;
	String eng;
	String math;
	
	public Student(String name) {
		this.name = name;
	}
	public Student(String kor) {
		this.kor = kor;
	}
	public Student(String eng) {
		this.eng = eng;
	}
	public Student(String math) {
		this.math = math;
	}
	public String getScore() {
		return ("�̸���" +name+" �̰� ������ ���� " +kor+eng+math+" �� �Դϴ�.");
	}
}


public class StudentScore {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸��� ���� ���� ���� ������ �Է��ϼ���.");
		
		Student [] score = new Student[5];
		
		for(int i = 0; i<score.length; i++) {
			score[i] = new Student(i);
		s[i].name = scanner.next();
		s[i].kor = scanner.next();
		s[i].eng = scanner.next();
		s[i].math = scanner.next();
		
		System.out.println(s[i].getScore());
		}
		scanner.close();

	}

}
