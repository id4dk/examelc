package threadexam;

public class WorkerThread extends Thread{
	//������ ������� �����Ҽ� �ִ� Ŭ�����̴�.
	@Override
	public void run(){
		for(int i=100; i < 150; i++){
			System.out.println("ThreadŬ������ ��ӹ޾Ƽ� �ۼ��� thread =>" + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
