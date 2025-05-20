package data;
import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 사용자 입력
        System.out.print("\n정수를 입력하세요: ");
        int n = scanner.nextInt();
        
        // 팩토리얼 계산
        long result = fact(n);
        
        // 결과 출력
        System.out.println("\n" + n + "의 팩토리얼 값은 " + result + "입니다.");
        
        scanner.close();
    }

   
    public static long fact(int n) {
        if (n <= 1) {
            System.out.println("\nfact(1) 함수 호출!");
            System.out.println("\nfact(1) 값 1 반환!!");
            return 1;
        } else {
            System.out.println("\nfact(" + n + ") 함수 호출!");
            long value = n * fact(n - 1);
            System.out.println("\nfact(" + n + ") 값 " + value + " 반환!!");
            return value;
        }
    }
}
