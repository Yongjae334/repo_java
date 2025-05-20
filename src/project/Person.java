package project;

import java.util.Scanner;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String inputName = scanner.nextLine();

        Person person = new Person(inputName);
        System.out.println("입력된 이름은 : " + person.getName());

        scanner.close();
    }
}