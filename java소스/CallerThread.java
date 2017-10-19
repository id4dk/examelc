package threadexam;

public class CallerThread {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new WorkerThread();
		t1.start();
		//독립된 스레드로 동작한다.
		
		
		for(int i = 65; i < 65+26; i ++){
			System.out.println("main thread 내용 =>" +(char)i);
			Thread.sleep(50);
		}
	}
}
