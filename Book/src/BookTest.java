import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BookTest {

	
	public static void main(String[] args) {
		ArrayList<String> question = new ArrayList<String>();
		HashMap<String, String> book = new HashMap<String, String>();
		
		question.add("Please enter the title(ex- title (blank) enter the title)");
		question.add("Please enter the author(ex- title (blank) enter the author)");
		question.add("Please enter the company(ex- title (blank) enter the company)");
		question.add("Please enter the price(ex- title (blank) enter the price)");

		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.println(question.get(i));
			String b = scanner.next();
			String c = scanner.next();
			book.put(b,c);
		}
		while(true) {
			System.out.println("What do you want?");
			String key = scanner.next();
			if(key.equals("exit")) {
				System.out.println("Bye");
				break;
			}
			String value = book.get(key);
			if(value == null)
				System.out.println("Notthing");
			else
				System.out.println(value);
		}
		scanner.close();
		
		
			
	}
}
