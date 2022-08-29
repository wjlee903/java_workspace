package logic;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		int[][] arr2 = {
							{10, 20, 30}
						   ,{40, 50, 60}
		};
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2));
	}

}
