class Person {
	public String name;
	public void speack() {System.out.println("speak");}
	public void eat() {System.out.println("eat");}
	public void walk() {System.out.println("walk");}
	public void sleep() {System.out.println("sleep");}
}

class Student extends Person {
	public void study () {System.out.println("study");}
}

class StudentWorker extends Student {
	public void work() {System.out.println("work");}
}

class Reasercher extends Person {
	public void reaserch() {System.out.println("reaserch");}
}

class Professor extends Reasercher{
	public void teach() {System.out.println("teach");}
}



public class InheritanceTest {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.name ="ȫ�浿";
		System.out.println(p.name);
		Student s= new Student();
		s.name = "�̼���";
		System.out.println(s.name);
		StudentWorker sw= new Studentworker();
		sw.name = "������";
		System.out.println(sw.name);
		Reasercher r = new Reasercher();
		r.name = "�忭��";
		System.out.println(r.name);
		Professor f = new Professor();
		f.name = "�������";
		System.out.println(f.name);
		s.eat();
		f.eat();
		f.teach();
		s.study();

	}

}
