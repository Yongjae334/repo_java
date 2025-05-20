package data;

public class exercise10 {

	public static void main(String[] args) {
    
        String[] ptrArray = { "Korea", "Seoul" };

       
        String[] ptrptr = ptrArray;

        // ptrArray[0] 정보 출력
        System.out.println("ptrArray[0]의 주소: " + System.identityHashCode(ptrArray[0]));
        System.out.println("ptrArray[0]의 값: " + ptrArray[0]);
        System.out.println("ptrArray[0]의 참조값: " + ptrArray[0].charAt(0));
        System.out.println("ptrArray[0]의 참조 문자열: " + ptrArray[0]);

        System.out.println();

        // ptrArray[1] 정보 출력
        System.out.println("ptrArray[1]의 주소: " + System.identityHashCode(ptrArray[1]));
        System.out.println("ptrArray[1]의 값: " + ptrArray[1]);
        System.out.println("ptrArray[1]의 참조값: " + ptrArray[1].charAt(0));
        System.out.println("ptrArray[1]의 참조 문자열: " + ptrArray[1]);

        System.out.println();

        // ptrptr 정보 출력
        System.out.println("ptrptr의 주소: " + System.identityHashCode(ptrptr));
        System.out.println("ptrptr의 값: " + System.identityHashCode(ptrptr));
        System.out.println("ptrptr의 1차 참조값 (*ptrptr): " + ptrptr[0]);
        System.out.println("ptrptr의 1차 참조값 (*ptrptr)의 첫 글자: " + ptrptr[0].charAt(0));
        System.out.println("ptrptr의 2차 참조값 (**ptrptr): " + ptrptr[0]);

        System.out.println("\n*ptrArray[0]: " + ptrArray[0]);
        System.out.println("*ptrptr: " + ptrptr[0]);
        System.out.println("**ptrArray[1]: " + ptrArray[1]);
        System.out.println("**(ptrptr+1): " + ptrptr[1]);
    }
}