package threadexam;

public class Task implements Runnable{
	@Override
	public void run() {
		//������ thread�ν� ������ �ڵ带 ������ָ�ȴ�.
		for(char i = 'A'; i<='Z'; i ++ ){
			System.out.println("Task���� ����Ǵ� ����Դϴ�. =>" + i );
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}