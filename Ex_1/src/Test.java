
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
//      System.out.print(now.get(Calendar.YEAR)+"�� ");
//      System.out.print(now.get(Calendar.MONTH)+1+"�� "); //1���� 0 �̱� ������ 
//      System.out.print(now.get(Calendar.DAY_OF_MONTH)+"�� ");
//      System.out.print(now.get(Calendar.HOUR_OF_DAY)+"�� "); //24�ð� ǥ���
//      System.out.print(now.get(Calendar.MINUTE)+"�� ");
//      System.out.print(now.get(Calendar.SECOND)+"�� ");
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
//			System.out.println("�̸� ���� ���� ���� ������ �Է��ϼ���. (exit �� �Է��ϸ� ����˴ϴ�.)");
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
//				System.out.println(name + " ���� �����" + ave + "�Դϴ�.");
//				
//
//		}
//		System.out.println("����Ǿ����ϴ�.");
//		scanner.close();
//
//
//	} 
//
//}