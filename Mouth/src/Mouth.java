//2. ���콺 Ŭ������ �����Ͻÿ�.
//���ʹ�ư, �����ʹ�ư, mouseMove()
class MouthBasic {
	public String name;
	public void leftClick() {System.out.println("Left Click");}
	public void rightClick() {System.out.println("Right Click");}
	public void mouthMove() {System.out.println("Mouth Move");}
}
class WheelMouth extends MouthBasic {
	public void wheel() {System.out.println("Scroll Wheel");}
}
class ThreeMouth extends WheelMouth {
	public void ThreeButton() {System.out.println("Add Button");}
}

public class Mouth {

	public static void main(String[] args) {
		
		
		MouthBasic b = new MouthBasic();
		b.name = "���� ���콺";
		System.out.println(b.name);
		b.leftClick();
		
		WheelMouth w = new WheelMouth();
		w.name = "�� ���罺";
		System.out.println(w.name);
		w.wheel();
		w.mouthMove();
		
		ThreeMouth t = new ThreeMouth();
		t.name = "3��ư ���콺";
		System.out.println(t.name);
		t.ThreeButton();
		

	}

}
