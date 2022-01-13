package L_coder;

import java.util.Scanner;

public class ArrayTest559 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] score = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		int i = sc.nextInt();
		int j = sc.nextInt();

		System.out.println(score[i - 1] + score[j - 1]);
	}

}
