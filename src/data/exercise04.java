package data;

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine(); // 문자열 입력 받기
        
        System.out.println("\n입력된 문자열은 \"" + str + "\" 입니다.");
        System.out.println("입력된 문자열의 길이 = " + str.length());

        scanner.close();
    }
}