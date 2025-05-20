// ScoreManager.java
package Chapter7;
import java.util.*;

public class ScoreManager {
    private ArrayList<student> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("** 성적 처리 프로그램입니다. **");
        new ScoreManager().run();
    }

    // 메뉴 루프
    private void run() {
        while (true) {
            System.out.print("성적 입력(1), 개인 성적 조회(2), 전체 성적 조회(3), 개인 성적 삭제(4), 종료(5) >> ");
            int menu = sc.nextInt();
            sc.nextLine();  // 버퍼 비우기

            switch (menu) {
                case 1: inputStudent();    break;
                case 2: viewStudent();     break;
                case 3: viewAll();         break;
                case 4: deleteStudent();   break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 1~5 중 하나를 입력하세요.");
            }
        }
    }

    // 1) 성적 입력
    private void inputStudent() {
        System.out.print("학번 >> ");
        String id = sc.nextLine();
        System.out.print("이름 >> ");
        String name = sc.nextLine();
        System.out.print("출석점수 >> ");
        double att = sc.nextDouble();
        System.out.print("과제점수 >> ");
        double asg = sc.nextDouble();
        System.out.print("중간고사 >> ");
        double mid = sc.nextDouble();
        System.out.print("기말고사 >> ");
        double fin = sc.nextDouble();
        sc.nextLine();

        student s = new student(id, name, att, asg, mid, fin);
        list.add(s);
        System.out.println("등록 완료: " + s);
    }

    // 2) 개인 성적 조회
    private void viewStudent() {
        System.out.print("조회할 학번 >> ");
        String id = sc.nextLine();
        for (student s : list) {
            if (s.getId().equals(id)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("해당 학번의 학생이 없습니다.");
    }

    // 3) 전체 성적 조회 (+평균, 최고, 최저)
    private void viewAll() {
        if (list.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        double sum = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        System.out.println("=== 전체 성적 ===");
        for (student s : list) {
            double t = s.getTotal();
            sum += t;
            if (t > max) max = t;
            if (t < min) min = t;
            System.out.println(s);
        }
        double avg = sum / list.size();
        System.out.printf("평균: %.2f, 최고: %.1f, 최저: %.1f%n", avg, max, min);
    }

    // 4) 개인 성적 삭제
    private void deleteStudent() {
        System.out.print("삭제할 학번 >> ");
        String id = sc.nextLine();
        Iterator<student> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getId().equals(id)) {
                it.remove();
                System.out.println("삭제되었습니다.");
                return;
            }
        }
        System.out.println("해당 학번의 학생이 없습니다.");
    }
}
