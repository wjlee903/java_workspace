import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		System.out.print(now.get(Calendar.YEAR)+"�� ");
		System.out.print(now.get(Calendar.MONTH)+1+"�� "); //1���� 0 �̱� ������ 
		System.out.print(now.get(Calendar.DAY_OF_MONTH)+"�� ");
		System.out.print(now.get(Calendar.HOUR_OF_DAY)+"�� "); //24�ð� ǥ���
		System.out.print(now.get(Calendar.MINUTE)+"�� ");
		System.out.print(now.get(Calendar.SECOND)+"�� ");
//		System.out.print(now.get(Calendar.MILLISECOND)+" ");
//		System.out.print(now.get(Calendar.DAY_OF_WEEK)+" ");

	}

}
