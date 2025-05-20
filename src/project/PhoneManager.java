package project;
import java.util.InputMismatchException;
import java.util.Scanner;
class Phone {
	String name;
	String tel;
	
	//명시적 생성자
	public Phone(String name,String tel) {
		this.name = name;
		this.tel = tel;
	}
}
	
	public class PhoneManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
	
		System.out.print("인원수>>");
		
		// try catch 로 예외처리 포함
		 try {
	            count = scanner.nextInt();
	            if (count <= 0) {
	                System.out.println("인원 수는 1 이상이어야 합니다. 프로그램을 종료합니다.");
	                scanner.close();
	                return;
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("숫자를 입력해야 합니다. 프로그램을 종료합니다.");
	            scanner.close();
	            return;
	        }
		
		
		
		
		Phone[] phone = new Phone[count];
		
		scanner.nextLine();
		
		for (int i=0; i<count; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			phone[i] = new Phone(name,tel);
		}
		
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.print("검색할 이름>>");
			String name = scanner.next();
			
			if(name.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			boolean found = false; // 아직 못찾았으니 false 로 시작
			//p 라는 이름 사용
			for(Phone p : phone) {
				if(p.name.equals(name)) {
					System.out.println(name + "의 번호는" + p.tel + "입니다.");
					found = true; // 검색 성공
					break; // 검색 종료
				}
				
			
			}
			if (!found) {
				System.out.println(name + "이 없습니다.");
			}
		}
		scanner.close();
		
		
	}

}
