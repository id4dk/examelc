package kdk;

public class PracticeArray {   
    int max;
    public PracticeArray(int max) {
        this.max = max;
    }

    public int sumOf3And5() {
        int sum = 0;
        for(int i=0; i<max; i++) {
            if (i%3 == 0 || i%5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new PracticeArray(10).sumOf3And5());
        System.out.println(new PracticeArray(1000).sumOf3And5());
    }
}