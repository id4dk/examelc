package threadexam;

public class CallerThread1 {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new WorkerThread();
		t1.run(); // t1.start();
		//������ ������� �������� �ʴ´�. �Ϲ����� �Լ��� ȣ�⿡ �ش�ȴ�
		//��, start�� ���� ������� ȣ���Ű��, run�� ���� �Ϲ����� ȣ��� �ȴ�.
		
		for(int i = 65; i < 65+26; i ++){
			System.out.println("main thread ���� =>" +(char)i);
			Thread.sleep(50);
		}
	}
}


