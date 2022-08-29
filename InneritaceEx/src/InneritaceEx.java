class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setweight(int weight) {
		this.weight = weight;
	}
	public int getweight() {
		return weight;
	}
}

class Student extends Person {
	public void set() {
		age=30;
		name ="ȫ�浿";
		height = 175;
		setweight(99);
	}
}


public class InneritaceEx {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		System.out.println(s);
	}

}
