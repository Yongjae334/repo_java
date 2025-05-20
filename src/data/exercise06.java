package data;
import java.util.Scanner;


public class exercise06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] student = new String[2][3];
		
		for (int i = 0; i < 2; i++) {
			System.out.print("학생" + (i + 1) + "의 이름:");
			student[i][0] = scanner.nextLine();
			
			System.out.print("학생" + (i + 1) + "의 학과:");
			student[i][1] = scanner.nextLine();
			
			System.out.print("학생" + (i + 1) + "의 학번:");
			student[i][2] = scanner.nextLine();
		}
		for(int i= 0; i < 2; i++) {
			System.out.println("\n학생" + (i + 1));
			for (int j = 0; j < 3; j++) {
				System.out.println(student[i][j]);
			}
		}
		scanner.close();
	}
}