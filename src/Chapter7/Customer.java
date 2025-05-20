// Customer.java
package Chapter7;
public class Customer {
    private String phone;   // 전화번호 (키)
    private String name;    // 고객명
    private int point;      // 포인트 점수

    public Customer(String phone, String name, int point) {
        this.phone = phone;
        this.name = name;
        this.point = point;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    // 기존 포인트에 추가할 때 사용
    public void addPoint(int p) {
        this.point += p;
    }

    @Override
    public String toString() {
        return "전화번호: " + phone + ", 이름: " + name + ", 포인트: " + point;
    }
}

