package project;
import java.util.Scanner;
public class Dog {
	private String name;
	private int age;
	private String breed;
	
	public Dog(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
		
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void printInfo() {
		System.out.println("이름: " + name + " , 나이:" + age +" , 품종:" + breed);
	}
 	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		
 		System.out.print("등록할 개의 수를 입력하세요:");
 		int n = scanner.nextInt();
 		scanner.nextLine();
 		
 		Dog[] dogs = new Dog[n];
 		
 		for (int i = 0; i<n; i++) {
 			System.out.println("\n[" + (i+1) + "번째 개 정보 입력]");
 			System.out.print("이름: ");
 			String name = scanner.nextLine();
 			
 			System.out.print("나이: ");
 			int age = scanner.nextInt();
 			scanner.nextLine();
 			
 			System.out.print("품종: ");
 			String breed = scanner.nextLine();
 			
 			dogs[i] = new Dog(name, age, breed);
 		}
 		System.out.println("----- 개 정보 -----");
 		for (Dog dog : dogs) {
 			dog.printInfo();
 			
 			
	}
 		scanner.close();

}
 	
 	}
