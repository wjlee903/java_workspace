import java.io.FileWriter;
import java.util.Calendar;
import java.util.Scanner;

public class SaveErrorMeassage {


	//	1. Exception�� �߻��ϸ�, �����޽����� �α�(20180221171420.log)���Ͽ�
	//	����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	//	(���ϸ� : 20190305153010001.log)
	//	(������ : c:\\log)
	//
	//	1/0 �� �׽�Ʈ
	//
	//	catch������ ���Ͽ� �����޽��� ���.
	//	catch(Exception e){
	//		e.getMessage();=> �����޽��� ���ϱ�
	//		�����޽����� ���⼭ �α����Ͽ� ���

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();

		String date = now.get(Calendar.YEAR)+""+(now.get(Calendar.MONTH)+1)+""+
				now.get(Calendar.DAY_OF_MONTH)+""+now.get(Calendar.HOUR_OF_DAY)+""+
				now.get(Calendar.MINUTE)+""+now.get(Calendar.SECOND);
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Please Enter two numbers. a/b ");
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				
				
				try {
					System.out.println(a/b);
		
				}	
				catch(Exception ae) {
					System.out.println("Save in log folder");
					
					try {
						FileWriter fos = new FileWriter("c:\\log\\"+date.class+".log", true);
						fos.write(ae.getMessage());
						fos.close();
					}
					catch(Exception ex){
						
					}
		
			}
				scanner.close();

	}
}

