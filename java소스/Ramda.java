package threadexam;

public class Ramda {
	public static void main(String[] args) {
		
	
	Thread thread3 = new Thread(() -> {

			for(int i='a'; i <= 'z'; i++){
				System.out.println("익명의 스레드를 생성하였음 =>" + i);
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		
} ) ;
}
}