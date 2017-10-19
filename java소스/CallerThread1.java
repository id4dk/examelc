package threadexam;

public class CallerThread1 {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new WorkerThread();
		t1.run(); // t1.start();
		//독립된 스레드로 동작하지 않는다. 일반적인 함수의 호출에 해당된다
		//즉, start를 쓰면 쓰레드로 호출시키고, run을 쓰면 일반적인 호출로 된다.
		
		for(int i = 65; i < 65+26; i ++){
			System.out.println("main thread 내용 =>" +(char)i);
			Thread.sleep(50);
		}
	}
}


