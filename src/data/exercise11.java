package data;
class Employee {
    String name;
    int year;
    int pay;

    // 생성자
    Employee(String name, int year, int pay) {
        this.name = name;
        this.year = year;
        this.pay = pay;
    }
}

public class exercise11 {
    public static void main(String[] args) {
        
        Employee[] Lee = {
            new Employee("이진호", 2022, 5200),
            new Employee("이한영", 2023, 4300),
            new Employee("이상원", 2023, 4500),
            new Employee("이상범", 2024, 3900)
        };

        
        for (int i = 0; i < Lee.length; i++) {
            System.out.println("\n이름: " + Lee[i].name);
            System.out.println("입사: " + Lee[i].year);
            System.out.println("연봉: " + Lee[i].pay);
        }
    }
}