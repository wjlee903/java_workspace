import java.security.PublicKey;

import javax.swing.AbstractAction;

abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int sub(int a, int b);
	public abstract double ave(int[] a);
}

public class GoodCalculator extends Calculator {

@Override
public int add(int a, int b) {
	return a+b;
}

@Override
public int sub(int a, int b) {
	return a-b;
}

@Override
public double ave(int[] a) {
	double sum = 0;
	for (int i = 0; i<a.length; i++)
		sum += a[i];
	return sum/a.length;
}


	public static void main(String[] args) {
		GoodCalculator c = new GoodCalculator();
		System.out.println(c.add(4,3));
		System.out.println(c.sub(4,3));
		System.out.println(c.ave(new int [] {2,3,4}));
	    

	}

}
