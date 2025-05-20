package data;

public class exercise13 {
    // 하노이 탑 재귀 함수
    public static void hanoi(int n, char start, char work, char target) {
        if (n == 1) {
            System.out.printf("%c에서 원반 %d를(을) %c로 옮김\n", start, n, target);
        } else {
            hanoi(n - 1, start, target, work);
            System.out.printf("%c에서 원반 %d를(을) %c로 옮김\n", start, n, target);
            hanoi(n - 1, work, start, target);
        }
    }

    public static void main(String[] args) {
        // 하노이의 탑 실행 (3개의 원반)
        hanoi(3, 'A', 'B', 'C');
    }
}