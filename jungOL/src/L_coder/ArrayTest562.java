package L_coder;

import java.util.Scanner;

public class ArrayTest562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 1; i < array.length; i += 2) {
			sum += array[i];
		}
		for (int i = 0; i < array.length; i += 2) {
			sum2 += array[i];
		}
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + sum2/5.0);
	}

}
