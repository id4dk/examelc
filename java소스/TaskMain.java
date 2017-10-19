package threadexam;

public class TaskMain {
	public static void main(String[] args) throws InterruptedException {
		//메인 메소드도 독립된 스레드이다.(메인 스레드)
		Runnable runTask = new Task(); // 스레드로 동작할 클래스를 생성한다
		Thread threadTask = new Thread(runTask); // 스레드 생성자의 매개값으로 동작할 클래스를 넘겨준다
		
		threadTask.start(); // start를 써서 Task클래스의 run을 호출시켜줌
		
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i='a'; i <= 'z'; i++){
					System.out.println("익명의 스레드를 생성하였음 =>" + i);
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}  );
		
		thread3.start();
		
		Thread thread4 = new Thread(() ->{
			for(int i = 0; i < 5; i ++){
				System.out.println("람다식을 이용한 스레드 =>"+i);
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} );
		
		thread4.start();
		
		for(int i = 0; i < 10; i++){
			System.out.println(i);
			Thread.sleep(100);
		}
		
	}
}
