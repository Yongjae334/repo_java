package project;
import java.util.Scanner;
public class problem01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("저장할 양수 개수를 입력하세요:");
		int size = scanner.nextInt();
		int[] numbers = new int[size]; // 배열 생성
		int count = 0; // 저장된 양수 개수
		
		while (count < numbers.length) {
			System.out.print((count + 1) + "번째 정수를 입력하세요:");
			int num = scanner.nextInt();
			
			if(num > 0) {
				numbers[count] = num; // 양수를 배열에 저장
				count++; // 양수 개수 증가
			} else {
				System.out.println("양수만 저장할 수 있습니다!");
				
			}
		}
		
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		System.out.println("가장 큰 수는" + max + "입니다.");
		scanner.close();
	}

}
