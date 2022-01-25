package basic;

import java.util.Scanner;

public class Max_2562 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		int max = 0;
		int idx = 0;
		int[] num = new int[9];
		for (int i = 0; i < 9; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if(num[i]>max) {
				max = num[i];
				idx = i+1;
			}
			
		}
		
		System.out.println(max);
		System.out.println(idx);
	}

}
