package threadexam;

public class CallerThread {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new WorkerThread();
		t1.start();
		//������ ������� �����Ѵ�.
		
		
		for(int i = 65; i < 65+26; i ++){
			System.out.println("main thread ���� =>" +(char)i);
			Thread.sleep(50);
		}
	}
}
