import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		System.out.print(now.get(Calendar.YEAR)+"년 ");
		System.out.print(now.get(Calendar.MONTH)+1+"월 "); //1월이 0 이기 때문에 
		System.out.print(now.get(Calendar.DAY_OF_MONTH)+"일 ");
		System.out.print(now.get(Calendar.HOUR_OF_DAY)+"시 "); //24시간 표기법
		System.out.print(now.get(Calendar.MINUTE)+"분 ");
		System.out.print(now.get(Calendar.SECOND)+"초 ");
//		System.out.print(now.get(Calendar.MILLISECOND)+" ");
//		System.out.print(now.get(Calendar.DAY_OF_WEEK)+" ");

	}

}
