
public class CircleArea {
	static void replaceSpace(char a[]) {
		for(int i =0; i <a.length; i++)
			if(a[i] ==' ')
				a[i] = ',';
	}
	static void printCharArray(char a[]) {
		for(int i =0; i<a.length; i++)
			System.out.println(a[i]);
		System.out.print();
	}
	public static void main(String[] args) {
		

			char[] c = {'t','h','i','s',' ','i','s',' ','a',' ', 'p','e','n','c','i','l','.'};
			printCharArray(c);
			replaceSpace(c);
			printCharArray(c);

	}

}
