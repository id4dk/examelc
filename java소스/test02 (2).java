package kdk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int student_size = 5;// 학생수
        int subject_size = 3;// 과목 수
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String names[] = new String[student_size];
        String subject[] = new String[] { "국어", "영어", "수학" };
        double scores[][] = new double[student_size][subject_size + 1];// 1:국어,2:영어,3:수학,4:평균
        int rank[] = new int[student_size];
        names = inputName(in, student_size);
        System.out.println("*** 입력 받은 이름 ***");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println(names[i] + "의 점수입력!!");
            for (int j = 0; j < scores[i].length; j++) {
                if (j == subject_size) {
                    double total = 0;
                    for (int z = 0; z < subject_size; z++) {
                        total += scores[i][z];
                    }
                    scores[i][j] = total / subject_size;

                    break;// 
                }
                System.out.print(subject[j] + " > ");
                double score = Double.parseDouble(in.readLine());
                scores[i][j] = score;
            }
        }
}

	private static String[] inputName(BufferedReader in, int student_size) {
		
		return null;
	}
	
}
