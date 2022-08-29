
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

//public class CalendarEx {

//   public static void main(String[] args) {

public class Test {

	public static void main(String[] args)   {   

		String str = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(str);
		
		
//      Calendar now = Calendar.getInstance();
//      System.out.print(now.get(Calendar.YEAR)+"년 ");
//      System.out.print(now.get(Calendar.MONTH)+1+"월 "); //1월이 0 이기 때문에 
//      System.out.print(now.get(Calendar.DAY_OF_MONTH)+"일 ");
//      System.out.print(now.get(Calendar.HOUR_OF_DAY)+"시 "); //24시간 표기법
//      System.out.print(now.get(Calendar.MINUTE)+"분 ");
//      System.out.print(now.get(Calendar.SECOND)+"초 ");
//      System.out.print(now.get(Calendar.MILLISECOND)+" ");
//      System.out.print(now.get(Calendar.DAY_OF_WEEK)+" ");

   }

}





//import java.util.Scanner;
//
//public class Test {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		while(true) {
//			
//			System.out.println("이름 국어 영어 수학 점수를 입력하세요. (exit 룰 입력하면 종료됩니다.)");
//			
//			String[] intArray = new String[4];
//			
//			String name = scanner.next();
//			double sum = 0;
//			double k;
//			double ave;
//				
//				for(int i=1; i<intArray.length; i++) {
//					intArray[i] = scanner.next();
//					k = Double.parseDouble(intArray[i]);
//					sum += k;
//			
//					String text = scanner.nextLine();
//					if(text.equals("exit")) 
//						break;
//					
//				}
//				
//				ave = (double)sum / (intArray.length -1);
//				System.out.println(name + " 님의 평균은" + ave + "입니다.");
//				
//
//		}
//		System.out.println("종료되었습니다.");
//		scanner.close();
//
//
//	} 
//
//}