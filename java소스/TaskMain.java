package threadexam;

public class TaskMain {
	public static void main(String[] args) throws InterruptedException {
		//���� �޼ҵ嵵 ������ �������̴�.(���� ������)
		Runnable runTask = new Task(); // ������� ������ Ŭ������ �����Ѵ�
		Thread threadTask = new Thread(runTask); // ������ �������� �Ű������� ������ Ŭ������ �Ѱ��ش�
		
		threadTask.start(); // start�� �Ἥ TaskŬ������ run�� ȣ�������
		
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i='a'; i <= 'z'; i++){
					System.out.println("�͸��� �����带 �����Ͽ��� =>" + i);
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
				System.out.println("���ٽ��� �̿��� ������ =>"+i);
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
