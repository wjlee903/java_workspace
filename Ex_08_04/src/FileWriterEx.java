import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:\\Temp\\test.txt");
			while(true) {
				System.out.println("Enter the word");
				String line = scanner.nextLine();
				if(line.length() == 0)
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0,2);
			}
			fout.close();
		}catch(Exception e) {
			System.out.println("IO error");
		}
		System.out.println("Finish");
		scanner.close();
	}


}


