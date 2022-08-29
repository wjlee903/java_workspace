import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos=null;
		
		try {

			System.out.println(1/1); // 예외발생!!!
//			System.out.println(4); // 미실행
			
		} catch (Exception ae) {
			try {
			fos = new FileOutputStream("c:\\log\\test.txt", true); // error.log파일에 출력 준비
			ps=new PrintStream(fos); // err의 출력을 화면이 아닌, error.log파일로 변경
			System.setErr(ps);
			System.err.println("-----------------------------------");
			System.err.println("예외발생시간 : " + new Date());  // 현재시간출력
			ae.printStackTrace(System.err);
			System.err.println("예외메시지 : " + ae.getMessage());
			System.err.println("-------z`----------------------------");
			
			fos.close();
			ps.close();
			}
			catch(Exception af) {
				
			}
			finally {
				
			}
		}
		


	}

}
