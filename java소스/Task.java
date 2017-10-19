package threadexam;

public class Task implements Runnable{
	@Override
	public void run() {
		//독립된 thread로써 동작할 코드를 기술해주면된다.
		for(char i = 'A'; i<='Z'; i ++ ){
			System.out.println("Task에서 실행되는 결과입니다. =>" + i );
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}