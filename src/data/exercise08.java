package data;

public class exercise08 {
	  public static void main(String[] args) {
	        char[] string1 = "Dreams come true!".toCharArray(); // 문자열을 char 배열로
	        char[] string2 = new char[20];

	       
	        char[] ptr1 = string1;
	        char[] ptr2 = new char[20];

	        
	        System.out.println("string1의 주소 = " + System.identityHashCode(string1));
	        System.out.println("ptr1의 주소 = " + System.identityHashCode(ptr1));

	        System.out.println("\nstring1 = " + new String(string1));

	      
	        System.arraycopy(string1, 7, ptr2, 0, string1.length - 7);
	        System.out.println("ptr2 = " + new String(ptr2).trim());

	       
	        System.out.print("\n");
	        for (int i = string1.length - 1; i >= 0; i--) {
	            System.out.print(string1[i]);
	        }
	        System.out.println();

	        // string1을 string2로 복사
	        System.arraycopy(string1, 0, string2, 0, string1.length);
	        System.out.println("\nstring1 = " + new String(string1));
	        System.out.println("string2 = " + new String(string2).trim());

	        // string1의 일부 문자 변경
	        string1[0] = 'P';
	        string1[1] = 'e';
	        string1[2] = 'a';
	        string1[3] = 'c';
	        string1[4] = 'e';

	        System.out.println("\nstring1 = " + new String(string1));
	    }
	}