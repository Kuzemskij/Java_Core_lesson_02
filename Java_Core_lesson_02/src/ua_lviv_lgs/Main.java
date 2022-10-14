package ua_lviv_lgs;

public class Main {

	public static void main(String[] args) {

//		boolean q = true;
//		int w = 4;
//		byte e = 1;
//		short r = 3;
//		long t = 5L;
//		double y = 5.8;
//		float u = 7;
//		char l = 'n';

		System.out.println("Integer = " + Integer.MAX_VALUE);
		System.out.println("Integer = " + Integer.MIN_VALUE);
		System.out.println("Byte = " + Byte.MAX_VALUE);
		System.out.println("Byte = " + Byte.MIN_VALUE);
		System.out.println("Short = " + Short.MAX_VALUE);
		System.out.println("Short = " + Short.MIN_VALUE);
		System.out.println("Long = " + Long.MAX_VALUE);
		System.out.println("Long = " + Long.MIN_VALUE);
		System.out.println("Double = " + Double.MAX_VALUE);
		System.out.println("Double = " + Double.MIN_VALUE);
		System.out.println("Float = " + Float.MAX_VALUE);
		System.out.println("Float = " + Float.MIN_VALUE);

		int[] arr = { 1, 3, 5, 7, 9, 0, 10, 123, 144 };
		int min = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("The min. value is : " + min);
		System.out.println("The max. value is : " + max);

		// first commit
	}

}