
class Book {
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
public class BookArray {

	public static void main(String[] args) {
		Book [] book = new Book[2];
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
			System.out.print("Á¦¸ñ>> ");
		}

	}

}
