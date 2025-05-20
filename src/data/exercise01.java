package data;

public class exercise01 {

	public static void main(String[] args) {
        
        int[] score = {91, 86, 97};
        char[] grade = {'A', 'B', 'A'};

        System.out.println("\n*** 학년별 취득 학점 ***");

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d학년 : 총점 = %d, 등급 = %c%n", i + 1, score[i], grade[i]);
        }
    }
}
