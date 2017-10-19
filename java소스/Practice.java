package kdk;

public class Practice {
	public static void main(String[] args) {
		//10 미만의 자연수에서 3과 5의 배수를 구하면 3, 5, 6, 9이다. 이들의 총합은 23이다.
		//1000미만의 자연수에서 3, 5의 배수의 총합을 구하라.
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		int result = 0;
		for(int i=1; i < 1000; i++){
			sum = i*3;	
			System.out.println("3의 배수의 값" +sum);
		}
		for(int j=1; j<1000; j++){
			sum2 = j*5;
			System.out.println("5의 배수의 값" + sum2);
		}
		for(int k=3*5; k<1000; k++){
			sum3 = k*15;
		}
		result = sum + sum2 - sum3;
	
		System.out.println("3,5의 배수의 총합 :" + result );
		}
			
	}
		
			


