import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestBook {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("come");
		int num = scanner.nextInt();
		
		int[] a = new int[num];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)((Math.random()*100)+1);
			for (int j = 0; j < i; j++) {
				if(a[i] == a[j]) {
					i--;
				}else {
					continue;
				}
			}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(a.length);
		
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(a.length);
		
		
		
		
		
		
		
		
	}

}
