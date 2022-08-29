
public class ClassTest {

	//static 인스턴스를 생성하지 않고 실행메모리에 올려둔다
	public static void main(String[] args) {
		//Circle 클래스의 인스턴스생성
		Circle pizza = new Circle();
		pizza.name = "이태리피자"; //이름
		pizza.radius = 20; //반지름
		double area = pizza.getArea(); //면적구하기
		System.out.println(pizza.name + "의 면적은" + area);
		
//		Circle pizzanick = pizza;
//		System.out.println(pizzanick.name);
		
		Circle donut = new Circle();
		donut.name = "자바도넛";
		donut.radius = 2;
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은" + area);
		
	}
	
}
