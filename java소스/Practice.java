package kdk;

public class Practice {
	public static void main(String[] args) {
		//10 �̸��� �ڿ������� 3�� 5�� ����� ���ϸ� 3, 5, 6, 9�̴�. �̵��� ������ 23�̴�.
		//1000�̸��� �ڿ������� 3, 5�� ����� ������ ���϶�.
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		int result = 0;
		for(int i=1; i < 1000; i++){
			sum = i*3;	
			System.out.println("3�� ����� ��" +sum);
		}
		for(int j=1; j<1000; j++){
			sum2 = j*5;
			System.out.println("5�� ����� ��" + sum2);
		}
		for(int k=3*5; k<1000; k++){
			sum3 = k*15;
		}
		result = sum + sum2 - sum3;
	
		System.out.println("3,5�� ����� ���� :" + result );
		}
			
	}
		
			


