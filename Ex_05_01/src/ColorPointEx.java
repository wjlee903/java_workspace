abstract interface Point {
	   public abstract void set(int x, int y);
	   public abstract void showPoint();
	   public abstract void setColor(String color);
	   public abstract void showColorPoint();

} 

class ColorPoint implements Point{
	
private int x, y;
private String color;

	@Override
	public void set(int x, int y) {
		
		this.x= x; this.y= y;
	}

	@Override
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
}

public class ColorPointEx {

	public static void main(String[] args) {
		ColorPoint p = new ColorPoint();
		
		p.set(2,3);
		p.showPoint();
		
		p.set(3,4);
		p.setColor("red");
		p.showColorPoint();

	}

}
