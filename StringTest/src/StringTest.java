
public class StringTest {

	public static void main(String[] args) {
		String tel = "010-1234-5678";
		
		System.out.println(tel.replace("-","."));
		System.out.println(tel);  //원본은 그대로다
		
//		System.out.println(tel.substring(0,2)); //0,1 두개만
		System.out.println(tel.substring(0,3)); //0,1,2 세개
		
		String[] result=tel.split("-"); //구분자 , delimiter, 나누다, 쪼개다
		for(String s:result) {
			System.out.println(s);
		}
			String csv = "홍길동,컴퓨터공학과,서울시";
			String[] result2=csv.split(",");
			for(String s2:result2) {
				System.out.println(s2);
			}
				String fileName="report.html";
				int position = fileName.indexOf(".");
				System.out.println(position);
				System.out.println(fileName.substring(position+1));
				
				String movieFileName="2022.02.09.movie.mp4";
				System.out.println(movieFileName.substring(movieFileName.indexOf(".")+1));
				System.out.println(movieFileName.substring(movieFileName.lastIndexOf(".")+1));
				//마지막 점 뒤를 구해줄수 있음

	}

}
