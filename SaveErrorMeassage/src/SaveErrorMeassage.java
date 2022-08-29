import java.io.FileWriter;
import java.util.Calendar;
import java.util.Scanner;

public class SaveErrorMeassage {


	//	1. Exception이 발생하면, 에러메시지를 로그(20180221171420.log)파일에
	//	기록하는 프로그램을 작성하시오.
	//	(파일명 : 20190305153010001.log)
	//	(저장경로 : c:\\log)
	//
	//	1/0 로 테스트
	//
	//	catch블럭에서 파일에 에러메시지 기록.
	//	catch(Exception e){
	//		e.getMessage();=> 에러메시지 구하기
	//		에러메시지를 여기서 로그파일에 기록

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

