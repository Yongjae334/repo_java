package data;

public class exercise05 {
	public static void main(String[] args) {
        int[][][] array = new int[2][3][4]; // 3차원 배열 선언
        int value = 1;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    array[i][j][k] = value;
                    System.out.printf("array[%d][%d][%d] = %d%n", i, j, k, array[i][j][k]);
                    value++;
                }
            }
        }
    }
}
