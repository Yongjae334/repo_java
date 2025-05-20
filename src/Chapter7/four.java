package Chapter7;
import java.util.*;
// 몸무게를 추가하여 입력하여 HashMap에 저장 가장 키가 많이 자란 연도와 BMI가 가장 큰 연도를 출력 
// Iterator<E> 사용

public class four {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 키를 저장할 벡터 생성
        Vector<Float> height = new Vector<Float>();
        // 몸무게를 저장할 해시맵
        HashMap<Integer, Float> weight = new HashMap<Integer, Float>();

        System.out.println("2000~2009년까지의 키(cm)와 몸무게(kg)를 입력하세요>>");
       
        
        // 2000년부터 2009년까지 키와 몸무게를 for 문으로 키와 몸무게를 입력받아 저장
        for (int i = 0; i < 10; i++) {
            System.out.print((2000 + i) + "년 키(cm): ");
            float h = sc.nextFloat(); // 키 입력
            height.add(h); // 벡터에 저장

            System.out.print((2000 + i) + "년 몸무게(kg): ");
            float w = sc.nextFloat(); // 몸무게 입력
            weight.put(2000 + i, w); // 해시맵에 저장
        }

        
        
        // 키가 가장 많이 자란 연도 구하기
        float max_growth = -1000000000; // 성장량 최대값 초기화
        int max_idx = -1; // 최대 성장 연도 인덱스
        // 성장량 계산 (다음 해 - 현재 해)
        for (int i = 0; i < 9; i++) {
            float growth = height.get(i + 1) - height.get(i);
            if (growth > max_growth) {
                max_growth = growth; 
                max_idx = i;  // 가장 많이 자란 연도의 인덱스 저장
            }
        }

        
        
        // BMI가 가장 큰 연도 구하기
        float max_bmi = -1; // 최대 BMI 값 초기화
        int max_bmi_year = -1; // 최대 BMI 연도
        
        // Iterator 를 사용하여 HashMap 순회
        Iterator<Map.Entry<Integer, Float>> it = weight.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Float> entry = it.next();
            int year = entry.getKey(); // 연도
            float w = entry.getValue(); // 몸무게
            float h_cm = height.get(year - 2000);
            float h_m = h_cm / 100.0f; // 키를 m 로 변환
            float bmi = w / (h_m * h_m); // BMI 계산(체중/키^2)
            if (bmi > max_bmi) {
                max_bmi = bmi;
                max_bmi_year = year; // BMI가 가장 큰 연도 저장
            }
        }

        System.out.println("가장 많이 키가 자란 연도는 " + (2000 + max_idx) + "년 " + max_growth + "cm");
        System.out.println("BMI가 가장 높은 연도는 " + max_bmi_year + "년 " + max_bmi);

        sc.close();
    }
}
