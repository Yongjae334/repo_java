package data;

public class exercise07 {
	 public static void main(String[] args) {
	        int i = 10, j = 20;

	        // 변수 값 출력
	        System.out.println("i의 값 = " + i);
	        System.out.println("j의 값 = " + j);

	        // 메모리 주소를 출력하는 기능은 Java에 없음 (참조를 사용해야 함)
	        System.out.println("i의 메모리 주소(참조 아님) = " + System.identityHashCode(i));
	        System.out.println("j의 메모리 주소(참조 아님) = " + System.identityHashCode(j));

	        // 포인터 역할을 하는 참조 변수 선언
	        Integer ptr;

	        ptr = i;
	        System.out.println("\n<< ptr = &i 실행 >>");
	        System.out.println("ptr의 값(ptr) = " + ptr);
	        System.out.println("ptr의 참조값(*ptr) = " + ptr);

	        ptr = j;
	        System.out.println("\n<< ptr = &j 실행 >>");
	        System.out.println("ptr의 값(ptr) = " + ptr);
	        System.out.println("ptr의 참조값(*ptr) = " + ptr);

	        i = ptr;
	        System.out.println("\n<< i = *ptr 실행 >>");
	        System.out.println("i의 값 = " + i);
	    }
	}

