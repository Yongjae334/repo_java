package project;

import java.util.Scanner;

public class problem03 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("배열 크기를 실행 인자로 입력하세요.");
            return;
        }

        int size = Integer.parseInt(args[0]); // 문자열을 정수로 바꿔주는 메소드
        int[] array = new int[size];

        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (i < size) {
            System.out.print((i + 1) + "번째 정수 입력: ");
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
                i++;
            } else {
                System.out.println("정수가 아닙니다. 다시 입력하세요.");
                scanner.next(); // 잘못된 입력 제거
            }
        }

        
        System.out.print("입력된 값들: ");
        for (int num : array) {
            System.out.print(num + " ");
        } 
        System.out.println(); // 배열 출력

        
        int max = array[0];
        int min = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) max = array[j];
            if (array[j] < min) min = array[j];
        } // 최댓값과 최솟값

        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);

        scanner.close();
    }
}