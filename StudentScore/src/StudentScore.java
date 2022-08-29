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
		return ("이름은" +name+" 이고 점수는 각각 " +kor+eng+math+" 점 입니다.");
	}
}


public class StudentScore {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름과 국어 영어 수학 점수를 입력하세요.");
		
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
