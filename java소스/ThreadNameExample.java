package threadexam;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread;
		System.out.println("���α׷� ���� ������ �̸� : " + Thread.currentThread().getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸� :" + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸�: " +threadB.getName());
		threadB.start();
	}
}
