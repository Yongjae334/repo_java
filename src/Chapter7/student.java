// Student.java
package Chapter7;
public class student {
    // 필드 선언
    private String id;           // 학번
    private String name;         // 이름
    private double attendance;   // 출석 점수
    private double assignment;   // 과제 점수
    private double midterm;      // 중간고사 점수
    private double finalExam;    // 기말고사 점수
    private double total;        // 총점
    private char grade;          // 학점

    // 생성자
    public student(String id, String name,
                   double attendance, double assignment,
                   double midterm, double finalExam) {
        this.id = id;
        this.name = name;
        this.attendance = attendance;
        this.assignment = assignment;
        this.midterm = midterm;
        this.finalExam = finalExam;
        calculate();  // 총점·학점 계산
    }

    // 총점과 학점 계산 메소드
    public void calculate() {
        // 반영 비율: 출석10%, 과제30%, 중간30%, 기말30%
        total = attendance * 0.10
              + assignment * 0.30
              + midterm   * 0.30
              + finalExam * 0.30;
        // 학점 부여
        if (total >= 90)      grade = 'A';
        else if (total >= 80) grade = 'B';
        else if (total >= 70) grade = 'C';
        else if (total >= 60) grade = 'D';
        else                  grade = 'F';
    }

    // getter 메소드들
    public String getId()        { return id; }
    public String getName()      { return name; }
    public double getTotal()     { return total; }
    public char getGrade()       { return grade; }

    @Override
    public String toString() {
        return String.format(
            "학번: %s, 이름: %s, 총점: %.1f, 학점: %c",
            id, name, total, grade
        );
    }
}
