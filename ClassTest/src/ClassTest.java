
public class ClassTest {

	//static �ν��Ͻ��� �������� �ʰ� ����޸𸮿� �÷��д�
	public static void main(String[] args) {
		//Circle Ŭ������ �ν��Ͻ�����
		Circle pizza = new Circle();
		pizza.name = "���¸�����"; //�̸�
		pizza.radius = 20; //������
		double area = pizza.getArea(); //�������ϱ�
		System.out.println(pizza.name + "�� ������" + area);
		
//		Circle pizzanick = pizza;
//		System.out.println(pizzanick.name);
		
		Circle donut = new Circle();
		donut.name = "�ڹٵ���";
		donut.radius = 2;
		area = donut.getArea();
		System.out.println(donut.name + "�� ������" + area);
		
	}
	
}
