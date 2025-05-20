package data;

public class exercise {

	public static void main(String[] args) {
        char[] c_array = new char[100];
        int[] i_array = new int[100];
        short[] s_array = new short[100];
        float[] f_array = new float[100];
        long[] l_array = new long[100];

        System.out.println("char c 크기 = " + Character.BYTES + "\t char c_array 크기 = " + (Character.BYTES * c_array.length));
        System.out.println("int i 크기 = " + Integer.BYTES + "\t int i_array 크기 = " + (Integer.BYTES * i_array.length));
        System.out.println("short s 크기 = " + Short.BYTES + "\t short s_array 크기 = " + (Short.BYTES * s_array.length));
        System.out.println("float f 크기 = " + Float.BYTES + "\t float f_array 크기 = " + (Float.BYTES * f_array.length));
        System.out.println("long l 크기 = " + Long.BYTES + "\t long l_array 크기 = " + (Long.BYTES * l_array.length));
    }
}
