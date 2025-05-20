package data;

public class exercise09 {

	public static void main(String[] args) {
        
        String[] ptrArray = { "Korea", "Seoul", "Mapo", "152번지 2 / 3" };

       
        for (int i = 0; i < ptrArray.length; i++) {
            System.out.println(ptrArray[i]);
        }

      
        ptrArray[2] = "Jongno";

        System.out.println();

      
        for (int i = 0; i < ptrArray.length; i++) {
            System.out.println(ptrArray[i]);
        }
    }
}
