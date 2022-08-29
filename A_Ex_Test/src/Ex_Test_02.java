
public class Ex_Test_02 {

	public static void main(String[] args) {

		Tv tv = new Tv();
		tv.channel=7;
		System.out.println(tv.channel);
		tv.channelDown();
		System.out.println(tv.channel);
		
		tv.power();
		System.out.println(tv.power);
	}

}

class Tv{
	String name=null;
	boolean power;
	int channel=0;
	
	public void power() {
		this.power = !power;
	}
	
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
}