package threadexam;

public class WorkerThread extends Thread{
	//독립된 스레드로 동작할수 있는 클래스이다.
	@Override
	public void run(){
		for(int i=100; i < 150; i++){
			System.out.println("Thread클래스를 상속받아서 작성된 thread =>" + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
