package kdk;

public class PracticeArray02 {
	public static void main(String [] ar){
		int aa = 3;
		int bb = 5;
		int sum = 0;
		int max = 1000;
		
		for (int i=1; i<max ; i++){
			if(i%aa == 0 || i%bb ==0){
				sum = sum+i;
			System.out.println(i);
			}
		}
		System.out.println(sum);
	}

}
