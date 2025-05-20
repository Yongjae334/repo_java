package project;
import java.util.Scanner;
public class problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] words = new String[5][2]; // 2차원 배열 선언
        boolean enter = false; // 단어입력 완료 여부

        while (true) {
            System.out.println("\n메뉴를 선택하세요:");
            System.out.println("1. 단어입력");
            System.out.println("2. 단어검색");
            System.out.print("입력 (또는 'exit' 입력 시 종료): ");
            String s = scanner.nextLine();

            if (s.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (s) {
                case "1":
                    for (int i = 0; i < words.length; i++) {
                        System.out.print((i + 1) + "번째 영어 단어 입력: ");
                        words[i][0] = scanner.nextLine();
                        System.out.print((i + 1) + "번째 한글 뜻 입력: ");
                        words[i][1] = scanner.nextLine();
                    }
                    enter = true;
                    System.out.println("단어 입력이 완료되었습니다.");
                    break;

                case "2":
                    if (!enter) {
                        System.out.println("먼저 단어를 입력해주세요.");
                        break;
                    }

                    System.out.print("검색할 영어 단어를 입력하세요: ");
                    String search = scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < words.length; i++) {
                        if (search.equals(words[i][0])) {
                            System.out.println("뜻: " + words[i][1]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("단어가 존재하지 않습니다.");
                    }
                    break;

                default:
                    System.out.println("올바른 메뉴 번호를 입력해주세요.");
            }
        }

        scanner.close();
    }
}
