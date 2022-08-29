class Thread1 extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10000; i++) {
		System.out.println("Thread1");
//		try {
//			//Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		}
		}
	
}

class Thread2 extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10000; i++) {
			System.out.println("Thread2");
//			try {
//				//Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//		}
			}
		}
	}


public class ThreadTest {
	

	public static void main(String[] args) {
		
		Thread1 th1 = new Thread1();
		th1.start();
		
		Thread2 th2 = new Thread2();
		th2.start();
	}

}
