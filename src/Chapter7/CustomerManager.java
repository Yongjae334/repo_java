// CustomerManager.java
package Chapter7;
import java.util.*;

public class CustomerManager {
    private HashMap<String, Customer> customers = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.print("고객 정보 입력(1), 고객 정보 조회(2), 종료(3) >> ");
            int menu = sc.nextInt();
            sc.nextLine();  // 버퍼 비우기

            switch (menu) {
                case 1:
                    inputCustomer();
                    break;
                case 2:
                    queryCustomer();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 1~3 중에서 선택하세요.");
            }
        }
    }

    // 1) 고객 정보 입력
    private void inputCustomer() {
        System.out.print("전화번호 >> ");
        String phone = sc.nextLine();

        // 이미 등록된 전화번호면 포인트만 추가
        if (customers.containsKey(phone)) {
            System.out.print("추가할 포인트 >> ");
            int p = sc.nextInt();
            sc.nextLine();
            customers.get(phone).addPoint(p);
            System.out.println("기존 고객의 포인트가 추가되었습니다.");
        } else {
            // 신규 고객 등록
            System.out.print("이름 >> ");
            String name = sc.nextLine();
            System.out.print("포인트 >> ");
            int p = sc.nextInt();
            sc.nextLine();

            Customer c = new Customer(phone, name, p);
            customers.put(phone, c);
            System.out.println("신규 고객이 등록되었습니다.");
        }
    }

    // 2) 고객 정보 조회
    private void queryCustomer() {
        System.out.print("조회할 전화번호 >> ");
        String phone = sc.nextLine();

        Customer c = customers.get(phone);
        if (c != null) {
            System.out.println(c);
        } else {
            System.out.println("해당 번호의 고객이 없습니다.");
        }
    }

    public static void main(String[] args) {
        System.out.println("** 포인트 관리 프로그램입니다. **");
        new CustomerManager().run();
    }
}
