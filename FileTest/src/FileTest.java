import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos=null;
		
		try {

			System.out.println(1/1); // ���ܹ߻�!!!
//			System.out.println(4); // �̽���
			
		} catch (Exception ae) {
			try {
			fos = new FileOutputStream("c:\\log\\test.txt", true); // error.log���Ͽ� ��� �غ�
			ps=new PrintStream(fos); // err�� ����� ȭ���� �ƴ�, error.log���Ϸ� ����
			System.setErr(ps);
			System.err.println("-----------------------------------");
			System.err.println("���ܹ߻��ð� : " + new Date());  // ����ð����
			ae.printStackTrace(System.err);
			System.err.println("���ܸ޽��� : " + ae.getMessage());
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
