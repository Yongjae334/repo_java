package data;
import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] multiply = new int[9];

        // 사용자 입력
        System.out.print("1~9의 정수를 입력하세요: ");
        
        while (true) {
            n = scanner.nextInt();
            if (n < 1 || n > 9) {
                System.out.print("\n1~9의 정수를 입력하세요: ");
            } else {
                break;
            }
        }

        System.out.println();

        // 구구단 계산 및 출력
        for (int i = 0; i < 9; i++) {
            multiply[i] = n * (i + 1);
            System.out.printf("%d * %d = %d\n", n, i + 1, multiply[i]);
        }

        scanner.close();
    }
}